package icseSolutions;
import java.util.Scanner;
class Q6_2008
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the length of the array");
        int l = sc.nextInt();
        String[] names = new String[l];
        
        System.out.println ("Enter the city names");
        for (int i =0; i<l; i++)
        {
            names[i] = sc.next();
        }
        
        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < l-1; j++)
            {
                if (names[j].compareTo(names[j+1]) > 0)
                {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[i+1] = temp;
                }
            }
        }
        
        System.out.println ("Array sorted alphabetically");
        for (String i:names)
            System.out.println(i+ " ");
    }
}