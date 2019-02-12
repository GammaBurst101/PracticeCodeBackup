package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Input the number of teams
 * 3. Proceed if it is between 2 and 9, otherwise print appropriate error msg and go to step 7
 * 4. Create an array to store the names
 * 5. Find the length of the team which has the longest name
 * 6. Print the names of the teams, one character at a time, by continuously looping through the array
 * 7. Stop
   */
import java.util.Scanner;
class Q3_2018 {
    String[] teamNames;
    int longestNameLength;
    
    void inputTeamNames (int numOfTeams) {
        Scanner scan = new Scanner (System.in);
        teamNames = new String[numOfTeams];
        
        for (int i = 0; i < numOfTeams; i++) {
            System.out.print ("Team "+(i+1)+": ");
            teamNames[i] = scan.nextLine();
        }
    }
    
    void findLongestName() {
        for (int i = 0; i < teamNames.length; i++) {
            if (teamNames[i].length() > longestNameLength) 
                longestNameLength = teamNames[i].length();
        }
    }
    
    void printNames() {
        for (int j = 0; j < longestNameLength; j++) {
            for (int i = 0; i < teamNames.length; i++) {
                if ( j < teamNames[i].length() ) //If the name has a character at the current index then print it
                    System.out.print ( teamNames[i].charAt(j) + "\t" );
                else //Otherwise, print a blank space
                    System.out.print ( " \t" );
            }
            System.out.println();
        }
    }
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        Q3_2018 obj = new Q3_2018();
        
        System.out.print ("N = ");
        int numOfTeams = scan.nextInt();
        
        if (numOfTeams <= 2 || numOfTeams >= 10) 
            System.out.println ("INVALID INPUT");
        else {
            obj.inputTeamNames( numOfTeams );
            obj.findLongestName();
            obj.printNames();
        }
    }
}