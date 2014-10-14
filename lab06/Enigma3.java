/*  Kevin Trinh
    CSE 2
    lab06 - Debugging Enigma3
    October 5, 2014
    
    This is an exercise in code debugging.
*/

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n or k becomes 0 and causes
 * the program to crash
 */

// import Scanner utility
import java.util.Scanner;

// define a class
public class Enigma3 {
    
    // add main method
    public static void main(String[] args){
        
        int n = 40, k = 60;
        String out="";
        
        switch(k%14){
            
            /*
            case 12: 
            case 13:
                out += 13;
                break;
            */

            default:
                out += 40;
                n /= 3;
                k -= 7;
                //System.out.println("1 - n = " + n + " k = " + k);
        }
        
        if(n*k%12 < 12){
            n -= 20;
            out += n;
            //System.out.println("2 - n = " + n + " k = " + k);
        }
        
        if(n*n>k){
            n = 42;
            out += n+k;
            //System.out.println("3 - n = " + n + " k = " + k);
        }
        
        else {
          n = 45;
          out += n+k;
          //System.out.println("4 - n = " + n + " k = " + k);
        }
        
        switch(n+k) {
            
            case 114: 
                n -= 11;
                k -= 3;
                //System.out.println("5 - n = " + n + " k = " + k);
                break;
            
            case 97:
                n -= 14;
                k -= 2;
                //System.out.println("6 - n = " + n + " k = " + k);
                break;
                
            case 98:
                n /= 5;
                k /= 9;
                //System.out.println("7 - n = " + n + " k = " + k);
                break;
                
            default:
                n -= 3;
                k -= 5;
                //System.out.println("8 - n = " + n + " k = " + k);
                break;
        }
        //System.out.println("9 - n = " + n + " k = " + k);
        out += 1/n + 1/k;
        //System.out.println("10 - n = " + n + " k = " + k);
        System.out.println(out);
  }
}

/*  Error report:
    
    line 29-34 - case 12 or 13 never reached, so they were removed -> logic error
    line 79&85 - missing breaks were added to the case/default in the switch statement -> logic error -> runtime error
    
*/
