package algorithm.ex2;

public class MaxReturn {
  int[][] maxReturn = new int[100][100];
  int[][] profit = new int[100][100];
  
  void calculateReturn (int n, int m) {
    int max, temp;
    for (int i = 0; i <= m; i++) {
      maxReturn[0][i] = profit[0][i];
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        max = -1;
        for (int k = 0; k <= j; k++) {
          temp = maxReturn[i-1][k] + profit[i][j-k];
          if (temp > max)
            max = temp;
        }
        maxReturn[i][j] = max;
      }
    }
    
    
  }
  
  public static void main(String[] args) {
    // 값 입력
    }
}
