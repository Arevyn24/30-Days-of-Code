
package pkg30daysofcode;
import java.util.Scanner;

/**
 *"Task:
 * Given an array, 'a', of 'n' integers, print 'A''s elements in reverse
 * order as a single line of space-separated numbers."
 * @author Samantha
 */
public class day7_arrays {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=(n-1);i>=0;i--){
      arr[i] = in.nextInt();
    }
    in.close();
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }   
}
