
package pkg30daysofcode;
import java.util.Scanner;

/**
 * "Tasks:
 * Given an integer, 'n', print its first 10 multiples. Each multiple 'n' x 'i'
 * (where 1<='i'<=10) should be printed on a new line in the form:
 * N x i = result."
 * @author Samantha
 */
public class day5_loops {
  public static void main(String[] args) {
   /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    keyboard.close();
    for(int i = 1; i <= 10; i++) {
      int product = n * i;
      System.out.println(n + " x " + i + " = " + product);
    }
  }
}
