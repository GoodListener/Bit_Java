package algorithm.ex1;

public class Bucket {
  protected Object value;
  protected Bucket next;
  protected Bucket prev;
  
  public Bucket() {}
  
  public Bucket(Object value) {
    this.value = value;
  }
  
  
  public Bucket(Object value, Bucket next, Bucket prev) {
    this(value);
    this.next = next;
    this.prev = prev;
  }
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }
  public Bucket getNext() {
    return next;
  }
  public void setNext(Bucket next) {
    this.next = next;
  }

  public Bucket getPrev() {
    return prev;
  }

  public void setPrev(Bucket prev) {
    this.prev = prev;
  }
  
  
  
}
