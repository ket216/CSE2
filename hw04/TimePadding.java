/*  Kevin Trinh
    CSE 2
    hw04 - TimePadding
    September 21, 2014
    
    This program prompts the user to input a number of seconds.
    This program then displays the padded time (hh:mm:ss).
*/

// imports scanner utility
import java.util.Scanner;

// define a class
public class TimePadding {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner userSecondsInput = new Scanner(System.in);
        
        System.out.println("Enter seconds as an integer: ");
        
        if (userSecondsInput.hasNextInt()) {
            int secondsInput = userSecondsInput.nextInt();
            
            if (secondsInput < 0) {
                System.out.println("You did not enter a valid integer.");
                return;
            }
            else{
            double dhours = secondsInput/3600;
            double dminutes = secondsInput/60;
            double dseconds = secondsInput;
            int hours = (int)dhours;
            int minutes = (int)(dminutes-(60*hours));
            int seconds = (int)(dseconds-(60*minutes)-(3600*hours));
         
            System.out.println("The time is: " + hours + ":" + minutes + ":" + seconds + ".");
            }
        
        }
        else {
            System.out.println("You did not enter an integer.");
            return;
        }
        
        
    }
    
}