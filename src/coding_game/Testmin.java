package coding_game;

public class Testmin {
  public static void main(String[] args) {
    
    int x[] = {3,2,1,7,6,5,4,15,20,33};
    int y[] = {5,4,7,2,5,12,65,23,4,3};
    
    int minX=Integer.MAX_VALUE;
    int minY=Integer.MAX_VALUE;
    int indexX = 0;
    int indexY = 0;
    
    for (int i = 0; i < 10; i++) {
      minX = Math.min(x[i] , minX);
      minY = Math.min(y[i] , minY);
    }
    for (int i = 0; i < 10; i++) {
      if(x[i] == minX)
        indexX = i;
      if(y[i]==minY)
        indexY = i;
    }
  }
}
// x의 가장 작은 값 1
// y는 2 
// 그 인덱스를 반환
// 
