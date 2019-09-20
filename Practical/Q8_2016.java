package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take the input for the number of rows and columns
 *  3. Check the validity of the input as per the question
 *  4. Take the input for the elements of the matrix
 *  5. Interchange the first and the last row of the matrix
 *  6. Display the new matrix
 *  7. Stop
 */
import java.util.Scanner;
class Q8_2016{//The name of the class should be 'Shift' according to the question
    int mat[][];
    int m;
    int n;

    Q8_2016(int mm, int nn){
        n = nn;
        m = mm;
    }

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the elements of the matrix: ");
        mat = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = scan.nextInt();
            }
        }
    }

    void cyclic(Q8_2016 P) {
        int[] lastRow = P.mat[P.mat.length-1];//Take the ref of the last row
        int[] firstRow = P.mat[0];//Take the ref of the first row

        //Interchanging the references to interchange the rows
        P.mat[P.mat.length-1] = firstRow;
        P.mat[0] = lastRow;
    }

    void display(){//Display the new matrix
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the number of rows and columns: ");
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        if (rows<=5 && cols<=5){
            Q8_2016  obj = new Q8_2016(rows, cols);
            Q8_2016  shifter = new Q8_2016(0, 0);//Object to shift the matrix of 'obj'

            obj.input();
            shifter.cyclic(obj);
            obj.display();
        }else{
            System.out.println ("Invalid number of rows and columns");
        }
    }
}