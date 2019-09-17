package Practical;
/*
 * ALGORITHM
 * 1. Start
 * 2. Take input for the size of the matrix
   */
import java.util.Scanner;
class Q8_2018{//The class name should be kept 'EqMat'
    int a[][];
    int m;
    int n;
    
    Q8_2018(int mm, int nn){
        m = mm;
        n = nn;
    }
    
    void readarray(){
        Scanner scan = new Scanner(System.in);
        a = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                a[i][j] = scan.nextInt();
            }
        }
    }
    
    int check(Q8_2018 P, Q8_2018 Q){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (P.a[i][j] != Q.a[i][j])
                    return 0;
            }
        }
        return 1;
    }
    
    void print(){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        } 
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the number of rows and columns: ");
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        
        //Initialising the matrices
        Q8_2018 matrix1 = new Q8_2018(rows, cols);
        Q8_2018 matrix2 = new Q8_2018(rows, cols);
        
        //Filling the matrices
        System.out.println ("Enter the elements of the first matrix: ");
        matrix1.readarray();
        
        System.out.println ("Enter the elements of the second matrix: ");
        matrix2.readarray();
        
        //Checking the equality of the two matrices
        if (matrix1.check(matrix1, matrix2) == 1)
            System.out.println ("The matrices are equal");
        else
            System.out.println ("The matrices are not equal");
    }
}