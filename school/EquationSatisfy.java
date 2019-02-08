package school;
/*
 * Question:
 * Chapter 8 - Type C
 * 
 * Write a program that invokes a method satis() to find whether four integers a, b, c, d sent to satis() satisfy the equation
 * a^3 + b^3 + c^3 = d^3 or not. The method satis() returns 0 if the above equation is satisfied with the given four numbers
 * otherwise it returns -1.
 */

import java.util.Scanner;
public class EquationSatisfy {
    public static int satis(int a, int b, int c, int d) {
        int answer;
        
        if( ( a*a*a + b*b*b + c*c*c ) == d*d*d )
            answer = 0;
        else 
            answer = -1;
        
        return answer;
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter the values: ");
        
        System.out.print ("a = ");
        int a = scan.nextInt();
        System.out.print ("b = ");
        int b = scan.nextInt();
        System.out.print ("c = ");
        int c = scan.nextInt();
        System.out.print ("d = ");
        int d = scan.nextInt();
        
        if ( satis(a, b, c, d) == 0 )
            System.out.println ("The variables satisfy the equation");
        else 
            System.out.println ("The variables do not satisfy the equation");
    }
}