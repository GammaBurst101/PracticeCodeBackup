package icseSolutions;
import java.util.Scanner;
class Q4_2010
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the element to search for");
        int s = sc.nextInt();
        int[] arr = {5,7,9,11,15,20,30,45,89,97};
        
        int l=0;
        int u=arr.length-1;
        int m;
        while (l<u)
        {
            m=(l+u)/2;
            if (arr[m] < s)
                l=m+1;
            else if (arr[m] > s)
                u=m-1;
            else
            {
                System.out.println ("Searched element "+s+" found at "+(m+1)+" position");
                break;
            }
        }
        if (l>u)
            System.out.println ("Search element not found");
        }
    }
    