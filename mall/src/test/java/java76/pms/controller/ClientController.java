package java76.pms.controller;

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

import java76.pms.dao.ClientDao;
import java76.pms.domain.Client;

@Controller
@RequestMapping("/client/*")
public class ClientController {  
  
  @Autowired ClientDao clientDao;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="id") String keyword,
      @RequestParam(defaultValue="desc") String align,
      HttpServletRequest request) throws Exception {
    
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    List<Client> clients = clientDao.selectList(paramMap);
    
    request.setAttribute("clients", clients);
    
    return "client/ClientList";
  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "client/ClientForm";
  }
      
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add(
      Client client, HttpServletRequest request) throws Exception {
    
    clientDao.insert(client); 

    return "redirect:list.do";
  }
  
  @RequestMapping("detail")
  public String detail(String id, Model model) throws Exception {
    
    Client client = clientDao.selectOne(id);
    model.addAttribute("client", client);
    
    return "/client/ClientDetail";
  }

  @RequestMapping(value="update", method=RequestMethod.POST)
  public String update(Client client, Model model) throws Exception {
 
    if (clientDao.update(client) <= 0) {
      model.addAttribute("errorCode", "401");
      return "/client/ClientAuthError";
    } 

    return "redirect:list.do";

  }
  
  @RequestMapping("delete")
  public String delete(String id, Model model) throws Exception {

    if (clientDao.delete(id) <= 0) {
      model.addAttribute("errorCode", "401");
      return "/client/ClientAuthError";
    } 

    return "redirect:list.do";
  }
}
