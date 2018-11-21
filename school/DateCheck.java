package school;
/*
 * User will enter a date.
 * Check whether it is valid and also show the number of days passed since 1st Jan of that year.
 * 
 * Eg: INPUT - 22/2/2012
 *     OUTPUT - Valid
 *              Number of days: 53
 */
import java.util.Scanner;
class DateCheck {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the date: ");
        int day = scan.nextInt();
        int month = scan.nextInt();
    }
}