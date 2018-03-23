package icseSolutions;
import java.util.Scanner;
class Q6_2010
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println ("Enter the number of customers");
        int l=sc.nextInt();
        String[] name=new String[l];
        int[] amnt=new int[l];
        for (int i=0; i<l; i++)
        {
            System.out.println ("Enter the name of the "+(i+1)+"th customer");
            sc.nextLine();
            name[i]=sc.nextLine();
            System.out.println ("Enter the ticket amount");
            amnt[i]=sc.nextInt();
        }
        
        double[] d=new double[l];
        double[] net=new double[l];
        for (int i=0; i<l; i++)
        {
            if (amnt[i] < 25001)
            d[i]=(double)2/100 * amnt[i];
            else if(amnt[i] < 35000)
            d[i]=(double)10/100 * amnt[i];
            else if(amnt[i] < 55000)
            d[i]=(double)12/100 * amnt[i];
            else if(amnt[i] < 70000)
            d[i]=(double)16/100 * amnt[i];
            else
            d[i]=(double)18/100 * amnt[i];
            
            net[i]=amnt[i]-d[i];
        }
        
        System.out.println ("Sl.No.\tName\tTicket Charges\tDiscount\tNet Amount");
        for (int i=0; i<l; i++)
        {
            System.out.println ((i+1)+"\t"+name[i]+"\t"+amnt[i]+"\t"+d[i]+"\t"+net[i]);
        }
    }
}