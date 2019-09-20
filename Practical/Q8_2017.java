package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Create three objects to store time and add time
 *  3. Take input for the two times in their respective objects
 *  4. Add the time and store it in the third object
 *  5. Display the resultant time
 *  6. Stop
   */
import java.util.Scanner;
class Q8_2017{//The class name should be 'Adder' by the question
    int a[] = new int[2];
    
    Q8_2017(){
        a[0] = 0;
        a[1] = 0;
    }
    
    void readtime(){
        Scanner scan = new Scanner(System.in);
        a[0] = scan.nextInt();//Input for hr
        a[1] = scan.nextInt();//Input for min
    }
    
    void addtime(Q8_2017 X, Q8_2017 Y){
        a[0] = X.a[0] + Y.a[0];
        a[1] = X.a[1] + Y.a[1];
        
        if (a[1] >= 60){//If the minutes exceed 60 then increment the hour
            a[0]++;
            a[1] -= 60;
        }
    }
    
    void disptime() {
        System.out.println("hours= "+a[0]+" minutes= "+a[1]);
    }
    
    public static void main(String args[]){
        Q8_2017 obj1 = new Q8_2017();
        Q8_2017 obj2 = new Q8_2017();
        Q8_2017 obj3 = new Q8_2017();
        
        //Taking input for the times
        System.out.println ("Enter the first time: ");
        obj1.readtime();
        
        System.out.println ("Enter the second time: ");
        obj2.readtime();
        
        obj3.addtime(obj1, obj2);
        obj3.disptime();
    }
}