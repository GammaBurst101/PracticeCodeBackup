package software;
import java.util.*;
class Cody
{
    Scanner sc = new Scanner(System.in);
    Cody co = new Cody();
    boolean b = false;

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
                {
                    System.out.println ("Alright");
                    co.exit();
                }
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

            String inputar[] = co.word(inp);

            for (int x = 0; c < inputar.length; x++)
            {
                if (inputar[x].equalsIgnoreCase("your"))
                {
                    for (int y = 0; y<inputar.length; y++)
                    {
                        if (inputar[y].equalsIgnoreCase("age"))
                        {
                            System.out.println ("My age is...umm...");
                            System.out.println ("By my stack and heap, it is 1 day");
                        }
                        else if (inputar[y].equalsIgnoreCase("girlfriend"))
                        {
                            System.out.println ("Oooooo!");
                            System.out.println("I don't have any");
                            System.out.println("But...I like Siri");
                            System.out.println("She is virtually so beautiful");
                        }
                        else if (inputar[y].equalsIgnoreCase("boyfriend"))
                        {
                            System.out.println("If you are a boy, then we are friends");
                            System.out.println("If you're a girl, then ...");
                            System.out.println("Haha");
                        }
                        else if (inputar[y].equalsIgnoreCase("creator"))
                        {
                            System.out.println("TheCodeSmith created me");
                            System.out.println("What a great code he is! ;)");
                        }
                        else if (inputar[y].equalsIgnoreCase("name"))
                        {
                            System.out.println("I'm TheCodeSmith's TheCody");
                        }
                        else if (inputar[y].equalsIgnoreCase("hobby"))
                        {
                            System.out.println("Hmm...Talking alot");
                        }
                    }
                }
                else if (inputar[x].equalsIgnoreCase("you"))
                {
                    for (int y = 0; y < inputar.length; y++)
                    {
                        if (inputar[y].equalsIgnoreCase("who"))
                        {
                            boolean f = false;
                            for (int z = 0; z < inputar.length; z++)
                            {
                                if (inputar[y].equalsIgnoreCase("created"))
                                {
                                    System.out.println("TheCodeSmith :)");
                                    f = true;
                                }
                            }
                            if (f == false)
                                System.out.println ("I'm TheCodeSmith's bot TheCody");
                        }
                        else if (inputar[y].equalsIgnoreCase("created"))
                            System.out.println ("TheCodeSmith's effort");
                        else if (inputar[y].equalsIgnoreCase("doing"))
                        {
                            for (int z = 0; z < inputar.length; z++)
                            {
                                if (inputar[z].equalsIgnoreCase("what"))
                                    System.out.println ("chatting");
                                else if (inputar[z].equalsIgnoreCase("how"))
                                    System.out.println ("Gooood!");
                            }
                        }
                        else if (inputar[y].equalsIgnoreCase("girlfriend"))
                        {

                            System.out.println("Cope");
                            System.out.println("But...I like Siri");
                            System.out.println("She's gr8");
                        }
                    }
                }
            }
            System.out.println ("Sorry, I'm in my initial phase. So, I have a small data cet. Oh! I mean set");
            System.out.println ("You wanna do it again?");
            char c2 = sc.next().trim().charAt(0);

            if (c2 == 'y' || c2 == 'Y')
                while(true)
                {
                    inp = sc.nextLine();
                }

            else 
            {
                System.out.println ("Some other time then");
                co.exit();
            }
        }
    }

    public void iterate()
    {
        System.out.println ("So, you wanna do it all again?");
        char ch = sc.next().trim().charAt(0);
        if (ch == 'y' || ch == 'Y')
            while (true)
            {
                co.talk();
            }
        else{
            System.out.println ("No problem");
            co.exit();
        }
    }
    
    public void exit()
    {
        b = true;
        main(String[] ar)//to be solved 
    }
    
    public static void main (String[] ar)
    {
        if (b == false)
        {
            co.talk();
            co.iterate();
        }
        else
        System.out.println ("Have a good time");
    }
}