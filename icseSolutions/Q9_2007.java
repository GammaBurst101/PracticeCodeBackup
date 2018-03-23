package icseSolutions;
import java.util.Scanner;
class Q9_2007
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the word");
        String input = sc.next();
        boolean isPalin = palin(input);
        if (isPalin)
            System.out.println ("The word is palindrome");
        else
            System.out.println ("The word is not palindrome");
        }
        
    private static boolean palin(String word)
    {
        int l=word.length();
        String str="";
        word += " ";
        for (int i=0; i<l; i++)
        {
            char ch=word.charAt(i);
            str = ch + str;
        }
        if (word.equals(str+" "))
            return true;
        else
            return false;
    }
    }