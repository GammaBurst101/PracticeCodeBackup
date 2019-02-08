package Practical;
/*  ALGORITHM:
 * 1. Start
 * 2. Take input from the user
 * 3. If the number is even and between 9 and 50 then procede otherwise print appropriate msg and go to step 8
 * 4. Go from 3 to the input number / 2, repeating the following 3 steps
 * 5. Check if the current number is prime
 * 6. If it is prime then check if the number reqd for the sum is also prime
 * 7. If both checkes are passed then print the pair
 * 8. Stop
   */
import java.util.Scanner;
class Q1_2018 {
    
    int num;
    
    void takeInput() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the number below: ");
        num = scan.nextInt();
    }
    
    boolean checkEligibility () {
        if (num % 2 != 0) {
            System.out.println ("INVALID INPUT. NUMBER IS ODD");
            return false;
        } else if ( num <= 9 || num >= 50) {
            System.out.println ("INVALID INPUT. NUMBER IS OUT OF RANGE");
            return false;
        } else {
            return true;
        }
    }
    
    void findPairs() {
        for (int i = 3; i <= (num/2); i++) {
            if ( checkPrime(i) && checkPrime(num-i) ) {//If both the numbers are prime then print them
                System.out.println (i+", "+(num-i));
            }
        }
    }
    
    boolean checkPrime(int n) {
        int numOfFactors = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                numOfFactors ++;
        }
        
        if (numOfFactors == 2) //If a num has only 2 factors then it is a prime
            return true;
        else//If it has more than 2 factors then it's not a prime
            return false;
    }
    
    public static void main (String args[]) {
        Q1_2018 obj = new Q1_2018();
        obj.takeInput();
        if (obj.checkEligibility()) { //Proceed only if the input number satisfies the conditions given in the question
            obj.findPairs();
        }
    }
}