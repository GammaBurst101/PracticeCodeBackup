package random;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    /*  MY APPROACH:
    1. From 'a', find the greatest num and check if it's a multiple of every other element
    2. If it's not then add it to itself to get to its next multiple and do the check again
    3. After finding a possible candidate, check if it's a factor of all elements of 'b'
    4. If it is then count it
    5. Keep repeating until the number becomes greater than the smallest element of 'b'
     */
    static int getTotalX(int[] a, int[] b) {
        int currentNum = findMax(a);
        int count = 0;

        while ( currentNum <= findMin(b) ) {
            if ( isMultipleOfAll(currentNum, a) && isFactorOfAll(currentNum, b) )
                count ++;

            //Get to the next possible candidate
            currentNum += currentNum;
        }

        return count;
    }

    static int findMax (int[] arr) {
        int max = arr[0];
        for (int element: arr) {
            if (max < element)
                max = element;
        }
        return max;
    }

    static int findMin (int[] arr) {
        int min = arr[0];
        for (int element: arr) {
            if (min > element)
                min = element;
        }
        return min;
    }

    static boolean isMultipleOfAll(int n, int arr[]) {
        boolean isMultiple = true;

        for (int ele: arr) {
            if (n % ele != 0) {
                isMultiple = false;
                break;
            }
        }

        return isMultiple;
    }

    static boolean isFactorOfAll(int n, int arr[]) {
        boolean isFactor = true;

        for (int ele: arr) {
            if (ele % n != 0) {
                isFactor = false;
                break;
            }
        }

        return isFactor;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println ();
        int aSize = scan.nextInt();
        int bSize = scan.nextInt();

        int a[] = new int[aSize];
        int b[] = new int[bSize];

        for (int i = 0; i < aSize; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < bSize; i++) {
            b[i] = scan.nextInt();
        }
        
        System.out.println (getTotalX(a, b));
    }
}
