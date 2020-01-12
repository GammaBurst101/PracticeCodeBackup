import java.util.Scanner;
class Main {
    
    String name[];
    int point;
    int max;
    
    Main(int cap) {
        point = -1;
        max = cap;
        name = new String[cap];
    }
    
    void add (String v) {
        if (point < max - 1)
          name[++point] = v;
        else
          System.out.println ("SHELF FULL");
    }
    
    String tell () {
        if (point >= 0)
          return name[point--];
        else
          return "SHELF EMPTY";
    }
    
    void display() {
        System.out.println("All Names: ");
        for (int i=1; i<=max; i++) {
            System.out.println(tell());
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
            obj.add(str);
        }
        
        obj.display();
    }
}
