package software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class AlarmClock 
{
    JFrame frame;
    JTextField textfield, tf2, tf3;
    JPanel panel;
    JButton b;
    JLabel l;
    
    public AlarmClock()
    {
        //Setting JFrame
        frame = new JFrame ("Clock");
        frame.setSize(500, 400);
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
        
        tf2 = new JTextField("HH");
        tf2.setBounds(250, 200, 40, 40);
        
        tf3 = new JTextField("SS");
        tf3.setBounds(350, 200, 40, 40);
        
        b = new JButton("Set Alarm");
        
        l = new JLabel("Enter the time to set alarm at here");
        l.setBounds(100, 200, 100, 40);
        
        //Add components
        panel.add(textfield);
        panel.add(tf2);
        panel.add(tf3);
        panel.add(b);
        panel.add(l);
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