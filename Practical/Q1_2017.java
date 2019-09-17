package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take the total number of boxes to be packed as an input from the user
 * 3. Proceed if the number of boxes are less than or equal to 1000, otherwise print an appropriate error msg and go to step 7
 * 4. Starting from the largest carton, find how many of them are needed to pack the boxes.
 * 5. If some boxes are left then move on to the next lower-sized carton
 * 6. Repeat steps 3 and 4 until there are no boxes left
 * 7. Stop
   */
import java.util.Scanner; 
class Q1_2017 {
    int numOfBoxes;
    
    void calculate (int n) {
        numOfBoxes = n;
        int[] cartonSizes = {48, 24, 12, 6};
        
        int left, totalReqd = 0;
        System.out.println ("For packaging, we need :");
        for (int i = 0; i < cartonSizes.length; i++) {
            int reqd = numOfBoxes / cartonSizes[i];
            totalReqd += reqd;
            numOfBoxes %= cartonSizes[i];
            
            if (reqd != 0)
                System.out.println (reqd+", "+cartonSizes[i]+"-sized cartons");
        }
        
        if (numOfBoxes != 0)
            totalReqd++;
        
        System.out.println ("Remaining Boxes \t= "+numOfBoxes);
        System.out.println ("Total number of boxes \t= "+n);
        System.out.println ("Total number of cartons \t= "+totalReqd);
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        Q1_2017 obj = new Q1_2017();
        
        System.out.print ("N = ");
        int input = scan.nextInt();
        
        if (input <= 1000) {
            obj.calculate( input );
        } else {
            System.out.println ("INVALID INPUT");
        }
    }
}