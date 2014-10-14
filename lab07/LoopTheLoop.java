/*  Kevin Trinh
    CSE 2
    lab07 - LoopTheLoop
    October 10, 2014
    
    This code ______
*/

// import Scanner utility
import java.util.Scanner;

// define a class
public class LoopTheLoop {
    
    // add main method
    public static void main(String[] args) {
        
        int nStars = 10;                                    // sentinel value
        int cStars = 1;                                     // current/counter number of stars
        int lStars = 0;                                     // stars on the current print line
        String stars = "";                                  // current string of stars
        String star = "*";                                  // added star
        
        Scanner userInput = new Scanner(System.in);                             // declares and assigns new scanner userInput
        System.out.println("Enter an integer between 1 - 15 (inclusive): ");    // prompts user for an integer [1,15]
        
        while (true) {                                                          // while true
            if (userInput.hasNextInt()) {                                       // if scanner.hasNextInt...
                nStars = userInput.nextInt();                                   // assigns userInput value to nStars
                
                if (nStars >= 1 && nStars <= 15) {                              // if nStars = [1,15]
                
                    while (cStars <= nStars) {
                        
                        while (lStars < cStars) {
                            stars += star;
                            System.out.print(stars);
                            lStars++;
                        }
                        
                        System.out.println("");
                        
                        cStars++;
                    }
                }
                else {                                                          // if nStars != [1,15]
                    System.out.println("You did not enter a valid input.");     // prints error
                    break;                                                      // breaks else statement
                }
            }
            else {                                                              // if scanner does not have next int...
                System.out.println("You did not enter a valid input.");         // prints error
                break;                                                          // breaks else statement
            }
        }
    }
    
}
