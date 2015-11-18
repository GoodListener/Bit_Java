package algorithm.ex1;

public class Graycode {
  static int[] code = new int[200];
  
  public static void printCode(int[] code, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(code[i]);
    }
    System.out.println();
  }
  
  public static void gray (int[] code, int n, int index) {
    if (index == n) {
      printCode(code, n);
      return;
    }
    
    code[index] = 0;
    gray(code, n, index+1);
    code[index] = 1;
    reverse(code, n, index+1);
  }
  
  public static void reverse (int[] code, int n, int index) {
    if (index == n) {
      printCode(code, n);
      return;
    }
    
    code[index] = 1;
    gray(code, n, index+1);
    code[index] = 0;
    gray(code, n, index+1);
  }
  
  public static void main(String[] args) {
    gray(code, 10, 0); // 
  }
}




