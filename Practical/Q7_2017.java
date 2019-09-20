package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input form the user
 *  3. Reverse the order of the digits
 *  4. Check if the reversed number equals the original number
 *  5. Print the result
 *  6. Stop
   */
import java.util.Scanner;
class Q7_2017 {//The class name should be 'Palin'
    int num, revnum;
    
    Q7_2017(){
        num = 0;
        revnum = 0;
    }
    
    void accept(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scan.nextInt();
    }
    
    int reverse(int y){
        if (y!=0){
            revnum = (revnum*10) + (y%10);
            return reverse(y/10);
        } else {
            return revnum;
        }
    }
    
    void check(){
        if (num == reverse(num))
            System.out.println ("The number is palindrome");
        else
            System.out.println ("The number is not palindrome");
    }
    
    public static void main(String args[]){
        Q7_2017 obj = new Q7_2017();
        obj.accept();
        obj.check();
    }
}