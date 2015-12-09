package pms.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pms.dao.RestaurantDao;
import pms.domain.Restaurant;
import pms.util.MultipartHelper;

@Controller
@RequestMapping("/restaurant/*")
public class RestaurantController {  
  public final static String SAVED_DIR = "/file";
  @Autowired RestaurantDao restaurantDao;
  @Autowired ServletContext servletContext;

  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);

    List<Restaurant> restaurants = restaurantDao.selectList(paramMap);

    request.setAttribute("restaurants", restaurants);

    return "restaurant/RestaurantList";
  }
  

  @RequestMapping(value="add", method=RequestMethod.GET)
  public String add() {
    
    return "restaurant/RestaurantForm";
  }
  
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add (Restaurant restaurant, MultipartFile file) 
          throws Exception {

    if (file.getSize() > 0) {
      String newFileName = MultipartHelper.generateFilename(file.getOriginalFilename());
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) + "/" + newFileName);
      file.transferTo(attachfile);
      restaurant.setPhoto(newFileName);
    }

    restaurantDao.insert(restaurant);

    return "redirect:list.do";
  }

  

  @RequestMapping("detail")
  public String detail(int no, Model model) 
          throws Exception {
    Restaurant restaurant = restaurantDao.selectOne(no);
    model.addAttribute("restaurant", restaurant);
    return "restaurant/RestaurantDetail";
  }

  @RequestMapping(value="update", method=RequestMethod.GET)
  public String update(int no, Model model) 
      throws Exception {
    Restaurant restaurant = restaurantDao.selectOne(no);
    model.addAttribute("restaurant", restaurant);
    return "restaurant/RestaurantUpdate";
  }
  
  @RequestMapping(value="update", method=RequestMethod.POST)
  public String update(
      Restaurant restaurant,
      MultipartFile file,
      Model model) throws Exception {

    if (file.getSize() > 0) {  //새로 업로드 한 파일이 있다.
      String newFileName = MultipartHelper.generateFilename(file.getOriginalFilename());
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) + "/" + newFileName);
      file.transferTo(attachfile);
      restaurant.setPhoto(newFileName);
    } else if (restaurant.getPhoto().length() == 0) {
      restaurant.setPhoto(null);
    }
    
    if (restaurantDao.update(restaurant) <= 0) {
      model.addAttribute("errorCode", "401");
      return "restaurant/RestaurantAuthError";
    } 
    return "redirect:list.do";
  }

  
  @RequestMapping("delete")
  public String delete(
      int no, 
      Model model) throws Exception {

    if (restaurantDao.delete(no) <= 0) {
      model.addAttribute("errorCode", "401");
      return "restaurant/RestaurantAuthError";
    } 
    return "redirect:list.do";
  }
  
  @RequestMapping("search")
  public String search(
      String word,
      HttpServletRequest request) throws Exception {
    
    List<Restaurant> findRestaurants = restaurantDao.searchList(word);

    request.setAttribute("findRestaurants", findRestaurants);
    return "restaurant/FindRestaurantList";
  }
  
}
