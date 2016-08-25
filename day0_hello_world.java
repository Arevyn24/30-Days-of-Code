
package pkg30daysofcode;
import java.util.Scanner;


/**
 * "To complete this challenge, you must save a line of input 
 * from stdin to a variable, print Hello, World. on a single line, 
 * and finally print the value of your variable on a second line."
 * 
 * @author Samantha
 */

public class day0_hello_world {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    
    String inputString = scan.nextLine(); 

    scan.close(); 

    System.out.println("Hello, World.\n" + inputString);
  }
}
