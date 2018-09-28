package schoolBookSolutions;
/*
 * Question : 
 * Write a short program that doubles every element of an array A[4][4]
 */
import java.util.Scanner;
class Q8Chp11 {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        int[][] A = new int[4][4];
        
        //Input module
        System.out.println ("Please enter the elements for the 4x4 matrix: ");
        for (int i = 0; i < 4; i++ ) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        
        //Processing module
        for (int i = 0; i < 4; i++ ){
            for (int j = 0; j < 4; j++) {
                A[i][j] *= 2;
            }
        }
        
        //Output module
        for (int i = 0; i < 4; i++ ) {
            for (int j = 0; j < 4; j++ ) {
                System.out.print (A[i][j] + " ");
            }
            System.out.println ();
        }
    }
}