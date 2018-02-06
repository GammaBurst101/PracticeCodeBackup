//Question of this can be found at https://www.codewars.com/kata/equal-sides-of-an-array
package codewars;
import java.util.Scanner;
class EqualSum
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the length of the array");
        int[] arr = new int[scan.nextInt()];
        System.out.println ("Enter the numbers");
        for (int i = 0 ; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }
        
        //Finding the equal sum
        for (int i = 1; i < arr.length; i++)
        {
            if (LeftSum(arr, i) == RightSum(arr, i))
            System.out.println (arr[i]);
        }
    }
    
    private static int LeftSum(int[] num, int pos)
    {
        int sum = 0;
        for (int i = 0 ; i < pos; i++)
        {
            sum += num[i];
        }
        
        return sum;
    }
    
    private static int RightSum(int[] num, int pos)
    {
        int sum = 0;
        for (int i = pos + 1;  i < num.length; i++)
        {
            sum += num[i];
        }
        
        return sum;
    }
}