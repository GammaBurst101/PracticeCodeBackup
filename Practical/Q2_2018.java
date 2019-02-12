package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take the user input for M and N
 * 3. If both the values are between 2 and 10 then proceed, otherwise print an error msg and go to step [last]
 * 4. Initiate an integer dda of MxN
 * 5. Take the user input for the elements
 * 6. Display the matrix
 * 7. Sort each row in ascending order using selection sort
 * 8. Display the sorted array
 * 9. Stop
 */
import java.util.Scanner; 
class Q2_2018 {
    void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print (arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void sort (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            sortRow(arr[i]);
        }
    }
    
    void sortRow (int[] arr) {
        //Using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        Q2_2018 obj = new Q2_2018();

        //Taking the user input for the num of rows and cols
        System.out.print ("M = ");
        int M = scan.nextInt();
        System.out.print ("N = ");
        int N = scan.nextInt();

        if ( (M <= 2) || (M >= 10) || (N <= 2) || (N >= 10) ) {
            System.out.println ("Out of range");
            System.exit(0);
        }
        int A[][] = new int[M][N];

        //Taking the user input for the elements
        System.out.println ("Enter the values for the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scan.nextInt();
            }
        }

        System.out.println ("Original Matrix: ");
        obj.display(A);
        obj.sort(A);
        System.out.println ("Matrix after sorting rows: ");
        obj.display(A);
    }
}
