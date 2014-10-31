/*  Kevin Trinh
    CSE 2
    lab10 - MethodCalls
    October 31, 2014
    
    This code is an exercise on methods calling other methods.
*/

// add class
public class MethodCalls{
    
    // add addDigit method
    public static int addDigit(int number, int digit) {
        
        if (digit >= 0 && digit <= 9 && number > 0) {                           // if digit is (0,9] and number > 0...
            
            String digitString  = Integer.toString(digit);                      // converts digit to string
            String numberString  = Integer.toString(number);                    // converts number to string
            String addedDigitString = (digitString + numberString);             // adds digit and number strings
            int addedDigitInt = Integer.parseInt(addedDigitString);             // parses strings to an int
            return addedDigitInt;                                               // returns the int
        
        }
        else if (digit >= 0 && digit <= 9 && number < 0) {                      // if digit is (0,9] and number < 0...
            
            String digitString  = Integer.toString(digit);                      // converts digit to string
            String numberString  = Integer.toString(Math.abs(number));          // converts absolute value of number to string
            String addedDigitString = ("-" + digitString + numberString);       // adds negative to digit and number strings
            int addedDigitInt = Integer.parseInt(addedDigitString);             // parses strings to an int
            return addedDigitInt;                                               // returns the int
            
        }
        else {                                                                  // if digit is outside of (0,9]...
            return number;                                                      // return the initial number
        }
        
    }
    
    // add join method
    public static int join(int digit, int number) {
        
        if (digit >= 0 && digit <= 9 && number > 0) {                           // if digit is (0,9] and number > 0...
            return addDigit(digit, number);                                     // returns value from addDigit
        }
        else if (digit >= 0 && digit <= 9 && number < 0) {                      // if digit is (0,9] and number < 0...
            return addDigit(digit, number);                                     // returns value from addDigit
        }
        else if (digit < 0 && number < 0) {                                     // if digit and number are both negative...
            String digitString  = Integer.toString(Math.abs(digit));            // converts absolute value of digit to string
            String numberString  = Integer.toString(Math.abs(number));          // converts absolute value of number to string
            String addedDigitString = (digitString + numberString);             // adds digit and number strings
            int addedDigitInt = Integer.parseInt(addedDigitString);             // parses strings to an int
            return addedDigitInt;                                               // returns the int
        }
        else {                                                                  // otherwise...
            String digitString  = Integer.toString(digit);                      // converts digit to string
            String numberString  = Integer.toString(number);                    // converts number to string
            String addedDigitString = (digitString + numberString);             // adds digit and number strings
            int addedDigitInt = Integer.parseInt(addedDigitString);             // parses strings to an int
            return addedDigitInt;                                               // returns the int
        }
    }
    
    // add main method
    public static void main(String[] args) {
        
        int a=784,b=22,c;                                                       // declares and assigns values to a and b, initializes c
        
        c=addDigit(a,3);                                                        // calls addDigit method and assigns value to c
        
        System.out.println("Add 3 to "+a+" to get "+c);                         // prints
        c=addDigit(addDigit(c,4),5);                                            // assigns new value to c
        
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);               // prints
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));            // prints
       
       c=join(a,b);                                                             // asigns new value to c
        
        System.out.println("Join "+a+" to "+b+" to get "+c);                    // prints
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));// prints
        System.out.println("Join -9 and -90 to get "+join(-9,-90));             // prints
        
    }
}  