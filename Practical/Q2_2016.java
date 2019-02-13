package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take the input of the size
 * 3. Proceed if it's between 3 and 10 otherwise print an error msg and stop
 * 4. Take the input for the elements of the matrix
 * 5. For sorting, taking out the non-boundary elements in an array, sort them and put them back.
 * 6. Calculate the sum of the diags
 * 7. Display original matrix, sorted matrix, diagonal elements and sum of diags
 * 8. Stop
 */
import java.util.Scanner;
class Q2_2016 {
    int[][] dda;
    int diagSum;

    boolean input () {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the size of the dda: ");
        int size = scan.nextInt();

        if (size <= 3 || size >= 10)    
            return false;

        dda = new int[size][size];

        System.out.println ("Enter the elements of the dda: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                dda[i][j] = scan.nextInt();
            }
        }
        return true;
    }

    void sort() {
        //Extracting the non-boundary elements in an array
        int[] arr = new int[(dda.length - 2)*(dda.length - 2)];
        int index = 0;
        for (int i = 0; i < dda.length; i++) {
            for (int j = 0; j < dda.length; j++) {
                if ( i != 0 && i != (dda.length-1) && j != 0 && j != (dda.length - 1)) {
                    arr[index] = dda[i][j];
                    index++;
                }
            }
        }

        sortArr(arr);

        //Putting back the sorted elements into the dda
        index = 0;
        for (int i = 0; i < dda.length; i++) {
            for (int j = 0; j < dda.length; j++) {
                if ( i != 0 && i != (dda.length - 1) && j != 0 && j != (dda.length - 1)) {
                    dda[i][j] = arr[index];
                    index++;
                }
            }
        }
    }

    void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( arr[i] > arr[j] ) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void sumAndShowDiags () {
        System.out.println ("DIAGONAL ELEMENTS: ");
        for (int i = 0; i < dda.length; i++) {
            for (int j = 0; j < dda.length; j++) {
                if ( i == j || (i + j == dda.length - 1) ) {
                    diagSum += dda[i][j];
                    System.out.print (dda[i][j]+"\t");
                }else
                    System.out.print (" \t");
            }
            System.out.println();
        }
        System.out.println ("Sum of the diagonals = "+diagSum);
    }

    void display () {
        for (int i = 0; i < dda.length; i++) {
            for (int j = 0; j < dda.length; j++) {
                System.out.print (dda[i][j] + "\t");
            }
            System.out.println ();
        }
    }

    public static void main (String args[]) {
        Q2_2016 obj = new Q2_2016();
        if (obj.input()) {
            System.out.println ("ORIGINAL MATRIX: ");
            obj.display();
            System.out.println ("REARRANGED MATRIX: ");
            obj.sort();
            obj.display();
            obj.sumAndShowDiags();
        } else
            System.out.println ("THE MATRIX SIZE IS OUT OF RANGE");
    }
}