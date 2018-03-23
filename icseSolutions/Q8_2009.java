package icseSolutions;
import java.util.Scanner;
class Q8_2009
{
    static boolean isBuzz (int num)
    {
        if (num%10==7 || num%7==0)
            return true;
        
        return false;
    }
    static int findGCD(int a, int b)
    {
        if (a%b==0)
            return b;
        
        return findGCD(b, a%b);
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter '1' for finding buzz number and '2' for finding GCD");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println ("Enter the number");
                int num=sc.nextInt();
                if(isBuzz(num))
                    System.out.println ("It is a buzz number");
                else
                    System.out.println ("Not a buzz number");
            break;
            
            case 2:
                System.out.println ("Enter the two numbers");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                System.out.println ("GCD: "+findGCD(num1, num2));
            break;
            
            default:
                System.out.println ("Wrong choice");
        }
    }
}
        