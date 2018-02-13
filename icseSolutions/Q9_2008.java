package icseSolutions;
import java.util.Scanner;
class Q9_2008
{
    public static void main (String ags[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of 'x' for series 2:");
        int x = sc.nextInt();
        
        int num=2, sum=0;
        for (int i=1; i<=20; i++)
        {
            if(i%2==0)
            sum -= num;
            else
            sum += num;
            
            num += 2;
        }
        
        double sum2=0;
        for (int i=2; i<=20; i+=3)
        {
            sum2 += (double)x/i;
        }
        
        System.out.println ("The sum of the series 1 = "+sum);
        System.out.println ("The sum of the series 2 = "+sum2);
        
    }
}