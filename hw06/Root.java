/*  Kevin Trinh
    CSE 2
    hw06 - Root.java
    October 14, 2014
    
    This program narrows down the square root of a number.
    The program sets a low (0) and high (x+1).
    The program computes middle value, squares it, and compares.
    low and high are adjusted until close estimation of square root is found.
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class Root {
    
    // add main method
    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);                                             // declares and assigns new scanner
        
        System.out.print("Enter a double to find its square root: ");                           // prompts user for a double
        
        if (userInput.hasNextDouble()) {                                                        // if scanner has next double...
            double userNumber = userInput.nextDouble();                                         // userNumber is scanner's next double
            double low = 0.0;                                                                   // declares and assigns initial low value
            double high = userNumber + 1;                                                       // declares and calulates relative high value
            double middle = (high-low)/2.0+low;                                                 // declares and calulates middle value
            double middleSquared = middle*middle;                                               // declares and calulates middle^2
            int i = 0;                                                                          // declares counter variable i
            
            if (userNumber > 0) {                                                               // if userNumber is positive...
            
                while (i < 100) {                                                               // while i < 100
                    
                    if ((high-low) < 0.0000001*high) {                                          // if (high-low) < 0.0000001*high...
                        break;                                                                  // breaks because estimate is good enough
                    }                                                                           // end of if statement
                    
                    else if (middleSquared > userNumber) {                                      // if middleSquared > userNumber
                        high = middle;                                                          // high becomes middle
                        middle = (high-low)/2.0+low;                                            // recalculates middle
                        middleSquared = middle*middle;                                          // recalculates middle squared
                        System.out.println(+middle);                                            // prints out value of middle
                    }                                                                           // end of else if statement
                    
                    else if (middleSquared < userNumber) {                                      // if middleSquared < userNumber
                        low = middle;                                                           // low becomes middle
                        middle = (high-low)/2.0+low;                                            // recalculates middle
                        middleSquared = middle*middle;                                          // recalculates middle squared
                        System.out.println(+middle);                                            // prints out value of middle
                    }                                                                           // end of else if statement
                    
                    i++;                                                                        // increments i
                }                                                                               // end of while loop
                
                System.out.println("The square root of " + userNumber + " is " + middle + "."); // prints end result of userNumber and calculated root
                
            }                                                                                   // end of if userNumber > 0 statement
            else {                                                                              // if userNumber is not positive...
                System.out.println("You did not enter a valid number.");                        // prints error
                System.exit(0);                                                                 // terminates code
            }                                                                                   // end of else statement
        }                                                                                       // end of if scanner has next double...
        else {                                                                                  // if scanner does not have next double...                                                                                 
            System.out.println("You did not enter a valid number.");                            // prints error
            System.exit(0);                                                                     // terminates code
        }                                                                                       // end of else statement
        
    }                                                                                           // end of main method
}                                                                                               // end of public class

