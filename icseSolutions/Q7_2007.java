package icseSolutions;
import java.util.Scanner;
class Q7_2007
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the sentence");
        String input = sc.nextLine()+" ";
        System.out.println ("Enter the sentence to search for");
        String s = sc.next(), word="", sentence="";
        int freq=0;
        
        for (int i=0; i<input.length();i++)
        {
            char ch=input.charAt(i);
            if (ch != ' ')
                word += ch;
            else
            {
                if (word.equalsIgnoreCase(s))
                    freq++;
                word="";
            }
        }
        System.out.println ("Searched word occurs: "+freq+" times");
    }
}