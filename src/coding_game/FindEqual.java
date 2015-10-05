package coding_game;

public class FindEqual {

  boolean findEqual(int[] sequence) {

    for (int i = 0; i < sequence.length; i++) {
      for (int j = i + 1; j < sequence.length; j++) {
        if (sequence[i] == sequence[j]) {
          return true;
        }
      }
    }
    return false;
  }
}
