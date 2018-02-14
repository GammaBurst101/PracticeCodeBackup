package icseSolutions;
import java.util.Scanner;
class Q4_2008//Employee
{
    int pan;
    String name;
    double taxIncome, tax;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter your name");
        name = sc.nextLine();
        System.out.println ("Enter you pan number");
        pan = sc.nextInt();
        System.out.println ("Enter your taxable income");
        taxIncome = sc.nextDouble();
    }
    
    void calc()
    {
        if (taxIncome <= 100000)
            tax = 0.0;
        else if (taxIncome <= 150000)
            tax = (taxIncome - 100000)*10/100;
        else if (taxIncome <= 250000)
            tax = 5000.0 + (taxIncome - 150000)*20/100;
        else
            tax = 25000.0 + (taxIncome - 250000)*30/100;
    }
    
    void display()
    {
        System.out.println ("Pan Number\tName\tTax-Income\tTax");
        System.out.println (pan+"\t"+name+"\t"+taxIncome+"\t"+tax);
    }
}