package icseSolutions;
//This is the solution of the class 11th specimen paper

import java.util.Scanner;
class Q8_Specimen {
    int start, end;
    
    Q8_Specimen (int a, int b) {
        start = a;
        end = b;
    }
    
    int isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) //If we find any factor other than 1 or i then return 0
                return 0;
        }
        return 1; //If we didn't find any factor then it's a prime
    }
    
    int isPalin(int i) {
        int copy = i, rev = 0;
        
        while (copy != 0) {//Reversing the number and storing in 'rev'
            rev = rev*10 + copy%10;
            copy /= 10;
        }
        
        if (rev == i) return 1; //If the original and the reversed are equal then it's a palindrome
        else return 0;
    }
    
    void generate () {
        for (int i = start; i <= end; i++) {
            if ( (isPrime(i) == 1) && (isPalin(i) == 1) )//If it's both palindrome and prime
                System.out.print(i+", ");
        }
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the start and end: ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        
        Q8_Specimen ob = new Q8_Specimen(start, end);
        ob.generate();//Generate the prime palindromes
    }
}