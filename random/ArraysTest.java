//This class is to check out the new java.util.Arrays class which I found
//in the docuentation
package random;
import java.util.Arrays;
class ArraysTest{
    public static void main (String args[]) {
        int[] arrayToBeSorted ={2, 1, 7, 3, 9, 20, 11};
        
        System.out.println ("Original Array:");
        //The following method prints an array as a string!
        System.out.println (Arrays.toString(arrayToBeSorted));
        
        // Calling Arrays.sort(int[] a) to sort arrayToBeSorted
        Arrays.sort(arrayToBeSorted);
        
        System.out.println ("\nSorted Array:");
        System.out.println (Arrays.toString(arrayToBeSorted));
        
        
        //Using binarySearch()
        System.out.println ("Will try to find '7' in the array");
        System.out.println ("Index = "+Arrays.binarySearch(arrayToBeSorted, 7));
    }
}