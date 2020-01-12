import java.util.Scanner;
public class Main {
  int Que[];
  int size, front, rear;
  
  Main(int mm) {
      size = mm;
      Que = new int[size];
      front = -1;
      rear = -1;
  }
  
  void addele (int v) {
    if (rear < size - 1)
      Que[++rear] = v;
    else
      System.out.println ("Overflow");
  }
  
  int delele () {
    if (front <= rear)
        return Que[++front];
    else {
        System.out.println("Underflow");
        return -9999;
    }
  }
  
  void display() {
      System.out.println("Elements: ");
      for (int i = 1; i <= size ; i++) {
          System.out.println(delele());
      } 
  }
  
  public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the size: ");
      int size = scan.nextInt();
      
      Main obj = new Main(size);
      System.out.println("Enter the elements: ");
      for (int i = 1; i <= size ; i++) {
        int s = scan.nextInt();
        obj.addele(s);
      } 
      
      obj.display();
  }
}
