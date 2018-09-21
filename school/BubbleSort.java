package school;
import java.util.Scanner;
class BubbleSort {
    int[] arr;
    public static void main (String args[]) {
        BubbleSort ob = new BubbleSort();
        ob.input();
        ob.sort();
        ob.show();
    }
    void input() {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the length of the array: ");
        int l = scan.nextInt();
        arr = new int[l];
        
        //Input Module
        System.out.println ("Enter the elements:");
        for (int i=0; i<l; i++) {
            arr[i] = scan.nextInt();
        }
    }
    void sort() {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1; j++) {
                int k=j+1;
                
                if (arr[j] < arr[k]) {//Descending Order
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
    void show() {
        System.out.println ("Sorted Array: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print( arr[i] +" ");
        }
    }
}