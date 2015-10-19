package algorithm.ex1;

public class Choose {
  static final int MAX= 200;
  static long[][] memo = new long[MAX][MAX]; // static으로 해야지 재귀는 계속 접근 가능..
  
  static long choose (int n, int r) { // 그냥 nCr 의 값만 구하는
    if (n == r || r == 0) {
      return 1;
    }
    return choose (n-1 , r-1) + choose (n-1 , r);
  }  

  static long choose2 (int n, int r) { 
    // 메모라이즈 기법으로 재귀에서 나온 값을 memo에 저장한 후 계산결과를 빠르게 리턴하는 것. 중복계산을 없앰
    if (memo[n][r] > 0)
      return memo[n][r];
    
    if (n == r || r == 0) {
      return memo[n][r] = 1;
    }
    return memo[n][r] = choose2(n-1 , r-1) + choose2(n-1 , r);
  }
  
  public static void main(String[] args) {
    long start, end;
    start = System.currentTimeMillis();
    System.out.println("C1 : " + choose(50,10));
    end = System.currentTimeMillis();
    System.out.println(end - start);
    
    start = System.currentTimeMillis();
    System.out.println("C2 : " + choose2(100,50));
    end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
