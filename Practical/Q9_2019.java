package Practical;
//The following code was written by Vibhas. 
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user
 *  3. Separate the vowels from the consonants and put vowels at the beginning
 *  4. Display the original and new word
 *  5. Count the number of vowels and consonants
 *  6. Display the results
 *  7. Stop
   */
import java.util.Scanner;
class Q9_2019//The class name should be kept 'Rearrange' according to the question
{
    String word,newrd;
    Q9_2019()
    {
        word="";
        newrd="";
        
    }
    void readWord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        word=sc.next().toUpperCase().trim();
        
    }
    void freq_vow_con()
    {
        int countVow=0,countCon=0;
        for(int x=0;x<word.length();x++)
        {
            char ch=word.charAt(x);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                countVow++;
            }
            else
            countCon++;
        }
        System.out.println("No. of vowels:\t"+countVow);
        System.out.println("no. of consonants:\t"+countCon);
    }
    void arrange()
    {
        String first="",second="";
        for(int x=0;x<word.length();x++)
        {
            char ch=word.charAt(x);
             if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                first+=ch;
            }
            else
            second+=ch;
        }
        newrd=first+second;
    }
    void display()
    {
        System.out.println("Your input:\t"+word);
        System.out.println("The output:\t"+newrd);
    }
    public static void main(String ar[])
    {
        Q9_2019 ob=new Q9_2019();
        ob.readWord();
        ob.arrange();
        ob.display();
        ob.freq_vow_con();
        
    }
}