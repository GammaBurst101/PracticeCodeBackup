package random;
import java.util.Scanner;
class PalindromeWords {
    String para;
    int numOfSentences = 0;
    String sentence[];//to store individual sentences
    public static void main (String args[]) {
        PalindromeWords ob = new PalindromeWords();
        ob.input();
        ob.countSentence();
        ob.storeSentence();
        ob.findPalindromes();
    }
    void input() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a paragraph");
        para = scan.nextLine();
    }
    void countSentence() {
        for (int i=0; i<para.length(); i++) {
            if (para.charAt(i) == '.') //Assuming each sentence ends with a full stop
                numOfSentences ++;
        }
    }
    void storeSentence() {
        sentence = new String[numOfSentences];
        int index=0;//it will tell where to store the current sentence
        String sent="";//it will temporarily store the sentence
        for (int i=0 ; i<para.length(); i++) {
            char ch = para.charAt(i);
            
            if (ch != '.') {
                sent += ch;
            }
            else{
                sentence[index] = sent;
                index ++;
                sent = "";
            }
        }
    }
    void findPalindromes() {
        PalindromeWords ob = new PalindromeWords();
        
        int numOfPalindromes = 0;
        System.out.println ("Palindromic Words: ");
        for (int i=0 ; i<sentence.length; i++) {
            System.out.print ("Sentence "+i+" = ");//print the sentence number
            
            String words[] = sentence[i].split(" ");
            for (int j=0; j<words.length; j++) {
                if (ob.checkPalindrome(words[j])) {
                    System.out.print (words[j]+", ");
                    numOfPalindromes ++;
                }
            }
            System.out.println ();
        }
        System.out.println ("Total number of palindromic words = "+numOfPalindromes);
    }
    boolean checkPalindrome(String word) {
        String rev="";
        for (int i=word.length()-1; i>=0; i--) {
            char ch = word.charAt(i);
            rev += ch;
        }
        
        if (rev.equalsIgnoreCase(word)) return true;
        else return false;
    }
}