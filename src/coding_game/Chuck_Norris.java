package coding_game;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Chuck_Norris {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String MESSAGE = in.nextLine();  // Chuck Norris' keyboard has 2 keys: 0 and white space.

    char[] ch = new char[MESSAGE.length()];
    ch = MESSAGE.toCharArray();
    int check = -1;
    String strComplite = "";
    
    for(int k = 0; k<MESSAGE.length(); k++){
      String str = Integer.toBinaryString(ch[k]); //엄청 긴 바이너리를 커버하거나..
      if(str.length()==6)
        str = "0" + str;
      else if(str.length()==5)
        str = "00" + str;


      char[] chArray = new char[str.length()];
      // str = "1000011" , "0000001" 이런걸로 만들려면 어떻게?
      // "1" = "0 0"
      // "0000" = "00 0000"

      //for(int j = 0; j < MESSAGE.length(); j++){
      for(int i = 0; i < str.length(); i++) {
        chArray[i] = str.charAt(i); // 1 0 0 0 0 1 1
        if (chArray[i] =='1' && check == -1) {
          strComplite += "0 0";
          check = 1;
        }
        else if (chArray[i] == '0' && check == -1) {
          strComplite += "00 0";
          check = 0;
        }
        else if (chArray[i] == '1' && check == 0) {  // 1일 경우 0 0 부터 쓰기
          strComplite += " 0 0";
          check = 1;
        }
        else if (chArray[i] == '1' && check == 1) {
          strComplite += "0";
          check = 1;
        }
        else if (chArray[i] == '0' && check == 1) {
          strComplite += " 00 0";
          check = 0;
        }
        else if (chArray[i] == '0' && check == 0) {
          strComplite += "0";
          check = 0;
        }
      }
    }
    System.out.println(strComplite);
  }
}