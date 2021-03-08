import DataStructures.Song;

import java.util.ArrayList;
import java.util.List;

public class Intiator {
   static ArrayList<Song> songList = new ArrayList<Song>();
    public static void main(String[] args) {
        System.out.println("foo");
        Song song1 = new Song("narri","BnS","Infinity");
        songList.add(song1);
        System.out.println(songList);


    }

}
