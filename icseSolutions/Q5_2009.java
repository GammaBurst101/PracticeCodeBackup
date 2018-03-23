package icseSolutions;
import java.util.Scanner;
class Q5_2009
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Type '1' for a triangle and type '2' for an inverted triangle");
        int choice = sc.nextInt();
        System.out.println ("Enter the number of terms:");
        int n = sc.nextInt();
        switch(choice)
        {
            case 1:
                for (int i=1; i<=n; i++)
                {
                    for (int j=1; j<=i; j++)
                    {
                        System.out.print (i);
                    }
                    System.out.println ();
                }
            break;
            
            case 2:
                for (int i=n; i>=1; i--)
                {
                    for (int j=1; j<=i; j++)
                    {
                        System.out.print (i);
                    }
                    System.out.println ();
                }
            break;
            
            default:
                System.out.println ("wrong Choice");
            }
        }
    }