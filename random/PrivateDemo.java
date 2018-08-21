package random;
class PrivateDemo {
    private int x;
    
    private static void myMethod() {
        System.out.println ("Method Called");
        
        new PrivateDemo().x = 4;
    }
}