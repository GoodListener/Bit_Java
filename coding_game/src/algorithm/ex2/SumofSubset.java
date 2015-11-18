package algorithm.ex2;

public class SumofSubset {

  public static void main(String[] args) {
    int[] subset = {2, 4, 6, 9, 12, 14, 15};
    
    
    System.out.println(subsetSum(subset, 7, 32));
    
  }
  
  public static int subsetSum (int[] subset, int n, int m) {
    
    if (n == 0) {
      if (m == 0) {
        return 1;
      } else {
        return 0;
      }
    }
    
    return Math.max(subsetSum(subset, n-1, m - subset[n-1]), subsetSum(subset, n-1, m));
  }
}
