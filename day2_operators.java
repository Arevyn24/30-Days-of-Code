
package pkg30daysofcode;
import java.util.Scanner;

/**
 * "Tasks:
 * Given the meal price (base cost of a meal), tip percent (the percentage of
 * the meal price being added as tip), and tax percent (the percentage of the
 * meal price being added as tax) for a meal, find and print the meal's total
 * cost.
 * 
 * Note: Be sure to use precise values for your calculations, or you may end up
 * with an incorrectly rounded result!"
 * @author Samantha
 */

public class day2_operators {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = ((double)tipPercent/100) * mealCost;
        double tax = ((double)taxPercent/100) * mealCost;
        double total = mealCost + tip + tax;
        
        int totalCost = (int) Math.round(total);
        String msg = "The total meal cost is " + totalCost + " dollars.";
        // Print your result
        System.out.println(msg);
  }
}
