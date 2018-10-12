package schoolBookSolutions;
/*
 * Question : 
 * Let A(n x n) that are not diagonal array. Write a program to find the sum of all the elements which lie on either
 * diagonal. For example, for the matrix shown below, you program should output
 * 68 = (1 + 6 + 11 + 16 + 4 + 7 + 10 + 13)
 * 
 * |  1  2  3  4 |
 * |  5  6  7  8 |
 * |  9 10 11 12 |
 * | 13 14 15 16 |
   */
import java.util.Scanner;
class Q9Chp11 {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the size of the matrix: ");
        int n = scan.nextInt();
        
        //Input Module
        int[][] matrix = new int[n][n];
        System.out.println ("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        //Processing Module
        int r = 0, c = n - 1, left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i==j )
                    left += matrix[i][j]; 
            }
            right += matrix[r][c];
            r++;
            c--;
        }
        
        //Output Module
        if ( n % 2 == 0)
            System.out.println ("Sum of diagonals: "+(left + right));
        else
            System.out.println ("Sum of diagonals: "+((left + right) - matrix[n/2][n/2]));
    }
}