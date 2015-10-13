package coding_game;

import java.util.Scanner;

class Testif {

  public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int width = in.nextInt(); // the number of cells on the X axis
      in.nextLine();
      int height = in.nextInt(); // the number of cells on the Y axis
      in.nextLine();
      String line;
      for (int i = 0; i < height; i++) {
          line = in.nextLine(); // width characters, each either 0 or .
          
      }
      
      for (int i = 0; i <height; i++) {
        
      }


      System.out.println("0 0 1 0 0 1"); // Three coordinates: a node, its right neighbor, its bottom neighbor
  }
}