//To test out small trivial codes
package headFirst;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ScrollBar implements ActionListener{
    JTextArea text;
    public static void main (String args[]) {
        ScrollBar gui = new ScrollBar();
        gui.go();
    }

    void go() {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton b1 = new JButton("just click it");
        
        b1.addActionListener(this);
        text = new JTextArea(10, 20);
        text.setLineWrap(true);
        
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        p.add(scroller);
        
        f.getContentPane().add(BorderLayout.CENTER, p);
        f.getContentPane().add(BorderLayout.SOUTH, b1);
        
        f.setSize( 300, 300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        text.append("button clicked\n");
    }
}