/*  Kevin Trinh
    CSE 2
    hw05 - BoolaBoola.java
    September 30, 2014
    
    This program randomly generates 5 booleans which correspond to 3 booleans (b) and 2 operands (o).
    The program asks user to enter whether (b o b o b) evalues are true (T/t) or false (F/f).
    The program compares the user's answer to the actual answer and reports whether user was correct or not.
*/

// imports scanner utility
import java.util.Scanner;

// define a class
public class BoolaBoola {
    
    // add main method
    public static void main(String[] args) {
        
        int value1 = (int)((Math.random())*10);                                 // assigns random integer between 0 and 9 to value1
        int value2 = (int)((Math.random())*10);                                 // assigns random integer between 0 and 9 to value2
        int value3 = (int)((Math.random())*10);                                 // assigns random integer between 0 and 9 to value3
        int value4 = (int)((Math.random())*10);                                 // assigns random integer between 0 and 9 to value4
        int value5 = (int)((Math.random())*10);                                 // assigns random integer between 0 and 9 to value5
        boolean boolean1;                                                       // creates boolean for the first boolean
        boolean operand2;                                                       // creates boolean for the second operand
        boolean boolean3;                                                       // creates boolean for the third boolean
        boolean operand4;                                                       // creates boolean for the fourth operand
        boolean boolean5;                                                       // creates boolean for the fifth boolean
        
        Scanner Answer = new Scanner(System.in);                                // declares and assigns new scanner
        
        //////////////////////////

        if (value1 <= 4) {      // if value1 <= 4
            boolean1 = true;    // sets boolean1 as true
        }
        else {                  // otherwise
            boolean1 = false;   // sets boolean1 as false
        }

        //////////////////////////
        
        if (value2 <= 4) {      // if value2 <= 4
            operand2 = true;    // sets operand2 as true
        }
        else {                  // otherwise
            operand2 = false;   // sets operand2 as false
        }
        
        //////////////////////////
        
        if (value3 <= 4) {      // if value3 <= 4
            boolean3 = true;    // sets boolean3 as true
        }
        else {                  // otherwise
            boolean3 = false;   // sets boolean3 as false
        }
        
        //////////////////////////
        
        if (value4 <= 4) {      // if value4 <= 4
            operand4 = true;    // sets operand2 as true
        }
        else {                  // otherwise
            operand4 = false;   // sets operand4 as false
        }
        
        //////////////////////////
        
        if (value5 <= 4) {      // if value5 <= 4
            boolean5 = true;    // sets boolean5 as true
        }
        else {                  // otherwise
            boolean5 = false;   // sets boolean5 as false
        }
            
        //////////////////////////////////////////////////////////////////////// Start of && && case
        
        if (operand2 == true && operand4 == true) {                                                                             // if values for both operands are true...
            System.out.println("Is (" + boolean1 + " && " + boolean3 + " && " + boolean5 + ") true or false (T/t or F/f)?");    // prompts user for answer
            boolean answer = boolean1 && boolean3 && boolean5;                                                                  // evaluates && && case
            
            if (Answer.hasNext()) {                                                                                             // if scanner has next string...
                String userAnswer = Answer.next();                                                                              // stores user answer
                
                switch (userAnswer) {                                                                                           // switch on userAnswer
                    
                    case "T":                                                                                                   // if userAnswer = "T"
                    case "t":                                                                                                   // or if userAnswer = "t"
                        userAnswer = "true";                                                                                    // userAnswer is "true"
                        if (answer == true){                                                                                    // if the ACTUAL answer is true...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                        
                    case "F":                                                                                                   // if userAnswer = "F"
                    case "f":                                                                                                   // or if userAnswer = "f"
                        userAnswer = "false";                                                                                   // userAnswer is "false"
                        if (answer == false){                                                                                   // if the ACTUAL answer is false...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                    
                    default:                                                                                                    // if userAnswer is anything else...
                        System.out.println("You did not enter a valid answer.");                                                // prints error
                        break;                                                                                                  // breaks out of switch statement
                    
                }       // end of switch userAnswer
                
            }       // end of if scanner.hasNext()
            else {                                                                                                              // if scanner does not have next string...
                System.out.println("You did not enter a valid answer.");                                                        // prints error
                return;                                                                                                         // terminates code
            }       // end of else scanner.hasNext()
            
        }       // end of && &&
        
        //////////////////////////////////////////////////////////////////////// Start of || || case
        
        if (operand2 == false && operand4 == false) {                                                                           // if values for both operands are false...
            System.out.println("Is (" + boolean1 + " || " + boolean3 + " || " + boolean5 + ") true or false (T/t or F/f)?");    // prompts user for answer
            boolean answer = boolean1 || boolean3 || boolean5;                                                                  // evaluates || || case
            
            if (Answer.hasNext()) {                                                                                             // if scanner has next string...
                String userAnswer = Answer.next();                                                                              // stores user answer
                
                switch (userAnswer) {                                                                                           // switch on userAnswer
                    
                    case "T":                                                                                                   // if userAnswer = "T"
                    case "t":                                                                                                   // or if userAnswer = "t"
                        userAnswer = "true";                                                                                    // userAnswer is "true"
                        if (answer == true){                                                                                    // if the ACTUAL answer is true...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                        
                    case "F":                                                                                                   // if userAnswer = "F"
                    case "f":                                                                                                   // or if userAnswer = "f"
                        userAnswer = "false";                                                                                   // userAnswer is "false"
                        if (answer == false){                                                                                   // if the ACTUAL answer is false...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                    
                    default:                                                                                                    // if userAnswer is anything else...
                        System.out.println("You did not enter a valid answer.");                                                // prints error
                        break;                                                                                                  // breaks out of switch statement
                    
                }       // end of switch userAnswer
                
            }       // end of if scanner.hasNext()
            else {                                                                                                              // if scanner does not have next string...
                System.out.println("You did not enter a valid answer.");                                                        // prints error
                return;                                                                                                         // terminates code
            }       // end of else scanner.hasNext()
            
        }       // end of || ||
        
        //////////////////////////////////////////////////////////////////////// Start of && || case
        
        if (operand2 == true && operand4 == false) {                                                                            // if values for operands are true/false...
            System.out.println("Is (" + boolean1 + " && " + boolean3 + " || " + boolean5 + ") true or false (T/t or F/f)?");    // prompts user for answer
            boolean answer = boolean1 && boolean3 || boolean5;                                                                  // evaluates && || case
            
            if (Answer.hasNext()) {                                                                                             // if scanner has next string...
                String userAnswer = Answer.next();                                                                              // stores user answer
                
                switch (userAnswer) {                                                                                           // switch on userAnswer
                    
                    case "T":                                                                                                   // if userAnswer = "T"
                    case "t":                                                                                                   // or if userAnswer = "t"
                        userAnswer = "true";                                                                                    // userAnswer is "true"
                        if (answer == true){                                                                                    // if the ACTUAL answer is true...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                        
                    case "F":                                                                                                   // if userAnswer = "F"
                    case "f":                                                                                                   // or if userAnswer = "f"
                        userAnswer = "false";                                                                                   // userAnswer is "false"
                        if (answer == false){                                                                                   // if the ACTUAL answer is false...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                    
                    default:                                                                                                    // if userAnswer is anything else...
                        System.out.println("You did not enter a valid answer.");                                                // prints error
                        break;                                                                                                  // breaks out of switch statement
                    
                }       // end of switch userAnswer
                
            }       // end of if scanner.hasNext()
            else {                                                                                                              // if scanner does not have next string...
                System.out.println("You did not enter a valid answer.");                                                        // prints error
                return;                                                                                                         // terminates code
            }       // end of else scanner.hasNext()
            
        }       // end of && ||
        
        //////////////////////////////////////////////////////////////////////// Start of || && case
        
        if (operand2 == false && operand4 == true) {                                                                            // if values for operands are false/true...
            System.out.println("Is (" + boolean1 + " || " + boolean3 + " && " + boolean5 + ") true or false (T/t or F/f)?");    // prompts user for answer
            boolean answer = boolean1 || boolean3 && boolean5;                                                                  // evaluates || && case
            
            if (Answer.hasNext()) {                                                                                             // if scanner has next string...
                String userAnswer = Answer.next();                                                                              // stores user answer
                
                switch (userAnswer) {                                                                                           // switch on userAnswer
                    
                    case "T":                                                                                                   // if userAnswer = "T"
                    case "t":                                                                                                   // or if userAnswer = "t"
                        userAnswer = "true";                                                                                    // userAnswer is "true"
                        if (answer == true){                                                                                    // if the ACTUAL answer is true...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                        
                    case "F":                                                                                                   // if userAnswer = "F"
                    case "f":                                                                                                   // or if userAnswer = "f"
                        userAnswer = "false";                                                                                   // userAnswer is "false"
                        if (answer == false){                                                                                   // if the ACTUAL answer is false...
                            System.out.println("Correct!");                                                                     // user is correct
                        }
                        else {                                                                                                  // otherwise...
                            System.out.println("Sorry! You were wrong!");                                                       // user is incorrect
                        }
                        break;                                                                                                  // breaks out of switch statement
                    
                    default:                                                                                                    // if userAnswer is anything else...
                        System.out.println("You did not enter a valid answer.");                                                // prints error
                        break;                                                                                                  // breaks out of switch statement
                    
                }       // end of switch userAnswer
                
            }       // end of if scanner.hasNext()
            else {                                                                                                              // if scanner does not have next string...
                System.out.println("You did not enter a valid answer.");                                                        // prints error
                return;                                                                                                         // terminates code
            }       // end of else scanner.hasNext()
            
        }       // end of || &&
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }       // end of main method
    
}       // end of public class