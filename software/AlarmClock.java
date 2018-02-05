package software;
import java.awt.*;
import java.awt.event.*;
class AlarmClock implements ActionListener
{
    TextField tf;
    Frame f;
    Button b;
    
    AlarmClock()
    {
        //Create components
        tf = new TextField("Enter the time for alarm here.");
        f = new Frame("Alarm Clock");
        b = new Button("Set");
        
        //Set the components
        tf.setBounds(80, 100, 170, 50);
        b.setBounds(100, 90, 10, 10);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setLayout(null);
        
        //Add the components
        f.add(tf);
        f.add(b);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
}