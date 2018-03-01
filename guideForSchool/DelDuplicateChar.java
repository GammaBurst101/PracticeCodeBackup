package guideForSchool;
import java.util.Scanner;
class DelDuplicateChar
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a word");
        String input = sc.next(), out="";
        
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch != ' ')
                out += ch;
            input = input.replace(ch,' ');
        }
        
        System.out.println ("The word without duplicate characters is : "+out);
    }
}