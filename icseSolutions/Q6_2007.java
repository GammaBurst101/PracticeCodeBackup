package icseSolutions;
import java.util.Scanner;
class Q6_2007
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the length of the array");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println ("Enter the elements of the array:");
        for (int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int max=arr[0], min=arr[0], sum=0;
        for (int i=0; i<l; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
            sum += arr[i];
        }
        System.out.println ("Max: "+max);
        System.out.println ("min: "+min);
        System.out.println ("Sum: "+sum);
                    }
                }