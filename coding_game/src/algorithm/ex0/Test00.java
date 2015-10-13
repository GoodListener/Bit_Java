package algorithm.ex0;

public class Test00 {
  int a, b;
  public static void main(String[] args) {
    System.out.println(tripleMax(5,5,9));
    int[] a = new int[13];
    a[0] = 5;
    a[1] = 7;
    swap(a);
    System.out.printf("%d, %d\n",a[0], a[1]);
    for (int i = 0; i < 13; i++){
      a[i] = i;
    }
    for (int i : a) {
      System.out.print(i + " ");
    }
    rotateRight(a, 2, 9);
    System.out.println();
    for (int i : a) {
      System.out.print(i + " ");
    }
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
  
  static void swap (int[] a) {
    int temp = a[0];
    a[0] = a[1];
    a[1] = temp;
  }

  static void rotateRight (int[] a, int s, int t) {   // 1 2 3 4   =>  4 1 2 3
    int temp;
    temp = a[s];
    a[s] = a[t];
    for(int i = t; i < s; i--) {
      a[i] = a[i+1];
    }
    a[t] = temp;
  }
  
  static void rotateRight (int[] a) {
    
  }
}
