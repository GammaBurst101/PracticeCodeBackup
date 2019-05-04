package random;
/*My soln to the problem 1 of the qualification round of codejam 2018
   */
import java.util.Scanner;
public class CodeJam {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.print(" ");
        int testCases = scan.nextInt();
        
        for (int i = 1; i <= testCases; i++) {
            int sheildPower = scan.nextInt();
            String instructionList = scan.next();
            
            int result = solve(sheildPower, instructionList);
            
            if (result == -1)
                System.out.println ("Case #"+i+": IMPOSSIBLE");
            else
                System.out.println ("Case #"+i+": "+result);
        }
    }
    
    static int solve(int d, String p) {
        if (countNumOfShoots(p) > d)
            return -1;
        
        int dmg = calcDmg(p);
        
        if (dmg <= d)//If the dmg done is less than or equal to the max dmg that the sheild can withstand then we don't need
            return 0;//to change anything
        else
            return (dmg - d);
    }
    
    static int countNumOfShoots(String p) {
        int shoots = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 's') shoots ++;
        }
        return shoots;
    }
    
    static int calcDmg(String p) {
        int power = 1;
        int dmg = 0;
        
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 's') dmg += power;
            else power *= 2;
        }
        
        return dmg;
    }
}













