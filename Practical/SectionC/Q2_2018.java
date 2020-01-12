import java.util.Scanner;
class Main {
    
    String stud[];
    int cap;
    int top;
    
    Main(int max) {
        top = -1;
        cap = max;
        stud = new String[cap];
    }
    
    void push (String n) {
        if (top < cap - 1)
          stud[++top] = n;
        else
          System.out.println ("OVERFLOW");
    }
    
    String pop () {
        if (top >= 0)
          return stud[top--];
        else
          return " $$";
    }
    
    void display() {
        System.out.println("All Names: ");
        for (int i=1; i<=cap; i++) {
            System.out.println(pop());
        }
    }
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scan.nextInt();
        scan.nextLine();
        
        Main obj = new Main(size);
        
        System.out.println("Enter the names: ");
        for (int i=1; i<=size; i++) {
            String str = scan.nextLine();
            obj.push(str);
        }
        
        obj.display();
    }
}
