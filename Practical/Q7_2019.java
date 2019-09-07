package Practical;
//The following code was written by vibhas. Therefore, no algo It's the soln of Q7 of 2019 theory paper

import java.util.Scanner;
class Q7_2019 {
    int n;
    int l;
    
    Q7_2019(int nn) {
        n = nn;
    }
    
    int sumPow(int i) {
        if (i==0)
            return 1;
        else
            return ((int)Math.pow(i%10, l) * 10 + sumPow(i/10));
    }
    
    void isArmstrong() {
        if (n == sumPow(n))
            System.out.println ("Armstrong");
        else
            System.out.println ("Not");
    }
    
    public static void main (String[] ar) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number: ");
        int num = sc.nextInt();
        l = Integer.toString(num).length();
        
        Q7_2019 ob = new Q7_2019(num);
        ob.isArmstrong();
    }
}