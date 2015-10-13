package algorithm.ex0;

public class Test {

  public static void main(String[] args) {
    System.out.println(tripleMax(5,5,9));
    
    
  }

  
  static int tripleMax (int a, int b, int c) {
    int max;
    if (a < b){
      if (b < c)
        max = c;
      else
        max = b;
    }
    else {
      if (a < c)
        max = c;
      else
        max = a;
    }
    return max;
  }
}
