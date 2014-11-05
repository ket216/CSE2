/*  Kevin Trinh
    CSE 2
    hw09
    November 3, 2014
    
    This code is an exercise in nested method calling.
*/

// import Scanner utility
import java.util.Scanner;

// add class
public class BlockedAgain {

    // add line method ///////////////////////////////////////////////////////////
    public static void line(int x) {
        
        for (int i = 1 ; i <= x ; i++) {                                        // for loop controlling rows being printed
            
            for (int j = 1 ; j <= (2*x-1) ; j++) {                              // for loop controlling how many numbers are printed per row
                System.out.print(x);                                            // prints out number
            }
            System.out.println("");                                             // line break
        }
        
        for (int j = 1 ; j <= (2*x-1) ; j++) {                                  // for loop controlling how many dashes to print
                System.out.print("-");                                          // prints out dash
        }
        System.out.println("");                                                 // line break
        
    }

    // add block method //////////////////////////////////////////////////////////
    public static void block(int x) {
        
        for (int i = 1 ; i <= x ; i++) {                                        // for loop controlling how many liens per block
            line(i);                                                            // passes iterator i into line method
        }
    }

    // add allBlocks method //////////////////////////////////////////////////////
    public static void allBlocks(int x) {
        System.out.println("");                                                 // line break
        block(x);                                                               // calls block method
        
    }
    
    // add checkRange method /////////////////////////////////////////////////////
    public static int checkRange(int userNumber) {
        
        if (userNumber >= 1 && userNumber <= 9) {                               // if userNumber [1,9]...
            return userNumber;                                                  // returns userNumber to checkInt method
        }
        else {                                                                  // if outside range...
            return 0;                                                           // returns 0
        }
    }

    // add checkInt method ///////////////////////////////////////////////////////////////
    public static int checkInt(Scanner userInt) {
        
        while (true) {                                                                  // while true
            
            if (userInt.hasNextInt()) {                                                 // if scanner has next int...
            
                int userNumber = userInt.nextInt();                                     // assign scanner value to userNumber
                
                if (checkRange(userNumber) != 0) {                                      // if userNumber is within range...
                    return userNumber;                                                  // returns userNumber to getInt method
                }
                else {                                                                  // if userNumber is outside range...
                    System.out.print("You did not enter a valid integer. Try again: "); // prints error
                    continue;                                                           // continues loop
                }
            }
            else {                                                                      // if scanner does not have next int...
                userInt.next();                                                         // clears scanner buffer
                System.out.print("You did not enter an integer. Try again: ");          // prints error
                continue;                                                               // continues loop
            }
        }
    }

    // add getInt method /////////////////////////////////////////////////////////......//
    public static int getInt() {
    
        Scanner userInt = new Scanner(System.in);                               // declares and assigns new scanner utility
        System.out.print("Enter a number between 1 and 9 (inclusive): ");       // prompts user for an int [1,9]
        int userNumber = 0;                                                     // initializes and assigns value to userNumber
        
        userNumber = checkInt(userInt);                                         // userNumber is the returned value of checkInt method 
        
        return userNumber;                                                      // return userNumber to main method
    }
    
    // add main method ///////////////////////////////////////////////////////////
    public static void main(String []s){
        int m;                                                                  // initializes int m
        m = getInt();                                                           // force user to enter int in range [1-9]
        allBlocks(m);                                                           // calls allBlocks method
    
    }
}
