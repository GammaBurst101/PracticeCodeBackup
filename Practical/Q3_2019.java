package Practical;
/*
 *  ALGORITHM
 *  1. Start
 *  2. Take input from the user and check its validity
 *  3. Display the input
 *  4. Check each word whether it's palindrome or not
 *  5. If it's not a palindrome then convert it to palindrome
 *  6. Display the modified input
 *  7. Stop
   */

import java.util.Scanner;
class Q3_2019 { 
    String input;
    
    boolean takeInput(){
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the sentence: ");
        input = scan.nextLine();
        
        //Checking the validity
        char lastChar = input.charAt(input.length() - 1);
        if ((lastChar == '.' || lastChar == '!' || lastChar == '?') && (input.equals(input.toUpperCase()))) {
            return true;
        } else {
            System.out.println ("INVALID INPUT");
            return false;
        }
    }
    
    void display(){
        System.out.println (input);
    }
    
    void convert(){
        String word="", sentence = "";
        input = input.substring(0, input.length() - 1);
        input += " ";
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            
            if (ch != ' '){
                word += ch;
            } else {
                if (!checkPalindrome(word))
                    word = convertToPalindrome(word);
                    
                sentence = sentence + " " + word;
                word = "";
            }
        }
        
        input = sentence;
    }
    
    boolean checkPalindrome(String st){
        int h = st.length() - 1;
        for (int i = 0; i < h; i++){
            if (st.charAt(i) != st.charAt(h))
                return false;
            
            h--;
        }
            
        return true;
    }
    
    String convertToPalindrome(String st){
        int length = st.length();
        int startingPnt = length - 2;
        
        //Counting the repeated characters
        int num = 0; 
        for (int i = length - 2; i >= 0; i--){
            if (st.charAt(i) == st.charAt(length - 1))
                num++;
            else 
                break;
        }
        
        //Ignoring repeated characters at the end(if any)
        startingPnt -= num;
        
        //Reversing the given string
        String revSt = "";
        for (int i = startingPnt; i >= 0; i--){
            revSt += st.charAt(i);
        }
        
        return (st+revSt);
    }
    
    public static void main (String args[]) {
        Q3_2019 ob = new Q3_2019();
        
        if (ob.takeInput()) {
            ob.display();
            ob.convert();
            ob.display();
        }
    }
}