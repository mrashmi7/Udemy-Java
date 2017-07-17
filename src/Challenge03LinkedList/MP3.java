package Challenge03LinkedList;

import java.util.*;

/**
 * Created by diego on 15/07/2017.
 */
public class MP3 {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static ListIterator<Song> musicPlayer  = playList.listIterator();



    public static void main(String[] args) {
        albums.add(new Album("Gorillaz"));
        albums.get(0).addSongToTrackList("Clint eastwood", 222);
        albums.get(0).addSongToTrackList("Feel good inc.", 222);
        albums.get(0).addSongToTrackList("On melancholy hill", 222);
        albums.get(0).addSongToTrackList("Dirty Harry", 222);
        albums.get(0).addSongToTrackList("Dirty Harry", 222);

        albums.add(new Album("Daft Punk"));
        albums.get(1).addSongToTrackList("One more time", 222);
        albums.get(1).addSongToTrackList("Get Lucky", 222);
        albums.get(1).addSongToTrackList("Harder, Better, Faster, Stronger", 222);
        albums.get(1).addSongToTrackList("Da Funk", 222);
        albums.get(1).addSongToTrackList("Da Funk", 222);

        albums.add(new Album("Lion King"));
        albums.get(2).addSongToTrackList("Hakuna Matata", 222);
        albums.get(2).addSongToTrackList("Be prepared", 222);
        albums.get(2).addSongToTrackList("I Just cant wait to be king", 222);
        albums.get(2).addSongToTrackList("They live in you", 222);
        albums.get(2).addSongToTrackList("They live in you", 222);


        menuOptions();
        
    }

    public static void menuOptions() {
        boolean opened = true;
        boolean playMusic = false;
        boolean goingForward = true;
        String currentSong = "";
        while (opened) {
            printOptions();
            if (musicPlayer.hasNext() && playMusic) {
                System.out.printf("Song currently playing: %s\n", currentSong);
            }
            switch (getMenuOption()) {
                case 1:
                    addAlbumToPlayList();
                    break;
                case 2:
                    System.out.println("Skip current song");
                    if (musicPlayer.hasNext()) {
                        currentSong = musicPlayer.next().getTitle();
                        if (!goingForward)
                            currentSong = musicPlayer.next().getTitle();
                    }
                    goingForward = true;
                    break;
                case 3:
                    System.out.println("Play the previous song");
                    if (musicPlayer.hasPrevious()) {
                        currentSong = musicPlayer.previous().getTitle();
                        if (goingForward)
                            currentSong = musicPlayer.previous().getTitle();
                    }
                    goingForward = false;
                    break;
                case 4:
                    System.out.println("Start over current song");

                    break;
                case 5:
                    System.out.println("Print current playlist");
                    printPlayListSongs();
                    break;
                case 7:
                    System.out.println("Play music");
                    playMusic = true;
                    currentSong = musicPlayer.next().getTitle();
                    break;
                case 8:
                    System.out.println("Stop music");
                    playMusic = false;
                    break;
                case 6: // Close contactlist
                    opened = false;
                    break;
            }
        }
    }

    private static void printPlayListSongs() {
        for (int i = 1; i <= playList.size(); i++) {
            System.out.printf("Song %d: %s\n", i, playList.get(i - 1).getTitle());
        }
    }

    private static boolean addAlbumToPlayList() {
        String albumNameToAdd = getInput("Which album would you like to add to the playlist: ");
        Iterator<Album> albumIterator = albums.iterator();
        while (albumIterator.hasNext()) {
            Album currentAlbum = albumIterator.next();
            if (currentAlbum.getTitle().equals(albumNameToAdd)) {
                System.out.printf("'%s' has been added to the playlist!\n", albumNameToAdd);
                playList.addAll(currentAlbum.getTrackList());
                musicPlayer = playList.listIterator();
                return true;
            }
        }
        System.out.printf("'%s' has NOT been added to the playlist!\n", albumNameToAdd);
        return false;
    }

    private static void printOptions() {
        System.out.println();
        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("|   1 - Add album to playlist   |");
        System.out.println("|   2 - Next Song               |");
        System.out.println("|   3 - Previous Song           |");
        System.out.println("|   4 - Replay Song             |");
        System.out.println("|   5 - Print current playlist  |");
        System.out.println("|   6 - Close MP3               |");
        System.out.println("|   7 - Play Music              |");
        System.out.println("|   8 - Stop Music              |");
        System.out.println("|_______________________________|");
        System.out.println();
    }

    private static int getMenuOption() {
        System.out.print("Select your option [1-8]: ");
        return (scanner.nextInt());
    }

    private static String getInput(String message) {
        System.out.print(message);
        scanner.nextLine();
        return scanner.nextLine();
    }
}