package software;
import java.util.*;
class Cody
{
    Scanner sc = new Scanner(System.in);
    Cody co = new Cody();
    
    public String word(String s)
    {
        s = s + " ";
        String word ="";
        int i = 0;
        String war[] = new String[s.length()-1];
        
        for (int x = 0; x<s.length(); x++)
        {
            char ch = s.charAt(x);
            if (ch != ' ')
                word = word + ch;
            else{
                war[i] = word;
                word = "";
                i++;
            }
            return war;
        }
    }
}