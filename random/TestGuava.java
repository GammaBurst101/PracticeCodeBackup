package random;
    
/*
 * I downloaded the guava library and now trying to use it for some random uses.
 */

//These are the classes I wanna try out
import com.google.common.primitives.Doubles;//Math methods which are not in java.lang.Math
import com.google.common.math.DoubleMath;//Methods for 'double' data type things

class TestGuava {
    public static void main (String args[]) {
        TestGuava obj = new TestGuava();
        
        obj.testLog2();
    }
    
    private void testCompare(){
        double a = 14.4;
        double b = 39.22;
        
        //The doc says it works like String.compareTo(String)
        int result = Doubles.compare(a, b);
        
        //Should output -1
        System.out.println ("Doubles.compare(14.4, 39.22) gives the output : "+result);
    }
    
    private void testFactorial() {
        int n = 5; //This number's factorial will be found using guava
        
        double factorial = DoubleMath.factorial( n );
        
        System.out.println ("Factorial of " + n + " is " + factorial);
    }
    
    private void testLog2() {
        int n = 4; //This number's log-base2 will be found 
        
        double logBase2 = DoubleMath.log2 ( n );
        
        System.out.println ("Log base-2 of "+n+" is "+logBase2);
    }
}