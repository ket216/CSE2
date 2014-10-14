/*  Kevin Trinh
    CSE 2
    lab06 - Debugging Enigma1
    October 5, 2014

    This is an exercise in code debugging.
*/

/*  The user is supposed to enter a number between 0 and 99.
    The program interprets that as a percentage, converts it to
    a prorportion and then displays the proportion (out of 1) 
    remaining. It does not always work. Find out when it doesn't
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class Enigma1 {
  
  // add main method
  public static void main(String[] args) {
    
    double percent;                                                             // declares percent as a double
    System.out.print("Enter a value for a percent (0 - 99): ");                 // prompts user for 0 <= double <= 99
    Scanner xInput = new Scanner(System.in);                                    // declares and assigns new scanner xInput
    
    if (xInput.hasNextDouble()) {                                               // if scanner has next double...
      double x = xInput.nextDouble();                                           // assigns double to x
      
      if (x > 0 && x < 99) {                                                    // if x is between 0 and 99...
      System.out.println("You entered " + x + "%");                             // prints out percentage
      
      percent = (100-x)/100;                                                    // calculates percent remaining
      System.out.println("The proportion remaining is " + percent);             // prints out percent remaining
      }                                                                         // end of if (x > 0 && x < 99) statement
    
      else {                                                                    // if x is not between 0 and 99...
        System.out.println("You did not enter a valid input.");                 // prints error
      }                                                                         // end of else statement for if (x > 0 && x < 99)
      
    }                                                                           // end of if (xInput.hasNextDouble()) statement
    else {                                                                      // if scanner does not have next double...
      System.out.println("You did not enter a valid input.");                   // prints error
    }                                                                           // end of if (xInput.hasNextDouble()) else statement
  }                                                                             // end of main method
}                                                                               // end of public class

/*  Error report: 
    (Exlain the error(s) that occur here, in this comment, and fix the errors)
    Hint: What kinds of input are unacceptable? What kinds of acceptable input don't produce the correct answer?
 
    line 22 - changed main(String []arg) to main(String[] args) -> compiler error
    line 26 - declares and assigns scanner utility before input it taken -> compiler error
    line 28 - checks if scanner has a double (previous code did not check for this) -> logic error
    line 29 - if true, then assigns value to double x -> logic error
    line 31 - checks if value is between 0 and 99 (previous code did not check for this) -> logic error
    line 34 - calculates percent for ALL values of x (previous code only calculated certain values) -> logic/runtime error
    line 38 - returns error if value is not between 0 and 99 -> logic error
    line 43 - returns error if value is not a double -> logic error
    
*/

