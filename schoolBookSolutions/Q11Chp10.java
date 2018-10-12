package schoolBookSolutions;
/*
 * Question:
 * Write a program, which will read a text and count all occurences of a particular word.
   */
import java.util.Scanner;
class Q11Chp10 {
    String input;
    
    void input () {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the sentence: ");
        input = scan.nextLine();
    }
    
    int checkFreq() {
        String currentWord = "", searched = "apple";
        input += " ";
        int freq = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ')
                currentWord += ch;
            else {
                if (currentWord.equalsIgnoreCase( searched ))
                    freq++;
                    
                currentWord = "";
            }
        }
        return freq;
    }
    
    public static void main (String args[]) {
        Q11Chp10 ob = new Q11Chp10();
        ob.input();
        
        System.out.println ("\"Apple\" occurs "+ob.checkFreq()+" times in the input.");
    }
}