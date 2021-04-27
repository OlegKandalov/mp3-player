import enumGenre.Genre;

public class Main {
    public static void main(String[] args) {
        MusicPlayer myPlayer = new MusicPlayer();

        Song song1 = new Song("Nump", "Linkin Park", Genre.ROCK);
        Song song2 = new Song("New Divide", "Linkin Park", Genre.ROCK);
        Song song3 = new Song("In the end", "Linkin Park", Genre.ROCK);
        Song song4 = new Song("Faint", "Linkin Park", Genre.ROCK);

        Album linkinPark = new Album("Best songs", "Linkin Park");
        linkinPark.putOnAlbum(song1);
        linkinPark.putOnAlbum(song2);
        linkinPark.putOnAlbum(song3);
        linkinPark.putOnAlbum(song4);

        Song song5 = new Song("The Cello song", "Piano guys", Genre.CLASSICAL);
        Song song6 = new Song("Let it go", "Piano guys", Genre.CLASSICAL);
        Song song7 = new Song("Pepony", "Piano guys", Genre.CLASSICAL);

        Album pianoGuys = new Album("Songs about of love", "Piano Guys");
        pianoGuys.putOnAlbum(song5);
        pianoGuys.putOnAlbum(song6);
        pianoGuys.putOnAlbum(song7);

        Song song8 = new Song("Toxic", "Britney Spears", Genre.POP);
        Song song9 = new Song("Gimme more", "Britney Spears", Genre.POP);
        Song song10 = new Song("Baby one more time", "Britney Spears", Genre.POP);

        Album britney = new Album("Hello", "Britney Spears");
        britney.putOnAlbum(song8);
        britney.putOnAlbum(song9);
        britney.putOnAlbum(song10);

        myPlayer.addAlbum(linkinPark);
        myPlayer.addAlbum(pianoGuys);
        myPlayer.addAlbum(britney);

        System.out.println("songs are played for the first time:");
        myPlayer.play();
        System.out.println("####################################");
        System.out.println("next song:");
        myPlayer.playNextSong();
        System.out.println("####################################");
        System.out.println("next song:");
        myPlayer.playNextSong();
        System.out.println("####################################");
        System.out.println("previous song:");
        myPlayer.playPreviousSong();
        System.out.println("####################################");
        System.out.println("pause and play again:");
        myPlayer.pause();
        myPlayer.play();
        System.out.println("####################################");
        System.out.println("shuffle the list:");
        myPlayer.shufflePlay();
        System.out.println("####################################");
        System.out.println("play music with my lovely genre:");
        myPlayer.playOnlyLovelyGenre(Genre.CLASSICAL);
        System.out.println("####################################");
        System.out.println("out of memory:");
        MusicPlayer myPlayer2 = new MusicPlayer();
        for (int i = 0; i < 257; i++) {
            myPlayer2.addSong(song6);
        }
    }
}
