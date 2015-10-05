package coding_game;

import java.util.Scanner;

public class Mime {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(); // ext mt 수
    in.nextLine();
    int Q = in.nextInt(); // 파일 수
    in.nextLine();
    String str1[] = new String[N];
    String str2[] = new String[N];
    String str3[] = new String[Q];
    for (int i = 0; i < N; i++) {
      String EXT = in.next(); // 확장자 
      String MT = in.next(); // 설명 
      in.nextLine();
      str1[i] = EXT; // 파일 확장자가 배열 안에 다 들어갔다.
      str2[i] = MT; // MT 도 다 들어갔다. 같은 위치에 넣는 것은 같이 뽑기 위함
    }
    int add;
    for (int i = 0; i < Q; i++) {
      String FNAME = in.nextLine(); // One file name per line.
      if(FNAME.indexOf(".")==-1){
        str3[i] = "nothing";
      }
      else {
        str3[i] = FNAME.substring(FNAME.lastIndexOf(".")+1); // "."이후의 글자를 반환한다.
      }
    }
    int flag = -1;
    int j;
    for (int i = 0; i < Q; i++) { //파일 검색동안
      for(j = 0; j < N; j++){ //비교횟수
        if(str3[i].equalsIgnoreCase(str1[j])) { // .이후 글자와 확장자 비교 대소문자 비교X
          flag = 1;
          break;
        }
        else {
          flag = 0;
        }
      }
      if(flag == 1){
        System.out.println(str2[j]);
      }
      else if(flag == 0){
        System.out.println("UNKNOWN");
      }
    }
  }
}