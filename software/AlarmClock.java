package software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.sound.sampled.*;
import java.io.File;

public class AlarmClock 
{
    private JFrame frame;
    private JTextField time, tf2, tf3;
    private JPanel panel;
    private JButton b;
    private JLabel l;
    private String alarm;
    private Timer t, t2;
    
    public AlarmClock()
    {
        //Setting JFrame
        frame = new JFrame ("Clock");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        
        //initialisations and setting them
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBounds(0 ,0, 500, 400);
        
        time = new JTextField(10);
        time.setEditable(false);
        time.setFont(new Font("Arial", Font.PLAIN, 48));
        
        tf2 = new JTextField("HH");
        tf2.setBounds(250, 200, 40, 40);
        
        tf3 = new JTextField("MM");
        tf3.setBounds(350, 200, 40, 40);
        
        b = new JButton("Set Alarm");
        b.setBounds(250, 350, 100, 40);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                alarm = tf2.getText()+":" + tf3.getText() +":0";
            }
        });
        
        l = new JLabel("Enter the time to set alarm at here");
        l.setBounds(100, 200, 100, 40);
        
        t = new Timer(1000,new Listener());
        t2 = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(time.getText().equals(alarm))
                ringAlarm();
            }
        });
        
        //Add components
        panel.add(time);
        panel.add(l);
        panel.add(tf2);
        panel.add(tf3);
        panel.add(b);
        frame.add(panel);
        
        //Starting the timers
        t.start();
        t2.start();
    }
    
    class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Calendar cal = Calendar.getInstance();
            
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            
            time.setText(hour+":"+min+":"+sec);
        }
    }
    
    private static void ringAlarm()
    {
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\Prasoon\\Study_Stuff\\JAVA\\alarm.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }catch(Exception e) {
            System.out.println ("Error with playing sound.");
            e.printStackTrace();
        }
    }
}