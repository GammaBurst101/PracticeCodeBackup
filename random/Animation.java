/*
 * Goal: Animation of a ball bouncing between the top and bottom with sound effects.
   */
package random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Animation {
    int y = 50;
    Color ballColor, backgroundColor = new Color(255, 255, 255);//Background color will be white
    AnimationPanel background;
    
    public static void main (String args[]) {
        new Animation().setUpGUI();
    }
    
    void setUpGUI() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        background = new AnimationPanel();
        
        frame.add(background);
        
        startAnimation();
    }
    
    void startAnimation(){
        int dy = 10;
        
        while (true){
            if (y >= 50){
                dy = 10;//move downward
                changeBallColor();
            }
            else if (y >= 450){
                dy = -10;//move upward
                changeBallColor();
            }
            
            y += dy;
            
            background.repaint();
            
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){}
        }
    }
    
    void changeBallColor(){
        //Generating random color
        int red = (int) Math.random() * 255;
        int green = (int) Math.random() * 255;
        int blue = (int) Math.random() * 255;
        
        ballColor = new Color(red, green, blue);
    }
    
    //Custom panel for animation 
    class AnimationPanel extends JPanel{
        public void paintComponent(Graphics g){
            //Painting the background
            g.setColor(backgroundColor);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            
            //Painting the ball
            g.setColor(ballColor);
            g.fillOval(this.getWidth() / 2, y, 100, 100);
        }
    }
}