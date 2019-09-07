package Practical;
//The following code was written by vibhas. Therefore, no algo. It's the soln of Q9 of 2019 theory paper
import java.util.Scanner;
class Rearrange {
    String wrd, newWrd;
    
    Rearrange() {
        wrd = "";
        newWrd = "";
    }
    
    void readWord() {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a word in uppercase: ");
        wrd = sc.next().trim().toUpperCase();
    }
    
    void freq_vow_con() {
        int countV = 0, countC = 0;
        
        for (int x = 0; x < wrd.length(); x++) {
            char ch = wrd.charAt(x);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                countC++;
            else
                countC++;
        }
        System.out.println ("Num of vowels: "+countV);
        System.out.println ("Num of consonants: "+countC);
    }
    
    void arrange() {
        String takeV = "", takeC = "";
        for (int x = 0; x < wrd.length(); x++) {
            char ch = wrd.charAt(x);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                takeV += ch;
            else
                takeC += ch;
        }
        newWrd = takeV + takeC;
    }
    
    void display() {
        System.out.println ("Original: "+wrd);
        System.out.println ("Rearranged: "+newWrd);
    }
    
    public static void main (String[] ar) {
        Rearrange r = new Rearrange();
        r.readWord();
        r.freq_vow_con();
        r.arrange();
        r.display();
    }
}