/*  Kevin Trinh
    CSE 2
    HW02 - Arithmetic
    September 5, 2014
*/

// define a class
public class Arithmetic{
    
    // add main method
    public static void main(String[] args){
        
        int nSocks=3;               // numbers of pairs of socks
        double sockCost$=2.58;      // cost per pair of socks, $ part of variable name
    
        int nGlasses=6;             // number of drinking glasses
        double glassCost$=2.29;     // cost per glass
    
        int nEnvelopes=1;           // number of envelope boxes
        double envelopeCost$=3.25;  // cost per envelope box
    
        double taxPercent=0.06;     // amount of sales tax as decimal
        double tax=1.06;            // amount of item + tax

        // subtotals
        double subtotalSockCost$=nSocks*sockCost$;                                          // subtotal cost of socks
        double subtotalGlassCost$=nGlasses*glassCost$;                                      // subtotal cost of drinking glasses
        double subtotalEnvelopeCost$=nEnvelopes*envelopeCost$;                              // subtotal cost of envelope boxes
        double totalSubtotal$=subtotalSockCost$+subtotalGlassCost$+subtotalEnvelopeCost$;   // total subtotals
        
        // totals
        double totalSockCost$=nSocks*sockCost$*tax;                                         // total cost of socks
        double totalGlassCost$=nGlasses*glassCost$*tax;                                     // total cost of drinking glasses
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$*tax;                             // total cost of envelope boxes
        double total$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$)*tax;              // total cost
        
        // prints out associated socks costs
        System.out.println("Item purchased: Socks");                                            // prints item name
        System.out.println("Pairs of socks purchased: "+nSocks+"");                             // prints number of items purchased
        System.out.println("Cost per pair of socks: $"+sockCost$+"");                           // prints cost per item
        System.out.println("Socks subtotal: $"+subtotalSockCost$+"");                           // prints item subtotal
        System.out.println("Sales tax: $"+(int)(subtotalSockCost$*taxPercent*100)/100.0);       // prints item sales tax to %.2f
        System.out.println("Socks total: $"+(int)(totalSockCost$*100)/100.0);                   // prints total item cost to %.2f
        System.out.println(" ");                                                                // prints a break
        
        // prints out associated drinking glasses costs
        System.out.println("Item purchased: Drinking glasses");                                 // prints item name
        System.out.println("Number of drinking glasses purchased: "+nGlasses+"");               // prints number of items purchased
        System.out.println("Cost per drinking glass: $"+glassCost$+"");                         // prints cost per item
        System.out.println("Drinking glass subtotal: $"+subtotalGlassCost$+"");                 // prints item subtotal
        System.out.println("Sales tax: $"+(int)(subtotalGlassCost$*taxPercent*100)/100.0);      // prints item sales tax to %.2f
        System.out.println("Drinking glass total: $"+(int)(totalGlassCost$*100)/100.0);         // prints total item cost to %.2f
        System.out.println(" ");                                                                // prints a break
        
        // prints out associated envelope costs
        System.out.println("Item purchased: Envelopes");                                        // prints item name
        System.out.println("Number of boxes purchased: "+nEnvelopes+"");                        // prints number of items purchased
        System.out.println("Cost per box: $"+envelopeCost$+"");                                 // prints cost per item
        System.out.println("Envelope subtotal: $"+subtotalEnvelopeCost$+"");                    // prints item subtotal
        System.out.println("Sales tax: $"+(int)(subtotalEnvelopeCost$*taxPercent*100)/100.0);   // prints item sales tax to %.2f
        System.out.println("Envelope total: $"+(int)(totalEnvelopeCost$*100)/100.0);            // prints total item cost to %.2f
        System.out.println(" ");                                                                // prints a break
        
        // prints out total associated costs
        System.out.println("Total subtotal: $"+(int)(totalSubtotal$*100)/100.0);                // prints total subtotal to %.2f
        System.out.println("Total tax: $"+(int)(totalSubtotal$*taxPercent*100)/100.0);          // prints total tax to %.2f
        System.out.println("Total cost: $"+(int)(total$*100)/100.0);                            // prints total to %.2f
    }
}