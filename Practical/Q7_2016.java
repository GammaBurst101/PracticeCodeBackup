package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user
 *  3. Create an object and initialise the instance variables
 *  4. Count the number of digits in the input
 *  5. One-by-one, take out digits of the input and sum them after raising them to the power of their respective places
 *  6. Check if the sum is equal to the number itself
 *  7. Display results
 *  8. Stop
   */
import java.util.Scanner;
class Q7_2016{//The class name should be kept 'disarium' according to the question
    int num;
    int size;
    
    Q7_2016(int nn){
        num = nn;
        size = 0;
    }
    
    void countDigit(){
        size = Integer.toString(num).length();//Convert the number to string and count the length of the string to get the number of digis
    }
    
    int sumofDigits(int n, int p){
        if (p == 1)
            return n;
            
        return (int)Math.pow(n%10, p) + sumofDigits(n/10, p-1);
    }
    
    void check(){
        if (num == sumofDigits(num, size))//If the number equals the sum of digits raised to their respective powers then it's a disarium number
            System.out.println ("The number is a disarium");
        else
            System.out.println ("The number is not a disarium");
    }
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int input = scan.nextInt();
        
        Q7_2016 obj = new Q7_2016(input);
        obj.countDigit();
        obj.check();
    }
}