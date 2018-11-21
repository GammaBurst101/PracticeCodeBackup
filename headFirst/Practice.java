package headFirst;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
class Practice {
    int y = 60;
    int dy = 15;
    Color ballColor = new Color (0, 0, 255);

    Sequencer player = MidiSystem.getSequencer();
    

    Sequence seq = new Sequence (Sequence.PPQ, 4);
    Track track = seq.createTrack();

    public static void main (String ars[]) {
        new Practice().setUpGUI();
    }

    void setUpGUI() {
        JFrame frame = new JFrame ("Practice");
        frame.setSize (500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        AnimationPanel panel = new AnimationPanel();

        frame.getContentPane().add(panel);

        while (true) { 
            if ( y < 0 ) {
                dy = 15;
                ballColor = new Color (100, 255, 100);
                playSound();
            }
            if ( y > 400) {
                dy = -15;
                ballColor = new Color (255, 255, 100);
                playSound();
            }

            y += dy;

            panel.repaint();

            try {
                Thread.sleep (50);
            } catch (Exception e) {}
        }
    }

    static void playSound() {
        try {
            player.open();
            
            ShortMessage a = new ShortMessage();
            a.setMessage (144, 1, 2, 100);
            MidiEvent noteOn = new MidiEvent (a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage ();
            b.setMessage(128, 1, 2, 100);
            MidiEvent noteOff = new MidiEvent (b, 2);
            track.add (noteOff);

            player.setSequence (seq);
            player.start();
        }catch (Exception error){}
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