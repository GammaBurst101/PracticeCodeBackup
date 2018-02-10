package schoolBookSolutions.chapter3;
import java.util.Scanner;
class LabExercise6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the number to be squared");
        int num = sc.nextInt();
        int sq = num*num;
        System.out.println ("The square of the number is "+sq);
    }
}
