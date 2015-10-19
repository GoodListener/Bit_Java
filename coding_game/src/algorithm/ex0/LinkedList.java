package algorithm.ex0;

public class LinkedList {
  private Node head;
  private Node tail;
  private int size = 0;
  
  
  private class Node {
    private Object data;
    private Node next;
    
    public Node(Object input) {
      this.data = input;
      this.next = null;
    }
    
    public void addFirst(Object input) {
      Node newNode = new Node(input);
      newNode.next = head;
      head = newNode;
      size++;
      if(head.next == null){
          tail = head;
      }
    }
    
    public void enqueue(Object input) {
      Node newNode = new Node(input);
      newNode.next = head;
      
    }
    
  }
  
}