package coding_game;

import java.util.Scanner;

public class APU_Phase {
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int width = in.nextInt(); // the number of cells on the X axis
    in.nextLine();
    int height = in.nextInt(); // the number of cells on the Y axis
    in.nextLine();

    char[][] phase = new char[width][height];
    String[] answer = new String[height];
    
    for (int i = 0; i < height; i++) {
      String line = in.nextLine(); // width characters, each either 0 or .
      
      // 2차원 배열
      // width 가로
      // height 세로
      // 00
      // 0.
      for(int j = 0; j < width; j++) {
        phase[i] = line.toCharArray();
        if(phase[i][j] == '0'){
          answer[i] = (i + " " + j);
        }
          
      }
      
      System.out.print(answer[i]);

    }
  }
}
