import java.util.Scanner;
class Main
{

  String Q[];
  int size, start, end;

    Main (int max)
  {
    size = max;
    start = -1;
    end = -1;
    Q = new String[size];
  }

  void pushadd (String n)
  {
    if (end < size - 1)
      Q[++end] = n;
    else
      System.out.println (" NO SPACE");
  }

  String popadd ()
  {
    if (start <= end)
      return Q[++start];
    else
      return "?????";
  }
  
  void show() {
      System.out.println("Strings in the list: ");
      for (int i = 1; i <= size; i++) {
          System.out.println(popadd());
      }
  }

  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);

    System.out.println ("Enter the size: ");
    int size = scan.nextInt ();
    scan.nextLine();
    
    Main obj = new Main (size);

    System.out.println ("Enter the strings: ");
    for (int i = 1; i <= size; i++)
      {
        String str = scan.nextLine();
        obj.pushadd(str);
      }

    obj.show();
  }
}
