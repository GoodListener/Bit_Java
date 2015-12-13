package java76.pms.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java76.pms.dao.ItemDao;
import java76.pms.domain.Item;
import java76.pms.util.MultipartHelper;
import net.coobird.thumbnailator.Thumbnails;

@Controller
@RequestMapping("/item/*")
public class ItemController {
  public static final String SAVED_DIR = "/file";
  
  @Autowired ItemDao itemDao;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="asc") String align,
        HttpServletRequest request) throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    List<Item> items = itemDao.selectList(paramMap);

    request.setAttribute("items", items);

    return "item/ItemList";

  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "item/ItemForm";
  }
      
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add(Item item, MultipartFile photofile) throws Exception {

    if (photofile != null) {
      String newFileName = MultipartHelper.generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) 
                                 + "/" + newFileName);
      photofile.transferTo(attachfile);
      
      item.setPhoto(newFileName);
      
      makeThumbnailImage(
        servletContext.getRealPath(SAVED_DIR) + "/" + newFileName, 
        servletContext.getRealPath(SAVED_DIR) + "/s-" + newFileName + ".png");
    }
    
    itemDao.insert(item);

    return "redirect:list.do";

  }
  
  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {

    Item item = itemDao.selectOne(no);
    model.addAttribute("item", item);

    return "item/ItemDetail";
  }

  @RequestMapping(value="update", method=RequestMethod.POST)
  public String post(Item item, MultipartFile photofile, Model model) throws Exception {

    if (photofile.getSize() > 0) {
      String newFileName = MultipartHelper.generateFilename(photofile.getName());  
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) 
                                 + "/" + newFileName);
      photofile.transferTo(attachfile);
      item.setPhoto(newFileName);
      
      makeThumbnailImage(
          servletContext.getRealPath(SAVED_DIR) + "/" + newFileName, 
          servletContext.getRealPath(SAVED_DIR) + "/s-" + newFileName + ".png");
    } else if (item.getPhoto().length() == 0) {
      item.setPhoto(null);
    }
    
    if (itemDao.update(item) <= 0) {
      model.addAttribute("errorCode", "401");
      return "/item/ItemAuthError";
    } 

    return "redirect:list.do";
  }
  
  @RequestMapping("delete")
  public String delete(int no, Model model) throws Exception {

    if (itemDao.delete(no) <= 0) {
      model.addAttribute("errorCode", "401");
      return "/item/ItemAuthError";
    }
    return "redirect:list.do";
  }
  
  private void makeThumbnailImage(String originPath, String thumbPath) 
      throws IOException {
    Thumbnails.of(new File(originPath))
    .size(60,44)
    .outputFormat("png")
    .outputQuality(1.0)
    .toFile(new File(thumbPath));
  }
}
