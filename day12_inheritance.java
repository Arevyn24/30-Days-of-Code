
package pkg30daysofcode;
import java.util.Scanner;

/**
 *"Tasks:
 * You are given two classes, Person and Student, where Person 
 * is the base class and Student is the derived class. Completed
 * code for Person and a declaration for Student are provided for
 * you in the editor. Observe that Student inherits all the properties
 * of Person.
 *
 * Complete the Student class by writing the following:
 * 1.A Student class constructor, which has 4 parameters:
 *   a.A string, 'firstName'.
 *   b.A string, 'lastName'.
 *   c.An integer, 'id'.
 *   d.An integer array (or vector) of test scores, 'scores'.
 * 2.A char calculate() method that calculates a Student object's 
 * average and returns the grade character representative of their
 * calculated average"
 * @author Samantha
 */

public class day12_inheritance {
  
  static class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
      this.firstName = firstName;
      this.lastName = lastName;
      this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
      System.out.println(
             "Name: " + lastName + ", " + firstName 
             + 	"\nID: " + idNumber); 
    }    	
  }
  
  static class Student extends Person{
    private int[] testScores;
   
  // Constructor
  Student(String firstName, String lastName, int identification, int[] testScores) {
    super(firstName, lastName, identification);
    this.testScores = testScores;
  }
    
  public char calculate(){
    int sum = 0;
    for(int i=0;i<this.testScores.length;i++) {
        sum += this.testScores[i];
    }
    int avg = sum / this.testScores.length;
    
    char grade = 'a';
    char[] grades = {'O','E','A','P','D','T'};
    int[] lwr_bound = {90,80,70,55,40,0};
    boolean found = false;
    int curr = 0;
    while((curr < grades.length-1) && found == false) {
      if(avg >= lwr_bound[curr]){
        grade = grades[curr];
        found = true;
      }
      curr++;
    }
    return grade;
  }
}
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for(int i = 0; i < numScores; i++){
      testScores[i] = scan.nextInt();
    }
    scan.close();

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate() );
  }
}
  
