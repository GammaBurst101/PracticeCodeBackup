package random;
import java.util.Scanner;
class ButterflyPattern {
    int[][] dda;
    
    boolean input() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the size of the array:" );
        int size = scan.nextInt();
        
        if (size < 3 || size % 2 == 0) {
            System.out.println ("Invalid Size");
            return false;
        }
        
        dda = new int[size][size];
        
        System.out.println ("Enter the elements: ");
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j++) {
                dda[i][j] = scan.nextInt();
            }
        }
        return true;
    }
    
    void showPattern() {
        System.out.println ("Pattern ");
        for (int i = 0; i < dda.length; i ++) {
            for (int j = 0; j < dda[0].length; j++) {
                if ( ( j >= i && (i+j) >= (dda.length-1) ) || ( j <= i && (i+j) <= (dda.length-1) ) )
                    System.out.print (dda[i][j] + "\t");
                else 
                    System.out.print ("\t");
            }
            System.out.println ();
        }
    }
    
    public static void main (String args[]) {
        ButterflyPattern obj = new ButterflyPattern();
        if (obj.input())
            obj.showPattern();
    }
}