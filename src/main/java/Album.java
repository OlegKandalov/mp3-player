import java.util.LinkedList;
import java.util.List;

public class Album implements AlbumInterface{
    private String albumTitle;
    private String artist;
    List<Song> album;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        album = new LinkedList<>();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getAlbum() {
        return album;
    }

    public void setAlbum(List<Song> album) {
        this.album = album;
    }

    @Override
    public void putOnAlbum(Song song) {
        album.add(song);
    }

    @Override
    public void removeFromAlbum(int index) {
        if (album.get(index) == null) {
            System.out.println("empty here");
        }else {
            album.remove(index);
        }
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumTitle='" + albumTitle + '\'' +
                ", artist='" + artist + '\'' +
                ", album=" + album +
                '}';
    }
}
