import enumGenre.Genre;

public class Song {
    private String title;
    private String artist;
    private Genre genre;

    public Song(String title, String artist, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public Song() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre=" + genre +
                '}';
    }
}
