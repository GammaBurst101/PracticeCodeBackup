package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take the input from the user
 * 3. Proceed if its length is between 3 and 100, otherwise print an appropriate msg and go to step 11
 * 4. Extract the characters of the input one-by-one.
 * 5. Proceed if it's an alphabet, otherwise go to step 9
 * 6. Add 13 to it. If the sum is greater than the uppercase/lowercase alphabet ascii limit then subtract 26
 * 7. Cast to 'char' and store it
 * 8. Repeat step 5 to 7 until end of the input string then go to step 10
 * 9. If it's anything other than an alphabet then store it as it is
 * 10.Display the result
 * 11.Stop
   */
import java.util.Scanner; 
class Q3_2017 {
    
    String original;
    String encrypted = "";
    
    boolean input() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("");
        
        original = scan.nextLine();
        
        if (original.length() <= 3 || original.length() >= 100)
            return false;
        else
            return true;
    }
    
    void encrypt() {
        for (int i = 0; i < original.length(); i++) {
            char currentLetter = original.charAt(i);
            
            //Checking whether the current letter is an alphabet 
            if ( (currentLetter <= 90 && currentLetter >= 65) || (currentLetter <= 122 && currentLetter >= 97) ) {
                //Add 13 to the current letter to "rotate by 13 places", store the ascii of this encrypted letter
                int asciiCode = currentLetter + 13; 
                
                //If it exceeds the bounds then subtract 26
                if ( (Character.isUpperCase(currentLetter) && asciiCode > 90) || (Character.isLowerCase(currentLetter) && asciiCode > 122) )
                    asciiCode -= 26;
                
                encrypted += (char) asciiCode;
            } else {
                encrypted += currentLetter;
            }
        }
    }
    
    void displayResult() {
        System.out.println ("The cipher text is: ");
        System.out.println (encrypted);
    }
    
    public static void main (String args[]) {
        Q3_2017 obj = new Q3_2017();
        if (obj.input()) {
            obj.encrypt();
            obj.displayResult();
        } else 
            System.out.println ("INVALID LENGTH");
    }
}