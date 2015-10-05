package coding_game;

import java.util.Scanner;

public class APU_Phase {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int width = 4;
    int height = 4;

    char[][] phase = new char[height][width];
    String[] answer = new String[height];
    for (int i = 0; i < height; i++) {
      if (i==0) {
        String line = "00.0";
        //\n000."; 
      }
      else if (i==1) {
     //   String line = "0.00";.0.0
      }
      else if (i==2) {
        String line = ".0.0";
      }
     // phase[i] = line.toCharArray();
    }
    System.out.println(phase[0]);
    
  }
}

  /*
   *  for(int j = 0; j < width; j++) {
        if (phase[i][j] == '0') {
          answer[i] = (answer[i] + i + " " + j);
          check++;
        }//하나값 입력되면 check 1증가
        else if(phase[i][j] == '.' && j <= width && check < 3) {

        }

        else if (phase[i][j]== '.' && j <= width && chech < 3) {
          answer[i] = answer[i] +"-1 -1";
        }

      }

      System.out.print(answer[i]);

   */