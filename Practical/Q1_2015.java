package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user
 *  3. Check for the validity of the input
 *  4. Start from given number M and for each number, sum up the digits
 *  5. Check if the digits equal to N and count the digits
 *  6. Print the results
 *  7. Stop
   */
import java.util.Scanner;
class Q1_2015 {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        Q1_2015 obj = new Q1_2015();

        System.out.println ("Enter the number greater than 100 and less than 10000");
        int M = scan.nextInt();

        System.out.println ("Enter the number less than 100");
        int N = scan.nextInt();

        if (M < 10000 && M >= 100 && N < 100) {
            obj.check(M, N);
        } else {
            System.out.println ("Invalid Input");
        }
    }

    static void check (int M, int N) {
        int sum = 0, v = 0;

        for (int i = M; i < 10000; i++) {
            int x = i;
            while (x != 0) {
                int r = x % 10;
                sum += r;
                x /= 10;
            }

            if (sum == N) {
                System.out.println (i+" is no.");
                while (i != 0) {
                    i /= 10;
                    v++;
                }
                System.out.println (v+"no. of digits");
                break;
            }
            sum = 0;
            v = 0;
        }
    }
}
