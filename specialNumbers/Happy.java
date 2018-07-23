/*Sum of square of digits equals one
 * Eg. 22120 = 2^2 + 2^2 + 1^2 + 2^2 + 0^2 
 *           = 13 = 1^2 + 3^2 
 *           = 10 = 1^2 + 0^2
 *           =1
   */
package specialNumbers;
import java.util.Scanner;
class Happy {
    public static void main (String args[]) {
        
        //Welcoming and input
        System.out.println ("Welcome to Happy Number checker app");
        System.out.println ("A happy number is a special number whose sum of square of digits equals one\n* Eg. 22120 = 2^2 + 2^2 + 1^2 + 2^2 + 0^2 \n *           = 13 = 1^2 + 3^2 \n *           = 10 = 1^2 + 0^2\n *           =1");
        System.out.print ("Enter a number to check: ");
        int input = new Scanner(System.in).nextInt();
        
        //Main work
        int sum = input;
        while (sum > 9) {
            input = sum;
            sum = 0;
            while (input != 0) {
                int r = input%10;
                sum += r*r;
                input /= 10;
            }
        }
        
        //Output
        if (sum == 1) System.out.println ("\fBe happy because your number is happy, too!");
        else System.out.println ("\fYour number is sad but you don't have to be.");
    }
}