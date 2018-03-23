package random;
import java.util.Scanner;
class IPCheck
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter the IP address to check for its validity:");
        String in = sc.next();
        
        int numOfDots=0;
        for (int i=0; i<in.length(); i++)
        {
            if (in.charAt(i)== '.')
                numOfDots++;
        }
        if  (numOfDots != 3)
        {
            System.out.println ("Invalid IP");
            return;
        }
        
        String[] ip = in.split("\\.");
        for (int i=0; i<ip.length; i++)
        {
            try{
                int num = Integer.parseInt(ip[i]);
                if (num < 0 || num > 255)
                {
                    System.out.println ("Invalid IP");
                    return;
                }
            }
            catch(Exception e){
                System.out.println ("Invalid IP");
                return;
            }
        }
        System.out.println ("The IP is valid");
    }
}