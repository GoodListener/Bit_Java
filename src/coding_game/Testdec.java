package coding_game;

import java.util.Scanner;

public class Testdec {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int num[] = new int[N/10];
    for (int i = 0; i < N; i++) {
      int pi = in.nextInt();
      for (int j = 9; j > 0; j--){
        if (j == (pi / (int)Math.pow(10, 6))) {
          if(j == ((pi%1000000) / (int)Math.pow(10, 5))) {
            if(j == (pi%100000 / (int)Math.pow(10, 4))) {
              if (j == (pi%10000 / (int)Math.pow(10, 3))) {
                System.out.println(pi);
              }
            }
          }
        }
      }
    }
  }
}