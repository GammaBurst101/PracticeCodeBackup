package Practical;
/*
 *  ALGORITHM:-
 *  1. Start
 *  2. Take input from the user
 *  3. Check for the validity of the input
 *  4. Sort the single dimensional array in ascending order using selection sort
 *  5. Fill the double dimensional array using the single dimensional array as per the requirements given in the question
 *  6. Display the single dimensional array
 *  7. Display the double dimentional array
 *  8. Stop
   */

import java.util.Scanner;
class Q2_2019 { 
    int a[];
    int b[][];

    boolean input() {
        Scanner scan = new Scanner (System.in);
        System.out.print("N= ");
        int n = scan.nextInt();
        
        //Checking the conditions given in question
        if ( n <= 2 || n >= 10 ) {
           System.out.println ("MATRIX SIZE OUT OF RANGE");
           return false;
        } else {
            System.out.print ("ENTER THE ELEMENTS OF SINGLE DIMENSIONAL ARRAY: ");
            a = new int[n];
            b = new int[n][n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            
            return true;
        }
    }
    
    void sort() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    void fillMatrix() {
        int index = 0, restartPoint;
        for (int i = 0; i < b.length; i++){
            restartPoint = b[0].length - i;
            for (int j=0; j < b[0].length; j++){
                if (j == restartPoint)
                    index = 0;
                    
                b[i][j] = a[index];
                index++;
            }
            index = 0;
        }
    }
    
    void display() {
        //Displaying the sorted array
        System.out.println ("SORTED ARRAY: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print (a[i] + " ");
        }
        System.out.println ();
        
        //Displaying the filled matrix
        System.out.println ("FILLED MATRIX");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println ();
        }
    }
    
    public static void main (String args[]) {
        Q2_2019 ob = new Q2_2019();

        if (ob.input()) {
            ob.sort();
            ob.fillMatrix();
            ob.display();
        }
    }
}