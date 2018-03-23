package icseSolutions;
import java.util.Scanner;
class Q4_2009
{
    String name, add;
    int amnt;
    char type;
    double d;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter your name, address, amount of purchase and type of purchase: 'L' for Laptop and 'D' for Desktop");
        name=sc.nextLine();
        add=sc.nextLine();
        amnt=sc.nextInt();
        type=sc.next().trim().charAt(0);
    }
    
    void calculate()
    {
        switch(type)
        {
            case 'L':
                if (amnt <= 25000)
                    d = (0.0/100) * amnt;
                else if (amnt <= 57000)
                    d = (5.0/100) * amnt;
                else if (amnt <= 100000)
                    d = (7.5/100) * amnt;
                else
                    d = (10.0/100) * amnt;
            break;
            
            case 'D':
                if (amnt <= 25000)
                        d = (0.0/100) * amnt;
                    else if (amnt <= 57000)
                        d = (5.0/100) * amnt;
                    else if (amnt <= 100000)
                        d = (7.5/100) * amnt;
                    else
                        d = (10.0/100) * amnt;
            break;
            
            default:
                System.out.println ("Wrong type entered");
            }
        }
    
    void display()
    {
        System.out.println ("Name: "+name);
        System.out.println ("Address: "+add);
        System.out.println ("Amount to be paid: "+(amnt - d));
    }
    
    public static void main (String args[])
    {
        Q4_2009 obj = new Q4_2009();
        obj.input();
        obj.calculate();
        obj.display();
    }
}