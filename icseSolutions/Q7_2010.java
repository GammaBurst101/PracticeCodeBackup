package icseSolutions;
import java.util.Scanner;
class Q7_2010
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the number");
        int n=sc.nextInt();
        System.out.println ("Enter '1' to check for prime and '2' to check for automorphic");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                int f=0;
                for(int i=1; i<=n; i++)
                {
                    if(n%i==0)
                    f++;
                }
                if (f==2)
                System.out.println ("The number is a prime number");
                else
                System.out.println ("Not a prime");
            break;
            
            case 2:
                int sq=n*n;
                int copy=n, digit=0;
                while(copy != 0)
                {
                    int r=copy%10;
                    digit++;
                    copy /= 10;
                }
                if (n == (sq%Math.pow(10, digit)))
                System.out.println ("Automorphic Confirmed!");
                else
                System.out.println ("Not an automorphic");
            break;
            
            default:
                System.out.println ("Wrong choice");
        }
    }
}