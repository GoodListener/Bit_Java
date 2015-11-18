package algorithm.ex1;

public class PowerSigma {
  public static void main(String[] args) {
    nonReculsive(5,10);
    System.out.println(reculsive(5,5));
  }

  public static void nonReculsive(int n, int m) {
    int result = 0, a=1;
    for (int i = 1; i <= n; i++) {
      for (int k = 0; k < m; k++) {
        a=a*i;
      }
      result = result + a;
      a = 1;
    }
    System.out.println(result);
  }
  
  public static int reculsive(int n, int m) {
    int result = 0;
    if(m==1) {
      return result;
    }
    result = result + reculsive((int)Math.pow(n, m), m-1);
    
    return result;
    
  }
}
