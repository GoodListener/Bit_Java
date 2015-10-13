package coding_game;

public class Pyramid {

  static int n = 10 ;
  static int[][] M = new int[n][n];
  public static void main(String[] args) {

    for (int i = 0; i < n; i++) {  // n 열
      print(n-2);
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(M[i][j]);
      }
      System.out.println();
    }
  }
  
  public static void print(int no) {
    for(int i = 0; i < no; i++) {
      M[0][i] = 1;  // 11111111 맨 윗줄
      M[no-1][i] = 1; //1111111 맨 마지막 줄
    }
    for(int i = 1; i < no-(2-1); i++) {
      M[i][0] = no-(no-1);
      M[i][no-1] = no-(no-1);
    }
  }
}