package Practical;
/*  ALGORITHM
 * 1. Start
 * 2. Take the number of participants as user input
 * 3. Proceed if it is between 3 and 11, otherwise go to step 11
 * 4. Create a dda of (number of participants x 5)
 * 5. Store the answers for each participant
 * 6. Take the input of the correct answer
 * 7. Create an array to store the key and another array to store the marks
 * 8. Match the participant's answers with the key and give 1 mark for a correct answer
 * 9. Find the maximum marks
 * 10.Display each participant's marks and also the participant having the highest score
 * 11.Stop
 */
import java.util.Scanner; 
class Q2_2017 {
    char[][] answers;
    char[] key = new char[5];
    int[] marks;

    void start() {
        Scanner scan = new Scanner (System.in);
        System.out.print(" N = ");
        int numOfParticipants = scan.nextInt();

        if (numOfParticipants <= 3 || numOfParticipants >= 11)
            System.out.println ("INPUT SIZE OUT OF RANGE");
        else {
            answers = new char[numOfParticipants][5];
            marks = new int[numOfParticipants];

            //Taking the input for the answers of the participants
            for (int i = 0; i < numOfParticipants; i++) {
                System.out.print ("Participant "+(i+1)+" ");
                for (int j = 0; j < 5; j++) {
                    answers[i][j] = Character.toUpperCase( scan.next().trim().charAt(0) );
                }
            }

            //Taking the input of the answer key
            System.out.print("Key: ");
            for (int i = 0; i < 5; i ++) {
                key[i] = Character.toUpperCase( scan.next().trim().charAt(0) );
            }
            
            calculateMarks();
            displayResults();
        }
    }

    void calculateMarks() {
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[0].length; j++) {

                //For each answer of a particular participant, compare it with the key
                //If it's a match then increase the marks of the participant by 1
                if (answers[i][j] == key[j])
                    marks[i] ++;
            }
        }
    }

    void displayResults() {
        int maxMarks = 0;
        
        //Displaying each participant's marks
        System.out.println("Scores: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Participant "+(i+1)+" = "+marks[i]);
            
            //Calculating the highest score
            if (maxMarks < marks[i])
                maxMarks = marks[i];
        }
        
        //Printing the participants who got the highest scores
        System.out.print("Highest score: ");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxMarks)
                System.out.println ("\t Participant "+(i+1));
        }
    }

    public static void main (String args[]) {
        Q2_2017 obj = new Q2_2017();
        obj.start();
    }
}