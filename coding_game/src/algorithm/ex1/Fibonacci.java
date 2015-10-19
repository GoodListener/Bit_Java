package algorithm.ex1;

public class Fibonacci {
  static final int MAX = 1001;
  static long[] memo = new long[MAX];
  
  public long fibo(int n) {
    if (n == 1 || n == 2)
      return 1;
    else
      return fibo(n-1) + fibo(n-2);
  }
  
  public long fibo2(int n) {
    if (memo[n] > 0)
      return memo[n];
    if (n == 1 || n == 2)
      return memo[n] = 1;
    else
      return memo[n] = fibo2(n-1) + fibo2(n-2);
  }
  
  
  public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    long start, end;

    start = System.currentTimeMillis();
    System.out.println(f.fibo(35));   // 일반적인 피보나치는 40개부터 느려짐
    end = System.currentTimeMillis();
    System.out.println(end - start);
    
    start = System.currentTimeMillis();
    System.out.println(f.fibo2(1000));   // 1000개를 넣어도 안느려짐
    end = System.currentTimeMillis();    // memo[] 
    System.out.println(end - start);
 
  }
}