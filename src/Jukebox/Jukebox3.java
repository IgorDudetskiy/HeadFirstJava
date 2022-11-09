package Jukebox;

import java.util.*;
import java.io.*;

public class Jukebox3 {

    ArrayList<Songg> songList = new ArrayList<Songg>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
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
        Songg nextSong = new Songg(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);

    }
}

class Songg implements Comparable<Songg> {
    String title;
    String artist;
    String rating;
    String bpm;

    public int compareTo(Songg s) {
        return title.compareTo(s.getTitle());
    }

    Songg(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }
}


