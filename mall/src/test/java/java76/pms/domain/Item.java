package java76.pms.domain;

import java.io.Serializable;

public class Item  implements Serializable {
  private static final long serialVersionUID = 1L;

  protected int       no;
  protected String    product;
  protected String    sort;
  protected int       price;
  protected int       amount;
  protected String    brand;
  protected String    photo; 
  protected String    content;
  
  public Item() {}

  @Override
  public String toString() {
    return "Item [no=" + no + ", product=" + product+ ", sort=" + sort + ", price=" + price + ", amount=" + amount
        + ", brand=" + brand + ", photo=" + photo + ", content=" + content + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
