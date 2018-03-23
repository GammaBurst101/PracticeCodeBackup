package random;
import java.util.Scanner;
class AlphabetFreq
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the word");
        String input = sc.next().toLowerCase();
        
        System.out.println ("==========================");
        System.out.println ("Alphabet\tFrequency");
        System.out.println ("==========================");
        for (char ch='a'; ch<='z'; ch++)
        {
            int freq = 0;
            for (int i=0; i<input.length(); i++)
            {
                if (ch == input.charAt(i))
                    freq++;
                }
            if (freq != 0)
                System.out.println (ch+"\t\t"+freq);
            }
        }
    }