package guideForSchool;
import java.util.Scanner;
class GCDFinder
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the two number to find the HCF of:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lowerNum = Math.min(num1, num2), hcf = 1;
        for (int i = 2; i <= lowerNum; i++)
        {
            if (num1%i == 0 && num2%i == 0)
                hcf = i;
        }
        
        System.out.println ("The HCF of "+num1+" and "+num2+" is "+hcf);
    }
}