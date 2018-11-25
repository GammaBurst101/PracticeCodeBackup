/*
 * DOESN'T WORK NOW
 * Trying to make an app where a rect will move up/down when user presses up/down keys
   */
package random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleGame{
    int x = 190;
    CustomPanel panel;
    
    public static void main (String args[]){
        new SimpleGame().setUpGUI();
    }
    
    void setUpGUI(){
        JFrame frame = new JFrame("Control-Rect-with-keys app");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        panel = new CustomPanel();
        panel.addKeyListener(new KeyPressListener());
        
        frame.add(panel);
    }
    
    //Listener class to listen for key-pressed
    class KeyPressListener implements KeyListener{
        public void keyTyped(KeyEvent e){
            
            x = 0;
            panel.repaint();
        }
        
        //Don't need the following methods
        public void keyPressed(KeyEvent e){}
        public void keyReleased(KeyEvent e){}
    }
    
    //Customized JPanel class
    class CustomPanel extends JPanel{
        public void paintComponent(Graphics g){
            //Paint the background white
            g.setColor(new Color(255, 255, 255));
            g.fillRect(0, 0, 500, 500);
            
            //Paint the rectangle which the user will control
            g.setColor(new Color(100, 255, 100));
            g.fillRect(x, 200, 100, 100);
        }
    }
}