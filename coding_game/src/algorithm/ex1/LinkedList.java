package algorithm.ex1;


public class LinkedList {
  private Bucket start;
  private Bucket end;   // 더블링크리스트일때 start end 2개씩 있어야 하는지..
  private int length;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public int addFirst(Object value) {  // 링크리스트 끝에 추가
    end.setValue(value);
    end.setPrev(end);
    end.setNext(new Bucket());
    end = end.getNext();
    length++;
    return 0;
  }
  
  public int addLast(Object value) { // 앞으로 나가기 start 데리고
    start.setValue(value);
    start.setNext(start);
    start.setPrev(new Bucket());
    start = start.getPrev();
    length++;
    return 0;
  }

  public Object get(int index) {     // 링크리스트 탐색
    if (index < 0 || index > length)
      return null;

    int pos = 0;
    Bucket cursor = start;
    while (pos < index) {
      cursor = cursor.getNext();
      pos++;
    }

    return cursor.getValue();
  }

  public Object remove(int index) { 
    if (index < 0 || index > length)
      return null;
    
    Object removedValue = null;
    length--;
    
    if (index == 0) {
      removedValue = start.getValue();
      start = start.getNext();
      return removedValue;
    }
    else if (index == length) {
      removedValue = end.getValue();
      end = end.getPrev();
      return removedValue;
    }
    
    int pos = 0;
    Bucket cursor = start;
    
    while (pos < index-1) {
      cursor = cursor.getNext();
      pos++;
    }
      removedValue = cursor.getNext().getValue();
      cursor.setNext(cursor.getNext().getNext());
    
    return removedValue;
  }

  
  public int size() {
    return length;
  }
  
  
  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.addFirst(0);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.addFirst(6);
    list.addFirst(7);

    
    
    System.out.println(list.remove(6));
    System.out.println(list.remove(1));
    System.out.println(list.remove(3));
    System.out.println(list.remove(1));
    System.out.println(list.remove(1));
    System.out.println(list.remove(1));
    
    
  }
}
