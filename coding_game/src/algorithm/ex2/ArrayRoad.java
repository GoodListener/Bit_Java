package algorithm.ex2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArrayRoad {
  static int[][] map2 = new int[5][5];
  
  public static void main(String[] args) {
    String[][] map = new String[5][5]; 
    try {
      BufferedReader file = new BufferedReader(new FileReader("./data/road1.txt"));
      String line = null;
      String[] road = null;
      int count = 0;
      while ((line = file.readLine()) != null) {
        road = line.split("\\.");
        for (int i = 0; i < road.length; i++) {
          map[count][i] = road[i];
        } count++;
      }
      for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
          map2[i][j] = Integer.parseInt(map[i][j]);
        }
      }
      
      System.out.println(path(4,4));
      file.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static int path(int m, int n) {
    if (map2[m][n] == 0)
      return 0;
    if (m == 0 && n == 0) 
      return 1;
    
    return ((m > 0) ? path(m - 1, n) : 0) + ((n > 0) ? path(m, n - 1) : 0);
  }
  
  
}