/*  Kevin Trinh
    CSE 002
    November 14, 2014
    lab12 - ArrayMath
    
    This lab is an exercise of performing arithmetic on array values.
*/

// add class
public class ArrayMath {
    
    public static String display(double[] x) {
        String out = "{";
        
        for (int j = 0; j < x.length; j++) {
            
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        
        }
        return out + "}";
    }
    
    public static int addArrays(double[] first, double[] second) {
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
               y[] = {2.3, 3, 4, -2.1, 82, 23},
               z[] = {2.3, 13, 14},
               w[] = {2.3, 13, 14, 12},
               v[],
               u[] = {2.3, 12, 14};
        /*
        v = addArrays(x, y);
        
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));
        
        System.out.println("It is " + equals(x, y) + " that " + display(x) + " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) + " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) + " == " + display(z));
        */
    }
}
