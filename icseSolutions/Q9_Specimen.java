package icseSolutions;
//This is the solution to the class 11th specimen paper

import java.util.Scanner;
class Q9_Specimen {
    int arr[][];
    int m;//To store the size of the array
    
    Q9_Specimen(int mm) {
        m = mm;
        arr = new int[m][m];
    }
    
    void readarray() {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the elements of the array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();//Input the elements
            }
        }
    }
    
    void large() {
        for (int i = 0; i < m; i++) {
            int max = arr[i][0];
            for (int j = 1; j < m; j++){//Find the largest in current row
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println ("Largest element in row "+(i+1)+" is "+max);
        }
    }
    
    void display() {
        System.out.println ("Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");//Print current element
            }
            System.out.println();
        }
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the size of the array: ");
        int size = scan.nextInt();
        
        //Start the calculations
        Q9_Specimen ob = new Q9_Specimen(size);
        ob.readarray();
        ob.display();
        ob.large();
    }
}