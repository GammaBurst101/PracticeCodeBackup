package guideForSchool;
import java.util.Scanner;
class FiboNumChecker
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check whether it is present in the fibonacci series:");
        int input = sc.nextInt();
        int num1 = 0, num2 = 1, sum;
        boolean inSeries = false;
        
        if (input == num1 || input == num2)
            inSeries = true;
            
        while (num2 < input)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            
            if (num2 == input)
            {
                inSeries = true;
                break;
            }
        }
        
        if (inSeries == true)
            System.out.println ("The number is present in the fibonacci series");
        else
            System.out.println ("The number is not present in the fibonacci series");
    }
}