package school;
/*Question: 
 * Chapter 8 - Type C
 * 
 * Write a program which uses a method power() to raise a number 'm' to the power 'n'. The method takes 'int' values for 'm' and 'n'
 * and returns the result correctly. Use a default value of '2' for 'n' to make the function calculate squares when this argument is 
 * omitted. Write a 'main()' to get the value of 'm' and 'n' and display the calculated result.
 */
import java.util.Scanner;
public class PowClone {
    public static int power (int m, int n) {
        int result = m;
        
        for (int i = 1; i < n; i++) {
            result *= m;
        }
        
        return result;
    }
    
    //Overloaded method for squaring
    public static int power (int m) {
        int result = m * m;
        return result;
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int num = scan.nextInt();
        
        //Displaying the menu
        System.out.println ("Menu: ");
        System.out.println ("1. Square the number");
        System.out.println ("2. Raise it to a specified power");
        int choice = scan.nextInt();
        
        int answer = 0;
        switch (choice) {
            case 1:
                answer = power(num);
            break;
            
            case 2:
                System.out.print ("Enter the power: ");
                int pow = scan.nextInt();
                answer = power(num, pow);
            break;
            
            default:
                System.out.println ("Wrong Choice");
        }
        
        //Display the answer
        System.out.println ("\f");//Clean the screen
        System.out.println (answer);
    }
}