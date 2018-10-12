package headFirst;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.event.*;

public class BeatBoxFinal {

    JFrame theFrame;
    JPanel mainPanel;
    JList incomingList;
    JTextField userMessage;
    ArrayList<JCheckBox> checkboxList;
    int nextNum;
    Vector<String> listVector = new Vector<String>();
    String userName;
    ObjectOutputStream out;
    ObjectInputStream in;
    HashMap<String, boolean[]) otherSeqsMap = new HastMap<String, boolean[]>();

    Sequencer sequencer;
    Sequence sequence;
    Sequence mySequence = null;
    Track track;

    String[] instruentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom",
            "High Agogo", "Open Hi Conga"};

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main (String args[]) {
        new BeatBoxFinal().starUp(args[0]);//args[0] will be your user ID/screen name
    }

    public void startUp(String name) {
        userName = name;
        //open connection to the server
        try {
            Socket sock = new Socket("127.0.0.1", 4242);
            out = new ObjectOutputStream(sock.getOutputStream());hread remote
            in = new ObjectInputStream(sock.getInputStream());
            Thread remote = new Thread (new RemoteReader());
            remote.start();
        } catch (Exception ex) {
            System.out.println ("couldn't connect - you'll have to play alone!");
        }
        setUpMidi();
        buildGUI();
    }

    public void buildGUI() {
        theFrame = new JFrame("Cyber BeatBox");
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkboxList = new ArrayList<JCheckBox>();

        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        JButon start = new JButton ("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton ("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton sendIt = new JButton ("Send It");
        sendIt.addActionListener(new MySendListener());
        buttonBox.add(sendIt);

        userMessage = new JTextField();
        buttonBox.add(userMessage);

        incomingList = new JList();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        buttonBox.add(theList);
        incomingList.setListData(listVector);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i=0; i<16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);
        GridLayout grid = new Gridlayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i< 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }//end loop

        theFrame.setBounds (50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }//close buildGUI
    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) { e.printStackTrace(); }
    }//close setUpMidi
    public void buildTrackAndStart() {
        ArrayList<Integer> trackList = null; //this will hold the instruments for each
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i<16; i++) {
            trackList = new ArrayList<Integer>();

            for (int j = 0; j < 16; j++) {
                JCheckBox jc = (JCheckBox) checkBoxList.get(j + (16*i));
                if (jc.isSelected()) {
                    int key = instruments[i];
                    tracklist.add(new Integer(key));
                } else {
                    trackList.add(null); //because this slot should be empty in the track
                }
            }
            makeTracks( trackList );
        }
        track.add(makeEvent (192, 9, 1, 0, 15)); // - so we always go to full 16 beats
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) { e.printStackTrace(); }
    }
    
    public class MyStartListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            buildTrackAndStart();
        }
    }
    
    public class MyStopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            sequencer.stop();
        }
    }
    
    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor( (float) (tempoFactor * 1.03));
        }
    }
    
    public class MyDownTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor ((float) (tempoFactor * .97));
        }
    }
    
    public class MySendListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            //make an arraylist of just the STATE of the checkboxes
            boolean[] checkboxState = new boolean [256];
            for (int i = 0; i < 256; i++) {
                JCheckBox check = (JCheckBox) checkboxList.get(i);
                if (check.isSelected()) {
                    checkboxState[i] = true;
                }
            }
            String messageToSend = null;
            try {
                out.writeObject (userName + nextNum++ + ": " +userMessage.getText());
                out.writeObject (checkboxState);
            } catch (Exception e) {
                System.out.println ("Sorry dude. Could not send it to the server.");
            }
            userMessage.setText("");
        }
    }
    public class MyListSelectionListener implements ListSelectionListener {
        public void valueChanged (ListSelectionEvent le) {
            if (!le.getValueIsAdjusting()) {
                String selected = (String) incomingList.getSelectedValue();
                if (selected  != null) {
                    //now go to the map, and change the sequence
                    boolean[] selectedState = (boolean[]) otherSeqsMap.get(selected);
                    changeSequence(selectedState);
                    sequencer.stop();
                    buildTrackAndStart();
                }
            }
        }
    }
    public class RemoteReader implements Runnable {}
}