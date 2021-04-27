import enumGenre.Genre;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
    private List<Song> myPlaylist;
    private String titlePlaylist;
    private boolean isPlay;
    private Song current;

    public MusicPlayer() {
        myPlaylist = new LinkedList<>();
        isPlay = false;
        current = null;
    }

    public boolean isPlay() {
        return isPlay;
    }

    public void setPlay(boolean play) {
        isPlay = play;
    }

    public String getTitlePlaylist() {
        return titlePlaylist;
    }

    public void setTitlePlaylist(String titlePlaylist) {
        this.titlePlaylist = titlePlaylist;
    }

    public List<Song> getMyPlaylist() {
        return myPlaylist;
    }

    public void setMyPlaylist(LinkedList<Song> myPlaylist) {
        this.myPlaylist = myPlaylist;
    }

    public void addSong(Song song) {
        if (isPlay) {
            current = play();
            isPlay = false;
        }
        if (myPlaylist.size() > 256) { //my player has a little memory :)
            System.out.println("Sorry out of memory. Delete some song");
        } else {
            myPlaylist.add(song);
            System.out.println(song + " was added");
        }
    }

    public void addAlbum(Album album) {
        if (isPlay = true) {
            isPlay = false;
        }
        if (myPlaylist.size() + album.getAlbum().size() > 256) {
            System.out.println("Sorry out of memory. Delete some song");
        } else {
            myPlaylist.addAll(album.getAlbum());
        }
    }

    public void removeSong(String titleSong) {
        if (isPlay) {
            isPlay = false;
        }
        myPlaylist.removeIf(song -> song.getTitle().equals(titleSong));
    }

    public void shufflePlay() {
        if (isPlay) {
            isPlay = false;
        }
        Collections.shuffle(myPlaylist);
        current = myPlaylist.get(0);
        isPlay = true;
        play();
    }

    public Song play() {
        if (myPlaylist.size() == 0) {
            System.out.println("Your playlist is empty");
        }
        if (current != null) {
            isPlay = true;
            System.out.println("Your song now is " + current);
            return current;
        } else {
            isPlay = true;
            System.out.println("Your song now is " + myPlaylist.get(0));
            current = myPlaylist.get(0);
        }
        return current;
    }

    public void pause() {
        isPlay = false;
    }

    public void playNextSong() {
        if (current == null) {
            current = myPlaylist.get(0);
            play();
            return;
        }
        int currentIndex = myPlaylist.indexOf(current);
        if (myPlaylist.get(currentIndex + 1) == null) {
            current = myPlaylist.get(0);
            play();
        } else {
            current = myPlaylist.get(currentIndex + 1);
            play();
        }
    }

    public void playPreviousSong() {
        if (current == null) {
            current = myPlaylist.get(0);
            play();
            return;
        }
        int currentIndex = myPlaylist.indexOf(current);
        if (currentIndex == 0) {
            current = myPlaylist.get(myPlaylist.size() - 1);
        } else {
            current = myPlaylist.get(currentIndex - 1);
        }
        play();
    }

    public void playOnlyLovelyGenre(Genre genre) {
        List<Song> lovelyGenre = new LinkedList<>();
        for (Song song : myPlaylist) {
            if (song.getGenre().equals(genre)) {
                lovelyGenre.add(song);
            }
        }
        current = lovelyGenre.get(0);
        System.out.println("Your song now is " + current);
    }
}
