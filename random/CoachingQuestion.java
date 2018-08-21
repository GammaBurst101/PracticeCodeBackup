/*
 * Given by - Pushkar
 * 
 * The user will give input a number which will be an even number and between 9 and 49.
 * Find two prime numbers (they can be the same) whose sum equals to the input number
   */
package random;
import java.util.Scanner;
class CoachingQuestion {
    public static void main (String args[]) {
        System.out.println ("Please enter the number: ");
        int n = new Scanner(System.in).nextInt();
        if (n < 9 || n > 49 || (n%2) == 1) //Read the comments on line 4
            System.out.println ("Invalid Input");
        else {
            for (int i = 3; i < n; i++) {
                int prime1 = generatePrime(i);
                //Here, argument is the no. after which we need a prime Eg. generatePrime(9) -> 13
                for (int j = 3; j < n; j++) {
                    int prime2 = generatePrime(j);
                    if ((prime1 + prime2)==n){
                        System.out.println (prime1+" and "+prime2);
                        i = n;//To stop outer loop
                        break;
                    }
                }
            }
        }
    }
    static int generatePrime(int num) {
        boolean isPrime = true;;
        while(true) {//We don't have an upper lim
            num ++;
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) return num;
            else isPrime = true;
        }
    }
}
