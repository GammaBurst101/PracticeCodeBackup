package icseSolutions;
import java.util.Scanner;
class Q5_2007
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of n");
        int n = sc.nextInt();
        double series=1;
        
        for (int i=2; i<=n; i++)
        {
            int sum=0, pro=1;
            for (int j=1; j<=i; j++)
            {
                sum += j;
                pro *= j;
            }
            series += (double) sum/pro;
        }
        
        System.out.println (series);
    }
}