package random;
public class ProtectedDemo {
    protected int x;
    
    protected static void myMethod() {
        System.out.println ("Method Called");
        
        new ProtectedDemo().x = 4;
    }
}