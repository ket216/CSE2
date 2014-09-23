/*  Kevin Trinh
    CSE 2
    hw04 - CourseNumber
    September 21, 2014

    This program prompts the user to input a course number
    in the form of YYYYSS (Y = year, S = semester).
    The program then prints out a the year and semester of the course.
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class CourseNumber {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner courseNumberInput = new Scanner(System.in);                                                                 // creates new scanner courseNumberInput
        
        System.out.println("Enter a course number (######): ");                                                             // prompts user to enter a course number
        if (courseNumberInput.hasNextInt()) {                                                                               // if the scanner has an integer...
            int courseNumber = courseNumberInput.nextInt();                                                                 // declares and stores integer in variable courseNumber
            
            int courseNumberYear = (int)(courseNumber/100.0);                                                               // extracts course year from courseNumber
            int courseNumberSemester = courseNumber-(courseNumberYear*100);                                                 // extracts semester from courseNumber
            
            if (courseNumber < 186510 || courseNumber > 201440) {                                                           // if the coursenumber is outside range...
                System.out.println("You did not enter a valid course number.");                                             // returns error
                return;                                                                                                     // terminates code
            }
            else if (courseNumberSemester == 10) {                                                                          // if the semester is "10"...
                System.out.println("The course was offered in the Spring of " + courseNumberYear + ".");                    // prints Spring course
            }
            else if (courseNumberSemester == 20) {                                                                          // if the semester is "20"...
                System.out.println("The course was offered in the first summer session of " + courseNumberYear + ".");      // prints 1st summer course
            }
            else if (courseNumberSemester == 30) {                                                                          // if the semester is "30"...
                System.out.println("The course was offered in the second summer session of " + courseNumberYear + ".");     // prints 2nd summer course
            }
            else if (courseNumberSemester == 40) {                                                                          // if the semester is "40"...
                System.out.println("The course was offered in the Fall of " + courseNumberYear + ".");                      // prints Fall course
            }
            else {                                                                                                          // if the semester is anything else...
                System.out.println("You did not enter a valid course number.");                                             // returns error
                return;                                                                                                     // terminates code
            }
        }
        else {                                                                                                              // if scanner did not have an integer...
            System.out.println("You did not enter a valid course number.");                                                 // returns error
            return;                                                                                                         // terminates code
        }
    }
}