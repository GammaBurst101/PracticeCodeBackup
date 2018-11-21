package school;
/*
 * Change the user input in numbers to words
 * The input will have to be < 1000
 */
import java.util.Scanner;
class NumToWords {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a number");
        int num = scan.nextInt();

        if (num < 1000)
            convertToWords(num);
        else
            System.out.println ("Out of range");
    }

    static void convertToWords(int num) {
        String[] name = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"},
        tens = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"},
        splTens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String numStr = Integer.toString (num);
        String output = "";
        boolean b = false;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Integer.parseInt(numStr.charAt(i) + "");
            int place = numStr.length() - i;

            switch (place) {
                case 3:
                output += name[digit] + " hundred ";

                if ( !(numStr.substring(1).equals("00")) )
                    output += " and ";
                break;

                case 2:
                if (digit != 1) 
                    output += tens[digit];
                else {
                    int lastDigit = num % 10;
                    output += splTens [lastDigit];
                    b = true;
                }
                break;
                
                case 1:
                if (!b)
                    output += name[digit];
                break;
            }
        }
        System.out.println (output);
    }
}