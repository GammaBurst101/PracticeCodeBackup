package icseSolutions;
//This is the solution to the specimen paper of class 11

import java.util.Scanner;
class Q7_Specimen {
    String str;
    
    Q7_Specimen() {}
    
    void readsent() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the sentence: ");
        str = scan.nextLine();
    }
    
    int freq_vowel(String w) {
        int count = 0;
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')//Check if it's a vowel
                count++;
        }
        return count;
    }
    
    void arrange() {
        System.out.println ("Word\tFrequency Of Vowels");
        str += " ";
        String word = ""; //To store each word
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ')
                word += ch;//Make a word
            else {//Display the word and no. of vowels
                System.out.println (word+"\t\t"+freq_vowel(word));
                word = "";
            }
        }
    }
    
    public static void main (String args[]) {
        Q7_Specimen ob = new Q7_Specimen();
        ob.readsent();
        ob.arrange();
    }
}