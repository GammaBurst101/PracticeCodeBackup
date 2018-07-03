//To know the answer of a 'Sharpen Your Pencil' code whose answer is not given
package headFirst;
public class TestBox {
    Integer i;
    int j;
    
    public static void main (String args[]){
        TestBox t = new TestBox();
        t.go();
    }
    public void go() {
        j = i;//Seems like the answer is "Will not run"
        System.out.println (j);
        System.out.println (i);
    }
    
}