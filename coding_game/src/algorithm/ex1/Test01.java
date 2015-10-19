package algorithm.ex1;

import java.util.LinkedList;

public class Test01 {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(1);
    list.addLast(2);
    list.addFirst(3);
    list.addFirst(4);
    for(int i = 0; i < 4; i++) {
      System.out.println(list.get(i));
      
    }
      
  }

}
