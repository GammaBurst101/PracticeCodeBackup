/*
 * It will input two matrices and show the sum/diff matrix
   */
package random;

import java.util.Scanner;
class MatrixAdd{
    //The user-provided matrices
    int[][] a, b;
    
    //The resultant of the matrices
    int[][] result;
    
    int row, col;
    
    static Scanner scan = new Scanner(System.in);
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println ("The program adds and subtracts two matrices together!\n");
        System.out.println ("Enter the num of rows and columns:");
        row = scan.nextInt();
        col = scan.nextInt();
        
        a = new int[row][col];
        b = new int[row][col];
        result = new int[row][col];
        
        System.out.println ("Enter the elements: ");
        System.out.println ("Matrix 1");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                a[i][j] = scan.nextInt();
            }
        }
        
        System.out.println ("Matrix 2");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                b[i][j] = scan.nextInt();
            }
        }
        
        //Cleaning the screen and printing the outputs
        System.out.println("\f");
        printMatrix (a , "Matrix 1");
        printMatrix (b , "Matrix 2");
    }
    
    void add () {
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    
    void subtract(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                result[i][j] = a[i][j] - b[i][j];
            }
        }
    }
    
    //Utility method to print the matrix
    void printMatrix(int[][] matrix , String message) {
        System.out.println ("\n" + message + ":");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print (matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main (String args[]) {
        MatrixAdd obj = new MatrixAdd();
        obj.input();
        
        //Asking the user whether to add or subtract the matrices
        System.out.println ("Menu: ");
        System.out.println ("1. Add ");
        System.out.println ("2. Subtract");
        int choice = scan.nextInt();
        
        switch(choice) {
            case 1:
                obj.add();
            break;
            
            case 2:
                obj.subtract();
            break;
            
            default:
                System.out.println("Wrong choice");
        }
        
        obj.printMatrix ( obj.result , "Result Matrix" );
    }
}