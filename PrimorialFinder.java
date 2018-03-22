import java.util.Scanner;
class PrimorialFinder
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the number");
        int num = scan.nextInt();
        long primorial = 1, factor = 1;
        
        while ( num != 0)
        {
            factor ++;
            boolean isPrime = true;
            for (int i = 2; i < factor; i++)
            {
                if (factor % i==0)
                    {
                        isPrime = false;
                        break;
                    }
            }
            if (isPrime == true)
            {   
                num--;
                primorial *= factor;
            }
        }
        System.out.println ("Primorial: "+primorial);
    }
}