package guideForSchool;
import java.util.Scanner;
class AutomorphicChecker
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number to check whether it is automorphic:");
        int in = sc.nextInt();
        int sq = in*in;
        int digits = Integer.toString(in).length();
        
        if (in == sq % Math.pow(10, digits))
            System.out.println ("The number is an automorphic number");
        else
            System.out.println ("The number is not an automorphic number");
    }
}