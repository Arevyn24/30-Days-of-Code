
package pkg30daysofcode;
import java.util.Scanner;

/**
 * "Tasks: 
 * 1. Declare  variables: one of type int, one of type double, and one of type 
 *    String.
 * 2. Read  lines of input from stdin (according to the sequence given in the
 *    Input Format section below) and initialize your variables.
 * 3. Use the (+) operator to perform the following operations: 
 *    a.Print the sum of "i" plus your int variable on a new line.
 *    b.Print the sum of "d" plus your double variable to a scale of one 
 *      decimal place on a new line.
 *    c.Concatenate "s" with the string you read as input and print the result 
 * on a new line."
 * @author Samantha
 */
public class day1_data_types {
  
  public static void main(String[] args) {
  
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);
      /* Declare second integer, double, and String variables. */
    String str = "";
    /* Read and save an integer, double, and String to your variables.*/
    int x = scan.nextInt();
    double dub = scan.nextDouble();
    while(scan.hasNext()) {
        str += scan.nextLine();
    }

    /* Print the sum of both integer variables on a new line. */
    System.out.println(i + x);

    /* Print the sum of the double variables on a new line. */
            System.out.println(d + dub);

    /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
    s = s + str;
    System.out.println(s);
  }
}
