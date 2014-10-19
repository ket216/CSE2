/*  Kevin Trinh
    CSE 2
    lab07 - LoopTheLoop
    October 10, 2014
    
    This code prompts user for an integer between 1 and 15 (inclusive).
    The code then 
*/

// import Scanner utility
import java.util.Scanner;

// define a class
public class LoopTheLoop {
    
    // add main method
    public static void main(String[] args) {
        
        int nStars = -1;                                    // sentinel value
        int cStars = 1;                                     // current/counter number of stars
        int lStars = 0;                                     // stars on the current print line
        String stars = "";                                  // current string of stars
        String star = "*";                                  // added star
        String userAnswer = "";                             // String for answer to if the user wants to rerun code
        Scanner userInput = new Scanner(System.in);
        
        while (true) {
            while (true) {                                                          // while true
                userInput = new Scanner(System.in);                                 // declares and assigns new scanner userInput
                System.out.print("Enter an integer between 1 - 15 (inclusive): ");  // prompts user for an integer [1,15]
                
                if (userInput.hasNextInt()) {                                       // if scanner.hasNextInt...
                    nStars = userInput.nextInt();                                   // assigns userInput value to nStars
                    
                    if (nStars >= 1 && nStars <= 15) {                              // if nStars = [1,15]
                        
                                                                                    // this loop sets up to print out a line of *s that is nStars long                    
                        while (cStars <= nStars) {                                  // while current number of starts printed <= nStars...
                            
                            while (lStars < nStars) {                               // while number of stars "on the line" < nStars...
                                stars += star;                                      // adds * to String stars (increasing # of stars in string)
                                lStars++;                                           // increments lStars
                            }                                                       // end of while loop
                            
                            cStars++;                                               // increments cStars
                        }                                                           // end of while loop
                        
                        System.out.println(stars);                                  // prints string of stars
                        
                        cStars = 0;                                                 // resets cStars
                        lStars = 0;                                                 // resets lStars
                        stars = "";                                                 // resets stars string
                        
                        while (cStars <= nStars) {                                  // while current number of starts printed <= nStars...
                            
                            while (lStars < cStars) {                               // while number of stars on the line < nStars...
                                stars += star;                                      // adds * to String stars
                                System.out.println(stars);                          // prints out String stars
                                lStars++;                                           // increments lStars
                            }                                                       // end of while loop
                            
                            cStars++;                                               // increments cStars
                        }                                                           // end of while loop
                        
                        break;
                        
                    }                                                               // end of if statement
                
                    else {                                                          // if nStars != [1,15]
                        System.out.println("You did not enter a valid input.");     // prints error
                        continue;                                                   // reruns the loop
                    }                                                               // end of else statement
                }                                                                   // end of if scanner.hasNextInt statement
                
                else {                                                              // if scanner does not have next int...
                    System.out.println("You did not enter a valid input.");         // prints error
                    continue;                                                       // reruns the loop
                }                                                                   // end of else statement
                
            }                                                                       // end of while true loop
            
            while (true) {                                                          // while true loop to ask user if they would like to rerun the code
                System.out.println("Would you like to run the code again?");        // asks user if they would like to rerun the code
                System.out.print("Enter Y, y, N, or n: ");                          // gives user options for response
                
                userAnswer = userInput.next();                                      // assigns userAnswer to scanner input
                
                switch (userAnswer) {                                               // switch on userAnswer
                    
                case "Y":                                                           // for case Y
                case "y":                                                           // for case y
                    break;                                                          // breaks out of switch statement
                case "N":                                                           // for case N
                case "n":                                                           // for case n
                    System.exit(0);                                                 // terminates code
                default:                                                            // for case (anything else)
                    System.out.println("You did not enter a valid input.");         // prints error
                    continue;                                                       // reruns while true loop
                }                                                                   // end of switch statement
                
                break;                                                              // breaks out of while true loop
            }                                                                       // end of while true loop
            
            continue;                                                               // reruns outer while true loop
            
        }

    }                                                                               // end of main method
}                                                                                   // end of public class
