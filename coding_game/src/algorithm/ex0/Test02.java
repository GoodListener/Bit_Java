package algorithm.ex0;

public class Test02 {
  static int[] a = new int[10];
  static int head = 0, tail = 0;
  static int queueSize = 0;

  public static void main(String[] args) {
    
    
  }



  public static void enqueue(int n) {
    if (queueSize == a.length)
      System.out.println("Queue full");
    else {
      a[head] = n;
      head = (head+1) % a.length;
      queueSize++;
    }
  }

  public static int dequeue() {
    int r;
    if (queueSize == 0) {
      return 0;
    }
    r = a[tail];
    tail = (tail+1) % a.length;
    queueSize--;
    return r;
  }
}
