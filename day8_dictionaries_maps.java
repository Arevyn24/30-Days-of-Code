
package pkg30daysofcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *"Tasks:
 * Given 'N' names and phone numbers, assemble a phone book that maps 
 * friends' names to their respective phone numbers. You will then be 
 * given an unknown number of names to query your phone book for; for 
 * each 'N' queried, print the associated entry from your phone book (in
 * the form 'name=phoneNumber') or 'Not found.' if there is no entry for 'name'."
 * @author Samantha
 */
public class day8_dictionaries_maps {
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    Map<String, Integer> map = new HashMap<String, Integer>();
    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      // Write code here
      map.put(name, phone);
    }
    while(in.hasNext()){
      String s = in.next();
      // Write code here
      if(map.containsKey(s)) {
        Integer phone = map.get(s);
        System.out.println(s+"="+phone);
      } else {
        System.out.println("Not found");
      }
    }
    in.close();
  }
}
