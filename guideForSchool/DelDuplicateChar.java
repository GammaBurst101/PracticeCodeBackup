package guideForSchool;
import java.util.Scanner;
class DelDuplicateChar
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a word");
        String input = sc.next();
        
        //Variable to store the output
        String out="";
        
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            
            if (ch != ' ')
                out += ch;
                
            //Replace all the duplicates of the current character with spaces so that the program skips adding it to
            //the 'out' variable
            input = input.replace(ch,' ');
        }
        
        System.out.println ("The word without duplicate characters is : "+out);
    }
}