package pms.dao;

import java.util.List;
import java.util.Map;

import pms.domain.Restaurant;

public interface RestaurantDao {
  public List<Restaurant> selectList(Map<String, Object> paramMap);
  public int insert(Restaurant restaurant);
  public int delete(int no);
  public int update(Restaurant restaurant);
  public Restaurant selectOne(int no);
  public List<Restaurant> searchList(Map<String, Object> paramMap);
  public int plusStar(Restaurant restaurant);
  public void updateStar();
}

