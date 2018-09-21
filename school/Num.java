package school;
/**
 * User Input - 432
 * Output - Four Hundred and Thirty-Two
 * 
 * Note:- Input should be under 10,000
 */
import java.util.Scanner;
class Num {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Please enter the number: ");
        int num = scan.nextInt();
        
        if (num >= 10000) return; //See the 'note'
        
        //Setting arrays for three things, normal names of the numbers and the two cases with the tens place
        String[] name = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"},
                 tens = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"},
                 splTens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
                            "Ninteen"};
        
        String strCopy = Integer.toString(num), output = "";
        boolean flag = false;
        for (int i = 0; i < strCopy.length(); i++) {//Main work will be here
            int digit = Integer.parseInt(strCopy.charAt(i)+""), 
            place = strCopy.length()-i ;//To know about the place val of the current digit
            switch (place) {//To have proper place values
                case 4:
                    if (!(name[digit].equals("")))
                        output = name[digit] + " Thousand ";
                break;
                
                case 3:
                    if (!(name[digit].equals("")))
                        output += name[digit] + " Hundred ";
                break;
                
                case 2:
                    if(digit != 1)
                        output += tens[digit];
                    else{
                        int lastDigit = num%10;//temporary fix
                        
                        if (lastDigit != 0)
                            output += splTens[lastDigit];
                        else
                            output += tens[digit];
                        flag = true;;//So that control doesn't enter nxt case and make '12' -> TwelveTwo
                    }    
                break;
                
                case 1:
                    if (!flag)
                        output += name[digit];
                break;
            }
            place--;
        }
        System.out.println (output);
    }
}