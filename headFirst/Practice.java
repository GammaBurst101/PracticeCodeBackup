/*
 * Animates a ball moving up and down while changing colors as it rebounds.
   */
package headFirst;

import javax.swing.*;
import java.awt.*;
class Practice {
    int y = 60;//Y - coordinate of the ball
    int dy = 15;//This is the speed with which the ball moves
    Color ballColor;

    public static void main (String ars[]) {
        new Practice().setUpGUI();
    }

    void setUpGUI() {
        JFrame frame = new JFrame ("Practice");
        frame.setSize (500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        AnimationPanel panel = new AnimationPanel();

        frame.getContentPane().add(panel);

        while (true) { 
            if ( y < 7 ) {//If ball touches the upper edge
                dy = 15;//Make it move downward
                generateRandomColor();

            }
            if ( y > 409) {//If ball touches the lower edge
                dy = -15;//Make it move upward
                generateRandomColor();

            }

            y += dy;

            panel.repaint();

            //Making the thread sleep for 50 ms otherwise it'll be too fast to see
            try {
                Thread.sleep (50);
            } catch (Exception e) {}
        }
    }

    void generateRandomColor(){
        //Generate random rgb values
        int red = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        
        //Change to the new color
        ballColor = new Color(red, green, blue);
    }
    
    class AnimationPanel extends JPanel {
        public void paintComponent (Graphics g) {
            g.setColor( new Color (255, 255, 255));
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor (ballColor);
            g.fillOval(200, y, 60, 60);

        }
    }
}