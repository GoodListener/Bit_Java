package coding_game;

import java.util.Scanner;

public class Defibrillators {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String LON = in.next();
    in.nextLine();
    String LAT = in.next();
    in.nextLine();
    int N = in.nextInt();
    in.nextLine();
    
    String[] cut6 = null;
    
    if(LON.length()<13) {
      LON = LON + "00000000";
    }
    if(LAT.length()<12) {
      LAT = LAT + "0000000";
    }
    
    long lonA = Long.parseLong(LON.substring(2)); //원래좌표
    long latA = Long.parseLong(LAT.substring(3)); 
    long lonB, latB, x , y;
    
    long distance[] = new long[N];
    long distMin= Long.MAX_VALUE;
    
    int index = 0;
    
    String defib[] = new String[N];
    
    String result[] = new String[6];
    
    
    for (int i = 0; i < N; i++) {
      String DEFIB = in.nextLine();
      defib[i] = DEFIB;
      cut6 = DEFIB.split(";");  // cut6[0~5]에 자른 조각들이 있음 
      cut6[4] = cut6[4].substring(2);
      cut6[5] = cut6[5].substring(3);
      lonB = Long.parseLong(cut6[4]); // 새좌표
      latB = Long.parseLong(cut6[5]);
      x = (long) ((lonB - lonA)*Math.cos((latA + latB)/2));
      y = latB - latA;
      distance[i] = (long)(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)))*6371;
    }
    for (int i = 0; i < N; i++) {
      distMin = Math.min(distance[i], distMin);
    }
    for (int i = 0; i < N; i++) {
      if(distMin == distance[i]) {
        index = i;
      }
    }
    result = defib[index].split(";");
    System.out.println(result[1]);
    
  }
}