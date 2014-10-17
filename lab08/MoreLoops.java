/*  Kevin Trinh
    CSE 2
    lab08 - MoreLoops.java
    October 15, 2014
    
    This lab is an exercise in converting loops.
*/

// import scanner utility
import java.util.Scanner;

// define a class
public class MoreLoops {
    
    // add main method
    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);                              // declares and assigns new scanner
            int n = 0;                                                          // declares and assigns n = 0
            
            /*
            System.out.print("Enter an int: ");                                 // prompts user for an int
            while (!scan.hasNextInt()) {                                        // while scanner does not have next int
                scan.next();                                                    // "resets" scanner
                System.out.print("You did not enter an int; try again: ");      // prompts user for an int again
            }                                                                   // end of while loop
            */
            
            System.out.print("Enter an integer: ");                             // prompts user for an int
            
            do {                                                                // start of do-while loop
                if (scan.hasNextInt()) {
                    break;
                }
                else {
                    scan.next();                                                    // "resets" scanner
                    System.out.print("You did not enter an integer, try again: ");  // prints error
                }
            }                                                                   // end of do statement
            while (!scan.hasNextInt());                                         // while scanner does not have next int...
            
            n = scan.nextInt();                                                 // n = scanner's next int
            
            /*
            for(int j=0 ; j<n && j<40 ; j++) {
                
                for(int k=0 ; k<j+1 ; k++) {
                    System.out.print('*');
                }
                    System.out.println();
            }
            */
            
            int j = 0;
           
            
            while ( j < n && j < 40) {
                
                int k = 0;
                while ( k < (j+1) ) {
                    
                    System.out.print("*");
                    k++;
                }
                
                j++;
                System.out.println();
            }
            
            int k = 4;

            /*
            do{
                System.out.println("k="+k);
                k++;
            }
            while(k<4);
            */
            
            while (k <= 4) {
                System.out.println("k = " + k);
                k++;
            }
            
            int count = 0;
            
            /*
            while (true) {
            
                switch(n) {
                    default: System.out.println(n + " is > 5 or < 1");
                    break;
                        
                    case 1:
                    case 2: System.out.print("Case 2 ");
                        continue;
                    case 3: break;
                    case 4: System.out.println("Case 4");
                    case 5: System.out.println("Case 5");
                        break;
                    }
                    
                count++;
                if (count > 10) {
                    break;
                }
                
            }
            */
            
            if (n > 5 || n < 1) {
                for (count = 0 ; count < 11 ; count++)
                    System.out.println(n + " is > 5 or < 1");
            }
            else if (n == 3) {
                for (count = 0 ; count < 11 ; count++)
                System.out.println();
            }
            else if (n == 4 || n == 5) {
                for (count = 0 ; count < 11 ; count++)
                System.out.println("Case " + n);
            }
            else {
                for (count = 0; count < 10; count++) {
                    System.out.print("Case " + n + " ");
                }
            }
    }
}