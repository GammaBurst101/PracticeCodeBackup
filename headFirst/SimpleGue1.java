//This class is for my testing of some concepts, tricks and sample codes of Head First Java
package headFirst;
//Making simple gui for chp 12
import javax.swing.*;
class SimpleGue1 {
    public static void main (String args[]){
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(button);
        
        frame.setSize(300, 300);
        
        frame.setVisible(true);
    }
}