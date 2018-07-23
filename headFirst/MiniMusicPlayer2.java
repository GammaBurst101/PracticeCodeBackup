//Version 2 of Music Player
package headFirst;
import javax.sound.midi.*;
public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main (String args[]) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }
    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            
            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            
            for (int i = 5; i < 60; i++) {
                track.add(MiniMusicPlayer1.makeEvent(144, 1, i, 100, i));
                track.add(MiniMusicPlayer1.makeEvent(178, 1, 127, 0, i));
                track.add(MiniMusicPlayer1.makeEvent(128, 1, i, 100, i+2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void controlChange(ShortMessage event) {
        System.out.println ("la");
    }
}