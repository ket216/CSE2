/*  Kevin Trinh
    CSE 2
    hw07 - NumberStack.java
    October 20, 2014
    
    This code prompts user for a number = [1,9].
    The code then prints out a stack of numbers in a pattern in triplicate.
    The first stack is written exclusively with for loops.
    The second stack is written exclusively with while loops.
    The third stack is written exclusively with do while loops.
*/

// imports Scanner utility
import java.util.Scanner;

// add public class
public class NumberStack {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int userNumber = 0;
        
        //////////////////////////////////////////////////////////////////////////
        while (true) {                                                          // start of while to check for int
            System.out.print("Enter an integer between 1 - 9 (inclusive): ");   // prompts user for integer [1,9]
            
            if (userInput.hasNextInt()) {                                       // if scanner has next int...
                userNumber = userInput.nextInt();                               // userNumber = next int
                
                if (userNumber >= 1 && userNumber <= 9) {                       // if userNumber = [1,9]...
                    break;                                                      // breaks out of while true loop
                }
                else {                                                          // if userNumber != [1.9]...
                    System.out.println("1 - You did not enter a valid input."); // prints error
                    continue;                                                   // reruns this while loop
                }

            }                                                                   // end of if userInput.hasNextInt()
            else {                                                              // if !userInput.hasNextInt()...
                System.out.println("2 - You did not enter a valid input.");     // prints error
                userInput.next();                                               // clears Scanner
                continue;                                                       // reruns this while loop
            }
        }                                                                       // end of while loop
        //////////////////////////////////////////////////////////////////////////
        // FOR LOOP // FOR LOOP // FOR LOOP // FOR LOOP // FOR LOOP // FOR LOOP //
        //////////////////////////////////////////////////////////////////////////
        
        int i = 1;                                                              // variable for numbers
        int j = 1;                                                              // variable for number of lines
        int k = 1;                                                              // variable for dashes
        int l = 1;                                                              // variable for spaces
        
        for (i = 1; i <= userNumber; i++) {                                     // for loop for numbers
            
            for (j = 1; j <= i; j++) {                                          // for loop for number of repeated lines
            
                for (l = 1; l <= (userNumber-i+1); l++) {                         // for loop for spaces before numbers
                    System.out.print(" ");                                      // prints space
                }
            
                for (k = 1; k <= (2*i-1); k++) {                                // for loop to print out numbers
                    System.out.print(i);                                        // prints out numbers
                }
                System.out.println("");                                         // line break
            }
            
            for (l = 1; l <= (userNumber-i+1); l++) {                             // for loop for spaces before dashes
                    System.out.print(" ");                                      // prints space
            }
            
            for (k = 1; k <= (2*i-1); k++) {                                    // for loop to print out dashes
                System.out.print("-");                                          // prints dashes
            }
            System.out.println("");                                             // line break
        }                                                                       // end of outer for loop/block of code
        //////////////////////////////////////////////////////////////////////////
        
        System.out.println("");                                                 // prints break to separate blocks of code
        System.out.println("");                                                 // prints break to separate blocks of code
        System.out.println("");                                                 // prints break to separate blocks of code
        
        //////////////////////////////////////////////////////////////////////////
        /// WHILE LOOP // WHILE LOOP // WHILE LOOP // WHILE LOOP // WHILE LOOP ///
        //////////////////////////////////////////////////////////////////////////
        
        i = 1;                                                                  // resets value for i (variable for numbers)
        j = 1;                                                                  // resets value for j (variable for number of lines)
        k = 1;                                                                  // resets value for k (variable for dashes)
        l = 1;                                                                  // resets value for l (variable for spaces)
        
        while (i <= userNumber) {                                               // while i <= userNumber...
            
            j = 1;                                                              // resets value for j
            while (j <= i) {                                                    // while number of lines <= userNumber...
                
                l = 1;                                                          // resets value for l
                while (l <= (userNumber-i+1)) {                                   // while spaces <= userNumber-i... (for spaces in front of numbers)
                    System.out.print(" ");                                      // print spaces
                    l++;                                                        // increments l
                }
                
                k = 1;                                                          // resets value for k
                while (k <= (2*i-1)) {                                          // while k <= 2i-1
                    System.out.print(i);                                        // prints out i 2i-1 times (results in pyramid shape)
                    k++;                                                        // increments k
                }
                System.out.println("");                                         // line break
                j++;                                                            // increments j
            }
            
            l = 1;                                                              // resets value for l
            while (l <= (userNumber-i+1)) {                                       // while spaces <= userNumber-i... (for spaces in front of dashes)
                System.out.print(" ");                                          // print spaces
                l++;                                                            // increments l
            }
            
            k = 1;                                                              // resets value for k
            while (k <= (2*i-1)) {                                              // while k <= 2i-1
                System.out.print("-");                                          // prints out dashes 2i-1 times (results in pyramid shape)
                k++;                                                            // increments k
            }
            System.out.println("");                                             // line break
            i++;                                                                // increments i
        }
        //////////////////////////////////////////////////////////////////////////
        
        System.out.println("");                                                 // prints break to separate blocks of code
        System.out.println("");                                                 // prints break to separate blocks of code
        System.out.println("");                                                 // prints break to separate blocks of code
        
        //////////////////////////////////////////////////////////////////////////
        //// DO WHILE LOOP // DO WHILE LOOP // DO WHILE LOOP // DO WHILE LOOP ////
        //////////////////////////////////////////////////////////////////////////
        
        i = 1;                                                                  // resets value for i (variable for numbers)
        j = 1;                                                                  // resets value for j (variable for number of lines)
        k = 1;                                                                  // resets value for k (variable for dashes)
        l = 1;                                                                  // resets value for l (variable for spaces)
        
        do {                                                                    // while i <= userNumber
            
            j = 1;                                                              // resets value for j
            do {                                                                // while j <= i...
            
            
                l = 1;                                                          // resets value for l
                do {                                                            // while l <= userNumber-i (spaces in front of numbers)
                    System.out.print(" ");                                      // print spaces
                    l++;                                                        // increments l
                } while (l <= (userNumber-i+1));
            
            
                k = 1;                                                          // resets value for k
                do {                                                            // while k <= 2i-1
                    System.out.print(i);                                        // prints out i 2i-1 times (results in pyramid shape)
                    k++;                                                        // increments k
                } while (k <= (2*i-1));
            
            
                System.out.println("");                                         // line break
                j++;                                                            // increments j
                
            } while (j <= i);
            
            
            l = 1;                                                              // resets value for l
            do {                                                                // while l <= userNumber-i (spaces in front of dashes)
                System.out.print(" ");                                          // print spaces
                l++;                                                            // increments l
            } while (l <= (userNumber-i+1));
            
            
            k = 1;                                                              // resets value for k
            do {                                                                // while k <= 2i-1
                System.out.print("-");                                          // prints out dashes 2i-1 times (results in pyramid shape)
                k++;                                                            // increments k
            } while (k <= (2*i-1));
            
            
            System.out.println("");                                             // line break
            i++;                                                                // increments i
            
        } while (i <= userNumber);
        
        //////////////////////////////////////////////////////////////////////////
        
    }                                                                           // end of main method
}                                                                               // end of public class