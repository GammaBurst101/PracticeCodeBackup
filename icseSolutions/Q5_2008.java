package icseSolutions;
import java.util.Scanner;
class Q5_2008
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a sentence");
        String input = sc.nextLine();
        input += " ";
        
        String word = "", sentence = "";
        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch != ' ')
            {
                if (Character.isUpperCase(ch))
                    word += Character.toLowerCase(ch);
                else
                    word += Character.toUpperCase(ch);
            }
            else
            {
                sentence = sentence + " " + word;
                word = "";
            }
        }
        
        System.out.println ("Manipulated String= "+sentence);
    }
}