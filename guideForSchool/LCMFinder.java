package guideForSchool;
import java.util.Scanner;
class LCMFinder
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the two numbers to find the LCM of:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int pro = num1*num2, higherNum = Math.max(num1, num2);
        int lcm = pro;
        
        for (int i = higherNum; i < pro; i++)
        {
            if (i%num1==0 && i%num2==0)
            {
                lcm = i;
                break;
            }    
        }
        
        System.out.println ("The LCM of "+num1+" and "+num2+" is "+lcm); 
    }
}