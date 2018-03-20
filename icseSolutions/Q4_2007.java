package icseSolutions;
import java.util.Scanner;
class Q4_2007 // Salary
    {
        String name, add, sub;
        long phone;
        int salary;
        double incomeTax;
        
        void input()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println ("Enter the name, address, phone no., subject and monthly salary:");
            name = sc.nextLine();
            add = sc.nextLine();
            phone = sc.nextLong();
            sub = sc.nextLine();
            salary = sc.nextInt();
        }
        
        void calculateTax()
        {
            int annualSalary = salary * 12;
            if (annualSalary >= 175000)
                incomeTax = (double)(annualSalary - 175000) * 5/100;
            else
                incomeTax = 0.0;
            }
            
        void display()
        {
            System.out.println ("Name: "+name);
            System.out.println ("Address: "+add);
            System.out.println ("Phone: "+phone);
            System.out.println ("Subject Specialization: "+sub);
            System.out.println ("Monthly Salary: "+salary);
            System.out.println ("Income Tax: "+incomeTax);
        }
        
        public static void main (String args[])
        {
            Q4_2007 obj = new Q4_2007();
            obj.input();
            obj.calculateTax();
            obj.display();
        }
    }