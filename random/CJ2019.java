package random;
/*
 * This is my soln to the CJ problem 1 of 2019
   */
import java.util.Scanner;
public class CJ2019 {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ();
        
        int testCases = scan.nextInt();
        
        for (int i = 1; i <= testCases; i++) {
            System.out.println ("Case #"+i+": "+findNums(scan.nextInt()));
        }
    }
    
    static String findNums(int n) {
        for (int i = 1; i <= (n/2); i++) {
            
            int posOfFour = findPosOfFour(i);
            
            if (posOfFour == -1){
                int second = findPosOfFour(n-i);
                if (second == -1){
                    return i+" "+(n-i);
                } else if (second != 0){
                    i = Integer.parseInt(Integer.toString(i).replace('4', '3')) ;
                }
            } else if (posOfFour != 0) {
                i += Math.pow(10, posOfFour) - 1;
            }
        }
        return "ERROR";
    }
    
    static int findPosOfFour(int n) {
        int pos = 0;
        while (n != 0) {
            if (n % 10 == 4) {
                return pos;
            }
            
            pos++;
            n /= 10;
        }
        return -1;
    }
}