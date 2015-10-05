package coding_game;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class ASCII {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        in.nextLine();
        int h = in.nextInt();
        in.nextLine();

        String t = in.nextLine();
        
        //ABC 숫자 찾기 연속M의 숫자 찾고 A 숫자 또 찾고
        // E
        char[] c = new char[t.length()];
        c = t.toCharArray();
        int[] st = new int[t.length()]; 
        int[] ed = new int[t.length()];
        for (int i = 0; i < t.length(); i++) {
          if(c[i] == '@'){
            st[i] = 26*l;
            ed[i] = 27*l;
          }
          
          else if(c[i]-97 < 0) {
            st[i] = (c[i] - 65)*l;
            ed[i] = (c[i] - 65)*l + l;
          }
          else {
            st[i] = (c[i] - 97)*l;
            ed[i] = (c[i] - 97)*l + l;
          }
        }
        for(int j = 0; j < h; j++) {
          String rOW = in.nextLine();
          for(int i = 0; i < t.length(); i++) {
            System.out.print(rOW.substring(st[i], ed[i]));
          }
          System.out.println();
        } // A 그리기
    }
}
/* int[] start = new int[10];
        
 * for(int i = 0; i < 10; i++) {
  start[i] = c[i]-65;
}
*/ //인트형 숫자로 바꾸기