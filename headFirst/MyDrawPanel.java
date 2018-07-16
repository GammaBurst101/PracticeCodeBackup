//This class is for my testing of some concepts, tricks and sample codes of Head First Java
package headFirst;
//Making graphics for chp12
import javax.swing.*;
import java.awt.*;
class MyDrawPanel extends JPanel{
    public void paintComponent( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        
        //Generating random rgb start values
        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        
        Color startColor = new Color(red, green, blue);
        
        //Generate random rgb end values
        red = (int)(Math.random()*255);
        green = (int)(Math.random()*255);
        blue = (int)(Math.random()*255);
        
        Color endColor = new Color(red, green, blue);
        
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 200, 200, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 200, 200);
    }
}