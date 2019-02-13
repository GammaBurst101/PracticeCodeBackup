package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take an integer input from the user
 * 3. Do step 4 and 5 as many times as there are digits in the input and then go to step 7
 * 4. If the number is a prime then proceed otherwise go to step 6
 * 5. Shift the digits in a cyclic manner, print it and go to step 4
 * 6. Print that the input is not a circular prime
 * 7. Print that the input is a circular prime
 * 8. Stop
 */
import java.util.Scanner;
class Q1_2016 {
    boolean isPrime (int n) {
        int numOfFactors = 0; 

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                numOfFactors ++;
        }

        if (numOfFactors == 2)
            return true;
        else
            return false;
    }

    int shift (int n) {
        String str = Integer.toString (n);
        char firstDigit = str.charAt(0);
        String newNum = str.substring(1) + firstDigit;

        return Integer.parseInt(newNum);
    }

    void checkCircularPrime (int original) {
        boolean isCPrime = true;
        int n = original, numOfDigits = Integer.toString(n).length();

        for (int i = 1; i <= numOfDigits; i++) {
            if (isCPrime) {
                System.out.println (n);
                isCPrime = isPrime(n);
                n = shift(n);
            } else {
                System.out.println (n);
                n = shift(n);
            }
        }

        if (isCPrime)
            System.out.println (original + " IS A CIRCULAR PRIME");
        else
            System.out.println (original + " IS NOT A CIRCULAR PRIME");
    }

    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("N = ");
        int input = scan.nextInt();

        Q1_2016 obj = new Q1_2016();
        obj.checkCircularPrime(input);
    }
}