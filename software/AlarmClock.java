package software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class AlarmClock 
{
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    
    public AlarmClock()
    {
        //Setting JFrame
        frame = new JFrame ("Clock");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        
        //initialisations
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        textfield = new JTextField(10);
        textfield.setEditable(false);
        textfield.setFont(new Font("Arial", Font.PLAIN, 48));
        
        //Add components
        panel.add(textfield);
        frame.add(panel);
        
        Timer t = new Timer(1000,new Listener());
        t.start();
    }
    
    class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Calendar cal = Calendar.getInstance();
            
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            
            textfield.setText(hour+":"+min+":"+sec);
        }
    }
}