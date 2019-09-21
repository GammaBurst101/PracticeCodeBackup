package Practical;
//The following code was written by Vibhas.
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user for the number of rows and columns
 *  3. Create two matrices with the input
 *  4. Take input for the elements
 *  5. Reverse each element and store in second matrix
 *  6. Display original, and reversed matrix
 *  7. Stop
   */
import java.util.Scanner;
class Q8_2019//The class name should be 'MatRev' as per the question
{
    int arr[][];
    static int m,n;
    Q8_2019(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillArray() //taking input elements
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");

        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++)
            {
                arr[x][y]=sc.nextInt();
            }
        }

    
    }

    int reverse(int x){ //reversing each element in the array
        int rev=0;
        while(x>0)
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }

    void rev(Q8_2019 P)//filling the elements in 2nd array after reversing is done
    {
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++)
            {
                arr[x][y]=reverse(P.arr[x][y]);
            }

        }

    }
    
    void show()
    {
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++)
            {
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }

    
    }

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        
        Q8_2019 ob1=new Q8_2019(mm,nn);
        Q8_2019 ob2=new Q8_2019(mm,nn);
        
        ob1.fillArray();
        System.out.println("The array you filled:");
        ob1.show();
        
        ob2.rev(ob1);
        System.out.println("The elements int the 2nd object:");
        ob2.show();

    }

}