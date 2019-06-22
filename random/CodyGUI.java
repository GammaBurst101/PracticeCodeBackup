package random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CodyGUI {
    private JFrame frame;
    private JPanel background;
    private JTextArea question, ans1, ans2;
    private JButton addBtn;
    
    CodyGUI() {
        //Colors for the background and text area
        Color backgroundColor = new Color(255, 255, 255);
        Color textAreaColor = new Color(240, 255, 255);
        
        //Frame
        frame = new JFrame ("Cody Question Adder");
        frame.setSize(350, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        //background panel to hold in everything
        background = new JPanel();
        background.setLayout (new BoxLayout(background, BoxLayout.Y_AXIS));
        background.setBackground(backgroundColor);
        
        //TextArea - Initializations
        question = new JTextArea(8, 10);
        ans1 = new JTextArea(8, 10);
        ans2 = new JTextArea(8, 10);
        
        //TextArea - Backgrounds
        question.setBackground(textAreaColor);
        ans1.setBackground(textAreaColor);
        ans2.setBackground(textAreaColor);
        
        //TextArea - Fonts
        question.setFont(new Font("Helvetica", Font.PLAIN, 20));
        ans1.setFont(new Font("Helvetica", Font.PLAIN, 20));
        ans2.setFont(new Font("Helvetica", Font.PLAIN, 20));
        
        //TextArea - Margins
        question.setMargin(new Insets(5, 5, 5, 5));
        ans1.setMargin(new Insets(5, 5, 5, 5));
        ans2.setMargin(new Insets(5, 5, 5, 5));
        
        //Button 
        addBtn = new JButton("Add Question");
        addBtn.addActionListener(new AddButtonListener());
        
        //Adding to the background panel along with the paddings
        background.add(Box.createVerticalStrut(5));
        background.add(new JLabel("Question:"));
        background.add(Box.createVerticalStrut(4));
        background.add(new JScrollPane(question));
        background.add(Box.createVerticalStrut(5));
        background.add(new JLabel("Answer for cody's expected reply: "));
        background.add(Box.createVerticalStrut(4));
        background.add(new JScrollPane(ans1));
        background.add(Box.createVerticalStrut(5));
        background.add(new JLabel("Anwer for cody's unexpected reply: "));
        background.add(Box.createVerticalStrut(4));
        background.add(new JScrollPane(ans2));
        background.add(Box.createVerticalStrut(5));
        background.add(addBtn);
        background.add(Box.createVerticalStrut(5));
        
        //Adding to frame
        frame.add(background);
    }
    
    public static void main (String args[]) {
        CodyGUI gui = new CodyGUI();
    }
    
    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (question.getText().trim().length() != 0 && ans1.getText().trim().length() != 0 && ans2.getText().trim().length() != 0) {
                //If all the fields are filled then write to file
                try {
                    BufferedWriter writer = new BufferedWriter( new FileWriter("CodyQuestionaire.txt", true) );
                    writer.write("/");
                    writer.newLine();
                    writer.write(question.getText());
                    writer.newLine();
                    writer.write(ans1.getText());
                    writer.newLine();
                    writer.write(ans2.getText());
                    writer.newLine();
                    writer.flush();
                    
                    //Removing the text from the textAreas
                    question.setText("");
                    ans1.setText("");
                    ans2.setText("");
                } catch (IOException err) {
                    System.out.println ("Error in file handling");
                    err.printStackTrace();
                }
            }
        }
    }
}