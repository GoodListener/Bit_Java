package upgrade_v02;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuControl<E> {
  Scanner scanner = new Scanner(System.in);
  ArrayList<E> arrayList = new ArrayList<E>();
  public MenuControl() {}
  
  public MenuControl(Scanner scanner) {
    this.scanner = scanner;
  }
  
  public abstract void service();
  
}
