package coding_game;

public class Longword {
  String longestWord(String text) {

    char[] chars = text.toCharArray();
    String answer = "";
    StringBuilder current = new StringBuilder();

    for (int i = 0; i < chars.length; i++) {
      if ('a' <= chars[i] && chars[i] <= 'z'
          || 'A' <= chars[i] && chars[i] <= 'Z') {
        current.append(chars[i]);
        if (current.length() > answer.length()) {
          answer = current.toString();
        }
      } else {
        current = new StringBuilder();
      }
    }

    return answer;
  }

}
