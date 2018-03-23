package icseSolutions;
import java.util.Scanner;
class Q5_2010//Student
{
    String name;
    int age, m1, m2, m3, maximum;
    double average;
    
    Q5_2010(String name)
    {
        this.name = name;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the age");
        age=sc.nextInt();
        System.out.println ("Enter the marks all subjects");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    
    void compute()
    {
        maximum = Math.max(Math.max(m1, m2), m3);
        average = (m1 + m2 + m3)/3;
    }
    
    void display()
    {
        System.out.println ("Name\t\tAge\tSubject1\tSubject2\tSubject3\tMaximum Marks\tAverage");
        System.out.println (name+"\t"+age+"\t\t"+m1+"\t\t"+m2+"\t\t"+m3+"\t\t"+maximum+"\t\t"+average);
    }
    
    public static void main (String args[])
    {
        Q5_2010 obj = new Q5_2010("Prasoon Pandey");
        obj.input();
        obj.compute();
        obj.display();
    }
}