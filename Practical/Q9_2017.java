package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take the input from the user
 *  3. Store the length of the input in an instance variable
 *  4. Interchange the position of the first and the last letter of the input
 *  5. Sort the input alphabetically by first storing it in an array and then sorting the array
 *  6. Display the results
 *  7. Stop
   */
import java.util.Scanner;
class Q9_2017{//The class name should be 'SwapSort' according to the question
    String wrd;
    int len;
    String swapwrd;
    String sortwrd;
    
    Q9_2017(){
        wrd = "";
        len = 0;
        swapwrd = "";
        sortwrd = "";
    }
    
    void readword(){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the word in upper case");
        wrd = scan.next();
        len = wrd.length();
    }
    
    void swapchar(){
        swapwrd = wrd.charAt(len-1) + wrd.substring(1, len-1) + wrd.charAt(0);
    }
    
    void sortword(){
        //Store the letters in an array, sort and array and join the letters to make a sorted word
        char[] ch = new char[len];
        for (int i = 0; i < len; i++){
            ch[i] = wrd.charAt(i);
        }
        
        //Selection Sort
        for (int i = 0; i < len-1; i++){
            for (int j = i+1; j < len; j++){
                if (ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < len; i++){
            sortwrd += ch[i];
        }
    }
    
    void display(){
        System.out.println ("Original Word: "+wrd);
        System.out.println ("Swapped Word: "+swapwrd);
        System.out.println ("Sorted Word: "+sortwrd);
    }
    
    public static void main (String args[]) {
        Q9_2017 obj = new Q9_2017();
        obj.readword();
        obj.swapchar();
        obj.sortword();
        obj.display();
    }
}