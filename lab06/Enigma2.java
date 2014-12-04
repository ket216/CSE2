/*  Kevin Trinh
    CSE 2
    lab06 - Debugging Enigma2
    October 5, 2014
    
    This is an exercise in code debugging.
*/

// import Scanner utility
import java.util.Scanner;

// define a class
public class Enigma2 {
    
    // add main method
    public static void main(String[] args) {
        
        int n=40,k=60;                          // declares and assigns ints n = 40 and k = 60
        String out = "";                        // creates and assigns String out to blank
        
        switch(n) {                             // switch on n
        
            //case 12:
                
            //case 13:
                //out+=13;
                
            case 40:
                out += 40;
        }
        System.out.println(out);
    }
}

/*  Error Report: Explain how you can use the java.lang exception to identify the runtime error in the above code
    line 14 - changed main(String [] arg) to main(String[] args) -> compiler error
    line 21 - removed case 12 because n will never equal 12 -> logic error
    line 23 - removed case 13 because n will never equal 13 -> logic error
    line 24 - removed because n will never equal 13 -> logic error
    line 27 - divide by zero -> runtime error
    line 29 - cannot print result of x/0 -> runtime error
 
*/
