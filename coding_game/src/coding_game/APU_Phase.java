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
      phase[i] = line.toCharArray();
      answer[i] = "";
    }

    int check = 0;
    int ver = 0;

    for(int i = 0; i <height; i++) {

      for(int j = 0; j < width; j++) {
        if (phase[i][j] == '0' && check == 0) {
          answer[i] = (answer[i] + j + " " + i);
          check++;
          ver = j;// j 값 기록
        }

        else if (phase[i][j] == '0' && check == 1) {
          answer[i] = (answer[i] + " " + j + " " + i);
          check++;
        }//하나값 입력되면 check 1증가 0을 첫번째 줄 0을 찾았다면
        //생략가능한가.. 
        else if(phase[i][j] == '.' && check == 0 && j < width-1) {
        }

        else if (phase[i][j]== '.' && check == 1 && j < width-1) {
        }

        else if (phase[i][j]=='.' && check == 0 && j == width-1) {
        }

        else if (phase[i][j] == '.' && check == 1 && j == width-1) {
          answer[i] = (answer[i] + " -1 -1");
          check++;
        }
        if(check == 2) {
          for (int k = i; k < height ; k++) {
            if(phase[k][ver] == '0' && k < height-1) {
              answer[i] = (answer[i] + " " + ver + " " + k);
            }
            else if(phase[k][ver] == '.' && k == height-1) {
              answer[i] = (answer[i] + " -1 -1");
            }
          }
        }//세로줄
      }//j 루프
      check = 0;
      
      System.out.print(answer[i]);
    }
  }
}