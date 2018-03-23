package icseSolutions;
import java.util.Scanner;
class Q6_2009
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the sentence");
        String input = sc.nextLine()+" ", longest="", word="";
        
        for (int i=0; i<input.length(); i++)
        {
            char ch=input.charAt(i);
            if (ch != ' ')
                word += ch;
            else
            {
                if (longest.length() < word.length())
                    longest = word;
                word="";
            }
        }
        
        System.out.println ("Longest word: "+longest.length());
    }
}