//Testing out MyDrawPanel class
package headFirst;
import javax.swing.*;
class Test{
    public static void main (String args[]) {
        JFrame f = new JFrame();
        MyDrawPanel a = new MyDrawPanel();
        
        f.getContentPane().add(a);
        f.setSize(350, 350);
        f.setVisible(true);
    }
}