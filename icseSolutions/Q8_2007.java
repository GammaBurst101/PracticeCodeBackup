package icseSolutions;
import java.util.Scanner;
class Q8_2007
{
    public static void main (String ags[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the temperature");
        double temp=sc.nextDouble();
        System.out.println ("Enter '1' to convert it to celsius and '2' to convert it to fahrenheit:");
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                double cel=(double)5/9 * (temp-32);
                System.out.println ("Temperature in degree celsius: "+cel);
                break;
            case 2:
                double fah=1.8 * (temp+32);
                System.out.println ("Temperature in degree fahrenheit: "+fah);
                break;
            default:
                System.out.println ("Invalid Choice");
        }
    }
}