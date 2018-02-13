package icseSolutions;
import java.util.Scanner;
class Q7_2008
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        int n = sc.nextInt();
        System.out.println ("Enter '1' for palindrome");
        System.out.println ("Enter '2' for perfect");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
            int rev = 0, copy = n;
            while (copy != 0)
            {
                int r = copy%10;
                rev = rev*10 + r;
                copy /= 10;
            }
            if (rev == n)
                System.out.println ("The number is a palindrome number");
            else
                System.out.println ("The number is not a palindrome number");
            break;
            
            case 2:
            int sum = 0;
            for (int i = 1; i<n;i ++)
            {
                if (n%i == 0)
                    sum+=i;
            }
            if (sum == n)
                System.out.println ("The number is a perfect number");
            else 
                System.out.println ("The number is not a perfect number");
            break;
            
            default:
            System.out.println ("Wrong Choice");
        }
    }
}