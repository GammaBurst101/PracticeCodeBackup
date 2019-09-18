package Practical;
/*
 *  ALGORITHM
 *  1. Start
 *  2. Take the input from the user
 *  3. For each individual word of the sentence, check if it begins with a capital letter
 *  4. Count words beginning with capital letter
 *  5. Display the original sentence and the frequency
 *  6. Stop
   */
import java.util.Scanner;
class Q9_2018 {// Class name -> Capital
    String sent;
    int freq;
    
    Q9_2018() {}
    
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the sentence: ");
        sent = scan.nextLine();
    }
    
    boolean isCap(String w){
        if (Character.isUpperCase(w.charAt(0)))
            return true;
        else
            return false;
    }
    
    void display() {
        System.out.println (sent);
        
        String word="";
        sent += " ";
        for (int i = 0; i < sent.length(); i++) {
            char ch = sent.charAt(i);
            
            if (ch != ' ')
                word += ch;
            else{
                if (isCap(word))
                    freq ++;
                    
                word = "";
            }
        }
        
        System.out.println ("Frequency: "+freq);
    }
    
    public static void main (String args[]) {
        Q9_2018 obj = new Q9_2018();
        obj.input();
        obj.display();
    }
}