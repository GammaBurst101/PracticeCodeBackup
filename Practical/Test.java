package Practical;
import java.util.Scanner;
class Test {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter");
        int[][] dda = new int[4][4];

        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                dda[i][j] = scan.nextInt();
            }
        }

        //Extraction
        int[] arr = new int[4];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ( i != 0 && i != 3 && j != 0 && j != 3) {
                    arr[index] = dda[i][j];
                    index++;
                }
            }
        }

        sort(arr);

        int in = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ( i != 0 && i != 3 && j != 0 && j != 3) {
                    dda[i][j] = arr[in];
                    in++;
                }
            }
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print (dda[i][j]+"\t");
            }
            System.out.println ();
        }
    }

    static void sort (int[] arr) {
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
}