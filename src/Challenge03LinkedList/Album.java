package Challenge03LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by diego on 15/07/2017.
 */
public class Album {
    private String title;
    private ArrayList<Song> trackList;

    public Album(String title) {
        this.title = title;
        this.trackList = new ArrayList<Song>();
    }

    public boolean addSongToTrackList(String newSongTitle, int newSongDuration){
        Iterator<Song> i = this.trackList.iterator();
        boolean duplicated = false;
        while (i.hasNext()) {
            if (i.next().getTitle().equals(newSongTitle))
                duplicated = true;
        }
        if (duplicated) {
            System.out.printf("'%s' is already in the tracklist from the album '%s'!\n", newSongTitle, this.title);
            return false;
        }
        this.trackList.add(new Song(newSongTitle, newSongDuration));
        return true;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getTrackList() {
        return trackList;
    }
}
