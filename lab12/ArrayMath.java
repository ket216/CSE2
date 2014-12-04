/*  Kevin Trinh
    CSE 002
    November 14, 2014
    lab12 - ArrayMath
    
    This lab is an exercise of performing arithmetic on array values.
*/

// add class
public class ArrayMath {
    
    // add display method
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
    
    // add equals method
    public static boolean equals(double[] first, double[] second) {
        
        boolean equals = false;
        
        if (first.length != second.length) {
            
            return false;
            
        }
        else {
            
            for(int i = 0; i < first.length; i++) {
                
                if(first[i] == second[i]) {
                    
                    equals = true;
                    
                }
                else {
                    
                    equals = false;
                    break;
                    
                }
                
            }
            return equals;
            
        }
        
    }
    
    // add addArrays method
    public static double[] addArrays(double[] first, double[] second) {
        
        if (first.length == second.length) {
            
            double addedArray[] = new double[first.length];
            
            for (int i = 0; i < first.length; i++) {
                
                addedArray[i] = first[i]+second[i];
                
            }
            return addedArray;
            
        }
        else {
            
            double addedArray2[] = new double[first.length];
            
            for (int i = 0; i < second.length; i++) {
                
                addedArray2[i] = first[i]+second[i];
                
            }
            
            for (int j = second.length; j < first.length; j++) {
                
                addedArray2[j] = first[j];
                
            }
            return addedArray2;
            
        }
        
    }
    
    // add main method
    public static void main(String[] args) {
        
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
               y[] = {2.3, 3, 4, -2.1, 82, 23},
               z[] = {2.3, 13, 14},
               w[] = {2.3, 13, 14, 12},
               v[],
               u[] = {2.3, 12, 14};
               
        v = addArrays(x, y);
        
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));
        
        System.out.println("It is " + equals(x, y) + " that " + display(x) + " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) + " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) + " == " + display(z));
    }
}
