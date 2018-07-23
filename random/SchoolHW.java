/*school homework
 * Specs:
 * Input a range, find primes and print:
 * Each prime
 * Total no. of primes
 * Sum of primes
   */
package random;
import java.util.Scanner;
class SchoolHW {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        SchoolHW finder = new SchoolHW();
        
        System.out.println ("Please enter the limits:");
        System.out.print ("Lower limit: ");
        int lowerLm = scan.nextInt();
        System.out.print ("Upper limit: ");
        int upperLm = scan.nextInt();
        
        int numOfPrimes = 0, sum = 0;
        for (int i = lowerLm; i <= upperLm; i++) {
            if (finder.checkPrime(i)){
                System.out.print (i + " ");
                numOfPrimes++;
                sum += i;
            }
        }
        
        System.out.println ("\nTotal number of primes: "+numOfPrimes);
        System.out.println ("Sum of all primes: "+sum);
    }
    
    boolean checkPrime(int num) {
        for (int i = 2; i <= num/2; i++) {//the factors will always be (< num/2)
            if ( num % i == 0) 
                return false;
        }
        
        return true;
    }
}
