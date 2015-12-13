package java76.pms.dao;

import java.util.List;
import java.util.Map;

import java76.pms.domain.Client;

public interface ClientDao {

  List<Client> selectList(Map<String,Object> paramMap);

  int insert(Client client);
  
  int delete(String id);
  
  int update(Client client);
  
  Client selectOne(String id);
  
  Client login(Map<String,Object> paramMap);
}







