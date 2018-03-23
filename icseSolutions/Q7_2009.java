package icseSolutions;
import java.util.Scanner;
class Q7_2009
{
    void num_calc (int num, char ch)
    {
        if (ch=='s')
            System.out.println ("Square: "+(num*num));
        else
            System.out.println ("Cube: "+(num*num*num));
    }
    void num_calc (int a, int b, char ch)
    {
        if (ch=='p')
            System.out.println ("Product: "+(a*b));
        else
            System.out.println ("Sum: "+(a+b));
    }
    void num_calc (String s1, String s2)
    {
        System.out.println ("Equal: "+s1.equals(s2));
    }
}
