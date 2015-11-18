package algorithm.ex2;

public class Rotation90 {

  public static void main(String[] args) {
    int[][] picture = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int[] memory = new int[picture.length * picture.length]; // 9칸짜리
    int count = 0;

    for (int i = 0; i < picture.length; i++) {
      for (int j = 0; j < picture.length; j++) {
        memory[count] = picture[i][j];
        count++;
      }
    }

    count = 0;
    for (int j = picture.length-1; j >= 0; j--) { // 2 1 0
      for (int i = 0; i < picture.length; i++) {  // 0 1 2
        picture[i][j] = memory[count];
        count++;
      }
    }

    for (int i = 0; i < picture.length; i++) {
      for (int j = 0; j < picture.length; j++) {
        System.out.print(" " + picture[i][j]);
      }
    }


  }
}
