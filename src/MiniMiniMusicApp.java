import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }
    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(192,1,102,10);
            MidiEvent noteOn = new MidiEvent(a, 2);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(192,1,102,10);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
