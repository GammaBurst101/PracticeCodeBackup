package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user
 *  3. Find the sum of the factors of the given number
 *  4. Check if the sum is equal to the number itself and print appropriate result
 *  5. Stop
   */
import java.util.Scanner;
class Q7_2018 {//The name is to be kept as "Perfect" according to the question
    int num;
    
    Q7_2018(int nn){
        num = nn;
    }
    
    int sum_of_factors(int i) {
        if (i==1)
            return 1;
        else if (i==0)
            return 0;
        else if (num%i==0)
            return i+sum_of_factors(i-1);
        else
            return sum_of_factors(i-1);
    }
    
    void check() {
        if (sum_of_factors(num-1) == num)
            System.out.println ("The number is a perfect number");
        else
            System.out.println ("The number is not a perfect number");
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the number: ");
        int input = scan.nextInt();
        
        Q7_2018 ob = new Q7_2018(input);
        ob.check();
    }
}