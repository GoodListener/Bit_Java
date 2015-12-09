package pms.util;

import java.util.List;

import pms.dao.RestaurantDao;
import pms.domain.Restaurant;

public class RankHelper {

  public static List<Restaurant> getRank(List<Restaurant> list){
    for (Restaurant rest : list) {
      rest.setRank(1);
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i) != rest) {
          if (list.get(i).getFloatstar() >= rest.getFloatstar()) {
            rest.setRank(rest.getRank()+1);
          }
        }
      }
    }
    return list;
  }

  public static void setRank(List<Restaurant> list, RestaurantDao restaurantDao) {
    for (Restaurant rest : list) {
      restaurantDao.updateRank(rest);
    }
    
  }
}