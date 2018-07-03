//This class launches BinaryToDecimal class
package random;
import java.util.Scanner;
class BinaryToDecimalConvertor {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Welcome to the binary to decimal convertor application");
        System.out.println ("------------------------------------------------------");
        System.out.println ("Please enter the binary below:");
        String userInput = sc.next().trim();

        //Performing the check whether the input is binary or not
        if (!(checkInput(userInput))){
            System.out.println ("Well, that's not a binary.");
            return;
        }

        BinaryToDecimal converter = new BinaryToDecimal();
        int result = converter.convertToDecimal(userInput);
        System.out.println ("The decimal form of "+userInput+" is "+result);
    }

    private static boolean checkInput(String in) {
        try {//To to parse to long, if fails return false
            long inputLong = Long.parseLong(in);
        }catch (NumberFormatException e) {
            return false;
        }

        int in2 = Integer.parseInt(in);
        int rem;
        while (in2 != 0) {
            rem = in2%10;
            if (rem != 1){
                if (rem != 0)
                    return false;
            }
            in2 /= 10;
        }
        return true;
    }
}