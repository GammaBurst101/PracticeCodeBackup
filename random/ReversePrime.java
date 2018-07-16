/*This program prints reversible primes under 1000
 * 
 * A reversible prime is a prime number which if reversed is another prime.
 * Eg. 13
   */
package random;
class ReversePrime {
    public static void main (String args[]) {
        System.out.println ("The reversible primes under 1000 are:");
        ReversePrime obj = new ReversePrime();
        
        for (int n = 13; n < 1000; n++) {//First reversible prime is 13
            if (obj.isPrime(n)){
                if (obj.isPrime( obj.reverse(n) )){//Check if its reverse is also a prime
                    System.out.print (n + " ");
                }
            }
            
            if (n == 389) System.out.println (); // Otherwise the list will become very long without a line break
        }
    }
    
    private boolean isPrime(int n) {
        int factor = 2;
        while (factor < n/2) {//The factors will always be < n/2
            if (n % factor == 0) return false;
            factor ++;
        }
        
        return true;
    }
    
    private int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse*10 + (n % 10);
            n /= 10;
        }
        return reverse;
    }
}