package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take the string input from the user
 * 3. Proceed if it ends with '.', '!' or '?' otherwise print and error msg and stop
 * 4. Store each word of the string in an array
 * 5. Loop through the array and check whether a word begins and ends with a vowel.
 * 6. If it does then store it in a string variable and count it
 * 7. If it doesn't begin and end with a vowel then store it in another string variable
 * 8. Display the result by adding the two strings and showing the count
 * 9. Stop
 */
import java.util.Scanner;
public class Q3_2016
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        String str1="", str2="", ans;
        String arr[];
        int count=0;
        
        System.out.println("Enter Your Sentence : ");
        String input = scan.nextLine();
        
        char lastChar = input.charAt(input.length()-1);
        if(lastChar == '?' || lastChar == '.' || lastChar == '!') {
            arr = storeInArr(input);
            
            for(int i = 0; i < arr.length; i++) {
                char firstLetter = arr[i].charAt(0);
                char lastLetter = arr[i].charAt( arr[i].length()-1 );
                
                if( isVowel(firstLetter) && isVowel(lastLetter) ) {
                    count++;
                    str1 += arr[i] + " ";
                }
                else {
                    str2 += arr[i] + " ";
                }
            }
            
            ans = str1.trim() + " " + str2.trim();
            
            System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL : "+count);
            System.out.println("NEW STRING : \n"+ans);
        }
        else
            System.out.println("INVALID INPUT");
    }
    
    static boolean isVowel (char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        ch = Character.toLowerCase(ch);
        
        for (int i = 0; i < 5; i++) {
            if (ch == vowels[i])
                return true;
        }
        
        return false;
    }
    
    static String[] storeInArr (String str) {
        //Counting words
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') 
                count ++;
        }
        
        String[] words = new String[count];
        str += " ";
        int index = 0;
        String currentWord = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ')
                currentWord += ch;
            else {
                words[index] = currentWord;
                index++;
                currentWord = "";
            }
        }
        
        return words;
    }
}