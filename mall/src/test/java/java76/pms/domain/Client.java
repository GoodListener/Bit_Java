package java76.pms.domain;

import java.io.Serializable;

public class Client implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected String  name;
  protected int     age;
  protected String  address;
  protected String  tel;
  protected String  id;
  protected String  password;
  
  public Client() {}
  
  public Client(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Client [name=" + name + ", age=" + age + ", address=" + address + ", tel=" + tel + ", id=" + id + ", password="
        + password + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
