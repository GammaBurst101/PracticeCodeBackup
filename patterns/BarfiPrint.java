package patterns;
class BarfiPrint
{
    public static void main (String args[])
    {
        System.out.println ("BARFI!!");
        
        int sp = 0;
        for (int i = 1; i <= 3; i++)
        {
            //Initial Space Loop
            for (int j = 3; j >= i; j--)
            {
                System.out.print (" ");
            }
            
            System.out.print ("/");
            
            //Middle Space Loop
            for (int k = 1; k <= sp; k++)
            {
                System.out.print (" ");
            }
            sp=sp+2;
            
            System.out.print ("\\");
            
            System.out.println ();
        }
        
        //Lower Part
        sp=sp-2;
        for (int i = 3; i >= 1; i--)
        {
            //Initial Space Loop
            for (int j = 3; j >= i; j--)
            {
                System.out.print (" ");
            }
            
            System.out.print ("\\");
            
            //Middle Space Loop
            for (int k = 1; k <= sp; k++)
            {
                System.out.print (" ");
            }
            sp=sp-2;
            
            System.out.print ("/");
            
            System.out.println ();
        }
    }
}