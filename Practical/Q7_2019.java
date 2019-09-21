package Practical;
//This code was written by Vibhas
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user
 *  3. Store the length of the input in a variable
 *  4. Extract the digits one-by-one and add them after raising them to power equal to length
 *  5. Check if sum equals the number itself
 *  6. Display results
 *  7. Stop
   */
import java.util.Scanner;
class Q7_2019 //The class name should be kept 'ArmNum' as per the question
{
    int n,l;
    
    Q7_2019(int nn)
    {
        n=nn;
        l=Integer.toString(n).length();
    }

    int sum_pow(int i) // recursive method to find sum of digits raised to the power of the length
    {
        if(i==0)
            return 0;
        else
        {
            return (int)Math.pow(i%10,l) + sum_pow(i/10);
        }
    }

    void isArmstrong(){
        if(n==sum_pow(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not armstrong");
    }

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        int num=sc.nextInt();
        Q7_2019 ob=new Q7_2019(num);
        ob.isArmstrong();

    }
}