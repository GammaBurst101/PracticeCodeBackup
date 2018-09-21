/*
 * Question for mid-term practical file:
 * WAP to input a dda and find:
 * 1. Sum of individual rows and columns
 * 2. Total sum of left and right diagonals
 * 3. Middle element and its coordinates (if exists)
 * 
 * Note- The matrix WILL have to be a square
*/
package school;
import java.util.Scanner;
class DDA {
    int[][] arr;
    int n;
    
    public static void main (String args[]) {
        DDA obj = new DDA();
        obj.input();
        obj.sumRowCol();
        obj.sumDiag();
    }

    void input() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the size of the array");
        n=scan.nextInt();

        arr = new int[n][n];
        
        System.out.println ("Enter the elements: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }
    
    void sumRowCol() {
        System.out.println ("Sum of rows and columns");
        System.out.println ("\tRows\tColumns");

        for (int i=0; i<n; i++) {
            int sumR=0, sumC=0;
            for (int j=0; j<n; j++) {
                sumR += arr[i][j];
                sumC += arr[j][i];
            }
            System.out.println ((i+1)+"\t"+sumR+"\t"+sumC);
        }
    }

    void sumDiag() {
        int lDiag=0, rDiag=0, total=0;
        int a=0, b=n-1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j)
                    lDiag += arr[i][j];
            }
            rDiag += arr[a][b];
            b--; a++;
        }
        
        if (n%2 != 0) {
            int mid = arr[n/2][n/2];
            total = lDiag + rDiag - mid;

            System.out.println ("Mid element: "+mid+", address: "+(n/2)+","+(n/2));
        } else {
            total = lDiag + rDiag;    
        }
        System.out.println ("Sum of diagonals: "+total);
    }
}