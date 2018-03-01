package guideForSchool;
import java.util.Scanner;
class DisariumFinder
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check whether the number is a disarium number:");
        int num = sc.nextInt();
        int sum = 0, numCopy = num;
        int power= Integer.toString(num).length();
        
        while(num != 0)
        {
            int r = num%10;
            sum += (int)Math.pow(r, power);
            power--;
            num /= 10;
        }
        
        if (sum == numCopy)
            System.out.println("Disarium Confirmed!");
        else
            System.out.println("Not a disarium");
    }
}