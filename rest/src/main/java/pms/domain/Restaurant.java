package pms.domain;


public class Restaurant {
  protected int no;
  protected String name;
  protected String content;
  protected int rank;
  protected String location;
  protected int star;
  protected String photo;
  protected int countstar;
  protected int calcstar;
  protected float floatstar;
  
  
  @Override
  public String toString() {
    return "Restaurant [no=" + no + ", name=" + name + ", content=" + content + ", rank=" + rank + ", location="
        + location + ", star=" + star + ", photo=" + photo + "]";
  }
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public int getRank() {
    return rank;
  }
  public void setRank(int rank) {
    this.rank = rank;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public int getStar() {
    return star;
  }
  public void setStar(int star) {
    this.star = star;
  }
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public int getCountstar() {
    return countstar;
  }
  public void setCountstar(int countstar) {
    this.countstar = countstar;
  }
  public int getCalcstar() {
    return calcstar;
  }
  public void setCalcstar(int calcstar) {
    this.calcstar = calcstar;
  }
  public float getFloatstar() {
    return floatstar;
  }
  public void setFloatstar(float floatstar) {
    this.floatstar = floatstar;
  }
  
  
  
  
}






