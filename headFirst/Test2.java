//This class is to help me in testing out with class 'Test'
package headFirst;
class Test2 {
    public static void main (String args[]) {
        //Trying to call main() of 'Test'
        
        //First way
        Test.main(new String[10]);//The arg in String[] could be any no., I guess
        
        //Second way
        Test t = new Test();
        String[] arg = {};
        t.main(arg);
    }
}