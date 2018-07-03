//This class converts binary to decimal
package random;
import java.util.ArrayList;
class BinaryToDecimal 
{
    //Declarations
    private int decimal=0;
    private ArrayList<Integer> binary = new ArrayList<Integer>();
    
    public int convertToDecimal(String input) {
        //Store the digits of input in the AL but in the reverse order
        storeInAl(input);
        
        //Change to decimal
        for (int i = 0; i <= binary.size() - 1; i++) {
            decimal += Math.pow(2, i) * binary.get(i);
        } 
        return decimal;
    }
    
    private void storeInAl(String input) {
        for (int i = input.length()-1; i >= 0; i--) {
            binary.add(Integer.parseInt(""+input.charAt(i)));
        }
    }
}