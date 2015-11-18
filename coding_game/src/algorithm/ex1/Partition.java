package algorithm.ex1;

public class Partition {
  static int[][] memo = new int[200][200];
  public static void main(String[] args) {
    System.out.print(part2(10,5));
  }
  
  public static int part(int n, int m) {
    int count = 0;
    
    if (n < m)
      m = n;
    if (n == 0)
      return 1;
    
    for (int i = 1; i <= m; i++) {
      count += part(n-i, i);
    }
    return count;
  }
  
  public static int part2(int n, int m) {
    int count = 0;
    
    
    if (n < m) {
      m = n;
    }
    if (memo[n][m] > 0) {
      return memo[n][m];
    }
    if (n == 0)
      return memo[n][m] = 1;
    
    for (int i = 1; i <= m; i++) {
      count += part2(n - i, i);
    }
    return memo[n][m] = count;
  }
}
