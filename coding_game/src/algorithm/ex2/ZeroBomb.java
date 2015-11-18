package algorithm.ex2;

public class ZeroBomb {
  static int[][] map = {{7,2,0,2,3},{4,5,6,7,4},{1,0,9,3,2},{1,4,4,3,2},{1,2,2,3,0},{1,1,2,5,2}};   
  static int row = 5;
  static int column = 6; //초기값

  public static void main(String[] args) {
    int[][] cloneMap = new int[column][row]; 
    
    for (int i = 0; i < column; i++) {
      for (int j = 0; j < row; j++) {
        if (map[i][j] == 0) {
         cloneMap[i][j] = 1;
        }
      }
    }
    
    for (int i = 0; i < column; i++) {
      for (int j = 0; j < row; j++) {
        if (cloneMap[i][j]==1) {
          bomb(i,j);
        }
      }
    }
    
    for(int i = 0; i < column; i++) {
      for(int j = 0; j < row; j++) {
        System.out.print(map[i][j]);
      }
      System.out.println();
    }
    
    
  }
  
  public static void bomb(int i, int j) {
     for (int n = 0; n < row; n++) { // row:3
       map[i][n] = 0; // (0 0) (0 1) (0 2)
     }
     for (int m = 0; m < column; m++) {
       map[m][j] = 0;
     }
  }
  
  
}
