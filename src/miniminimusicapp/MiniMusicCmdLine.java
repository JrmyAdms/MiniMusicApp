package miniminimusicapp;

import javax.sound.midi.*;

public class MiniMusicCmdLine { // this is the first one

    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
            int instrument = Integer.parseInt("80");
            int note = Integer.parseInt("20");
            int instrument2 = Integer.parseInt("70");
            int note2 = Integer.parseInt("0");
            int instrument3 = Integer.parseInt("120");
            int note3 = Integer.parseInt("70");
            
            mini.play(instrument, note, instrument2, note2, instrument3, note3);
    } // close main

    public void play(int instrument, int note, int instrument2, int note2, int instrument3, int note3) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            MidiEvent event = null;
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);
            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            player.setSequence(seq);
            player.start();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try{
        Sequencer player2 = MidiSystem.getSequencer();
            player2.open();
            Sequence seq2 = new Sequence(Sequence.PPQ, 4);
            Track track2 = seq2.createTrack();
            MidiEvent event2 = null;
            ShortMessage first2 = new ShortMessage();
            first2.setMessage(192, 1, instrument2, 0);
            MidiEvent changeInstrument2 = new MidiEvent(first2, 1);
            track2.add(changeInstrument2);
            ShortMessage a2 = new ShortMessage();
            a2.setMessage(144, 1, note2, 100);
            MidiEvent noteOn2 = new MidiEvent(a2, 1);
            track2.add(noteOn2);
            ShortMessage b2 = new ShortMessage();
            b2.setMessage(128, 1, note2, 100);
            MidiEvent noteOff2 = new MidiEvent(b2, 16);
            track2.add(noteOff2);
            player2.setSequence(seq2);
            player2.start();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        try{
        Sequencer player3 = MidiSystem.getSequencer();
            player3.open();
            Sequence seq3 = new Sequence(Sequence.PPQ, 4);
            Track track3 = seq3.createTrack();
            MidiEvent event3 = null;
            ShortMessage first3 = new ShortMessage();
            first3.setMessage(192, 1, instrument3, 0);
            MidiEvent changeInstrument3 = new MidiEvent(first3, 1);
            track3.add(changeInstrument3);
            ShortMessage a3 = new ShortMessage();
            a3.setMessage(144, 1, note3, 100);
            MidiEvent noteOn3 = new MidiEvent(a3, 1);
            track3.add(noteOn3);
            ShortMessage b3 = new ShortMessage();
            b3.setMessage(128, 1, note3, 100);
            MidiEvent noteOff3 = new MidiEvent(b3, 16);
            track3.add(noteOff3);
            player3.setSequence(seq3);
            player3.start();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    } // close play
} // close class
