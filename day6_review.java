
package pkg30daysofcode;
import java.util.Scanner;

/**
 * "Task:
 * Given a string, 's', of length 'n' that is indexed from 0 to 'n'-1, 
 * print its even-indexed and odd-indexed characters as 2 space-separated
 * strings on a single line."
 * @author Samantha
 */

public class day6_review {
  public static void main(String[] args){
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    Scanner kb = new Scanner(System.in);
    int t = kb.nextInt();

    for(int i = 0; i < t; i++) {
      String str = kb.next();
      printOdd(str);
      System.out.print(" ");
      printEven(str);
      System.out.print("\n");
    }
    kb.close();
   }
    
  public static void printOdd(String str) {
    for(int i = 0; i < str.length(); i = i+2) {
      System.out.print(str.charAt(i));
    }
  }

  public static void printEven(String str) {
    for(int i = 1; i < str.length(); i = i+2) {
       System.out.print(str.charAt(i));
    }
  }
}

