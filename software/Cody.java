package software;
import java.util.*;
class Cody
{
    Scanner sc = new Scanner(System.in);
    Cody co = new Cody();

    public String[] word(String s)
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
        }
        return war;
    }

    public void talk()
    {
        String i = sc.nextLine();
        if (i.equalsIgnoreCase("hey cody"))
        {
            int ra = (int)(Math.random() * 10);
            String we[] = {"Sup!", "What's Up?", "How is it going?", "Hey", "Hi!", "Hello", "It's me", "You called?", "Nice", "Hello there"};
            System.out.println (we[ra]);
            System.out.println ("I am Cody and you?");
            String name = sc.nextLine().trim() + " ";
            System.out.println ("Nice name you got #"+name.substring(0, name.indexOf(' ')));
            System.out.println ("Can we be friends?");
            char c = sc.next().trim().charAt(0);
            if (c == 'y' || c == 'Y')
                System.out.println ("That's awesome");
            else if (c == 'n' || c == 'N')
                System.out.println ("Something is broken! \n And that's my heart :(");
            else{
                System.out.println ("Simple english plz");
                System.out.println ("Wanna do again?");
                char cl = sc.next().trim().charAt(0);

                if (cl == 'n' || cl == 'N')
                {}//To be completed
                else if (cl == 'y' || cl == 'Y') {
                    while (true)
                    {
                        System.out.println ("Enter");
                        c = sc.next().trim().charAt(0);
                    }
                }
            }
            System.out.println ("Okay, forgot that.");
            System.out.println ("You can also ask something");
            System.out.println ("So that we can be better friends");
            String inp = sc.nextLine();
            
        }
    }
}