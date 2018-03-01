package guideForSchool;
import java.util.Scanner;
class RmConsDupliChar
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the word to remove consecutive duplicate characters from:");
        String in = sc.next()+" ", out = "";
        
        for (int i = 0; i < in.length() - 1;i++)
        {
            char ch = in.charAt(i);
            if( ch == in.charAt(i+1))
                continue;
            out += ch;
        }
        
        System.out.println ("Manipulated String: "+out);
    }
}