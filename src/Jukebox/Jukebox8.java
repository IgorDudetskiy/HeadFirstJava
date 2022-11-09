import java.util.*;
import java.io.*;
/*
public class Jukebox8 {

    ArrayList<Song> songListMore = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox8().go();
    }

    public void go() {
        getSongs();
        System.out.println(songListMore);
        Collections.sort(songListMore);
        System.out.println(songListMore);
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songListMore);
        System.out.println(songSet);
    }

    void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songListMore.add(nextSong);

    }
*/