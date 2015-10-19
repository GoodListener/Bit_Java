package algorithm.ex0;

public class Test01 {
  static int[] a = new int[10];
  static int head = 0, tail = 0;
  
  
  public static void main(String[] args) {
    enqueue(5);
    dequeue();
    System.out.println(dequeue());
  }
  
  
  
  public static void enqueue(int n) {
    if(head < a.length)
      a[head++] = n;
    else
      System.out.println("full queue");
  }

  public static int dequeue() {
    if(tail < head)
      return a[tail++];
    else
      return -1;
  }
}