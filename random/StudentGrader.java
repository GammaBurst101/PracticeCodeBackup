package random;
/*
 * Question from hackerrank: Grading Students ('Problem Solving' questions)
 */
import java.util.Scanner;
class StudentGrader {
    int grade[];

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the details");

        int totalStudents = scan.nextInt();

        grade = new int[totalStudents];

        for (int i=0; i<totalStudents; i++){
            grade[i] = scan.nextInt();
        }
    }

    void roundOff() {
        for (int i=0; i < grade.length; i++){
            int currentGrade = grade[i];
            int closestMultiple = 0;//the closest next multiple of 5 from the currentGrade
            
            if (currentGrade > 37){//The question allows the rounding-off of grades higher than 37 only
                int nextNum = currentGrade + 1;
                
                //Check for a multiple of 5 in the next 2 numbers
                for (int j=0; j<2; j++){
                    if (nextNum % 5 == 0){
                        closestMultiple = nextNum;
                        break;
                    }
                    nextNum++;
                }
                
                //Round-off the currentGrade if the difference between currentGrade and closestMultiple <3
                if ( (Math.abs(closestMultiple - currentGrade)) < 3)
                    grade[i] = nextNum;
            }
        }
    }
    
    void showGrades(){
        System.out.println("Rounded-off grades:");
        for (int currentGrade: grade){
            System.out.println (currentGrade);
        }
    }
    
    public static void main(String arg[]){
        StudentGrader grader = new StudentGrader();
        
        grader.input();
        grader.roundOff();
        grader.showGrades();
    }
}