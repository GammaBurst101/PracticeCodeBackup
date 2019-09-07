package Practical;
//The following code was written by vibhas. Therefore, no algo. It's the soln of Q8 of 2019 theory paper
import java.util.Scanner;
class Q8_2019 {
    int arr[][];
    int m, n;
    
    Q8_2019( int mm, int nn ) {
        m = mm;
        n = nn;
    }
    
    void fillArray() {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[m][n];
        System.out.println ("Enter the elements: ");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                arr[x][y] = sc.nextInt();
            }
        }
    }
    
    int reverse(int x) {
        int rev;
        while (x > 0) {
            rev = rev*10 + x%10;
            x /= 10;
        }
        return rev;
    }
    
    void rev(Q8_2019 p) {
        for (int x = 0; x < m;x++) {
            for (int y = 0; y < n; y++) {
                arr[x][y] = reverse(p.arr[x][y]);
            }
        }
    }
    
    void show() {}
    
    public static void main (String[] ar) {
        System.out.println ("Enter the rows and columns: ");
        int mm = sc.nextInt();
        int nn = sc.nextInt();
        Q9_2019 ob1, ob2;
        ob1 = new Q9_2019(mm, nn);
        ob2 = new Q9_2019(mm, nn);
        
        ob1. fillArray();
        ob2.rev(ob1);
        ob2.show();
    }
}