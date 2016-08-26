
package pkg30daysofcode;
import java.util.Scanner;

/**
 * "Tasks:
 * Write a factorial function that takes a positive integer, 'N' as
 * a parameter and prints the result of N!(N factorial)."
 * @author Samantha
 */

public class day9_recursion {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int result = factorial(n);
    System.out.println(result);
  }
    
  public static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n-1);
    }
    else {
      return 1;
    }
  }
}
