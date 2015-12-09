package pms.util;

import java.util.List;

import pms.domain.Restaurant;

public class RankHelper {
  
  public static void rank(List<Restaurant> list){
    
    for (Restaurant rest : list) {
      if (rest.getFloatstar() == 0) {
        rest.setRank(0);
      }
      
      
      
    }
    
  }
  
}
