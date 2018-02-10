package schoolBookSolutions.chapter3;
import java.util.Scanner;
class LabExercise8
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the temperature to be converted to fahrenheit");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println ("Temperature in farenheit is "+fahrenheit);
    }
}
