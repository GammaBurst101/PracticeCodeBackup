package icseSolutions;
import java.util.Scanner;
class Q9_2009
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the number of students");
        int l=sc.nextInt();
        String[] name=new String[l];
        int[] rollno=new int[l];
        int[] m1=new int[l], m2=new int[l], m3=new int[l];

        for (int i=0; i<l; i++)
        {
            System.out.println ("\nEnter the name of the "+(i+1)+"th student");
            sc.nextLine();
            name[i]=sc.nextLine();
            System.out.println ("Enter the roll no");
            rollno[i]=sc.nextInt();
            System.out.println ("Enter the marks in Subject A");
            m1[i]=sc.nextInt();
            System.out.println ("Enter the marks in Subject B");
            m2[i]=sc.nextInt();
            System.out.println ("Enter the marks in Subject C");
            m3[i]=sc.nextInt();
        }

        int[] avg=new int[l];
        for (int i=0; i<l; i++)
        {
            avg[i]=(m1[i] + m2[i] + m3[i])/3;
        }
        
        System.out.println ("\nName\tAverage Marks");
        for (int i=0; i<l; i++)
        {
            System.out.println (name[i]+"\t"+avg[i]);
        }
        
        System.out.println ("\nStudents with avg marks > 80%");
        System.out.println ("Names\tAverage Marks");
        for (int i=0; i<l; i++)
        {
            if (avg[i] > 80)
            {
                System.out.println (name[i]+"\t"+avg[i]);
            }
        }

        System.out.println ("\nStudent with avg marks < 80%");
        System.out.println ("Names\tAverage Marks");
        for (int i=0; i<l; i++)
        {
            if (avg[i] < 80)
            {
                System.out.println (name[i]+"\t"+avg[i]);
            }
        }        
    }
}
