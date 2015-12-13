package java76.pms.dao;

import java.util.List;
import java.util.Map;

import java76.pms.domain.Item;

public interface ItemDao {
  List<Item> selectList(Map<String,Object> paramMap);

  int insert(Item item);

  int delete(int no);
  
  int update(Item item);

  Item selectOne(int no); 
}