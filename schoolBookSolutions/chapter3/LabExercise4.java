package schoolBookSolutions.chapter3;
class LabExercise4
{
    public static void main (String args[])
    {
        int marks = 55;
        char grade;
        if (marks >= 90)
        grade = 'A';
        else if (marks >= 50)
        grade = 'B';
        else 
        grade = 'C';
        System.out.println ("The grade is = "+grade);
    }
}