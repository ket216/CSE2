/*  Kevin Trinh
    CSE 2
    lab06 - Debugging Enigma0
    October 5, 2014
    
    This is an exercise in code debugging.
*/

/*  Sample of expected output:
        Enter an int- 9
        You entered 9
        sum is 25
        Again, you entered 9
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class Enigma0 {
    
    // add main method
    public static void main(String[] args) {
        
        System.out.print("Enter an integer: ");                                 // prompts user for an integer
        Scanner scan = new Scanner(System.in);                                  // declares and assigns new Scanner
            
        if(scan.hasNextInt()) {                                                 // if scan has next int...
            int n = scan.nextInt();                                             // declares and assigns int n as user input
            System.out.println("You entered "+n);                               // prints out user input
            
            int k = 4, p = 6, q = 7, r = 8;                                     // declares and assigns other int values
            int sum = k+p+q+r+n;                                                // calculates sum of all ints
            
            System.out.println("The sum of k(" + k + "), p(" + p + "), q(" + q + "), r(" + r + "), and n(" + n + ") is " + sum);    // prints sum of ints
            System.out.println("To repeat, you entered " + n);                  // prints out user input again
        }
        
        else{                                                                   // if scan does not have an int...
            //
            System.out.println("You did not enter a valid number.");            // prints error
            return;                                                             // terminates code
        }
    }
}

/* Error report:
    Expand this comment:
    Explain the error(s) that occurred here, and then fix them

    line 23 - changed main(String arg []) to main(String[] args) -> compiler error
    line 32 - removed n from declaration since int n is already declared -> compiler error
    line 33 - actually calculates sum of ints including n -> logic error
    line 35 - prints out actual sum of numbers -> logic error
    line 39 - moved else statement to a logical place relative to what code needs to execute -> runtime/logic error
    line 40 - removed int n = 4 declaration -> logic error
    
*/

