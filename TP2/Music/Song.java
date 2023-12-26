import java.util.ArrayList;
import java.util.Collections;

public class Song {
    private String name;
    private String singer;
    private int length;
    private String genre;
    private int release_year;

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public int getRelease_year() {
        return release_year;
    }

    public int getLength() {
        return length;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public void playSong() {
        System.out.println("Now playing: " + name);
        System.out.println("Artist: " + singer);
        System.out.println("Duration: " + length + " seconds");
    }
}

class Album {
    private String name;
    private ArrayList<Song> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Song> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void removeSong(Song s) {
        for (int i = 0; i < list.size(); i++) {
            if (s.getName().equals(list.get(i).getName())) {
                list.remove(i);
            }
        }
    }

    public void displaySongs() {
        System.out.println("The songs in this album are: ");
        for (Song song : list) {
            System.out.println(song.getName());
        }
    }
}

class Artist {
    private String name;
    private String nationality;
    private int age;
    private ArrayList<Album> albums = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public String getNationality() {
        return nationality;
    }

    public void removeAlbum(Album a) {
        for (int i = 0; i < albums.size(); i++) {
            if (a.getName().equals(albums.get(i).getName())) {
                albums.remove(i);
            }
        }
    }

    public void displayAlbums() {
        System.out.println("The albums associated with this artist are: ");
        for (Album album : albums) {
            System.out.println("Album name: " + album.getName());
        }
    }
}

interface Playable {
    void listen(Song s);

    void addToPlaylist(Song s);

    void removeFromPlaylist(Song s);

    void addToFavourites(Song s);
}

class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void shufflePlaylist() {
        Collections.shuffle(songs);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}

class FreeUser implements Playable {
    private String name;
    private Playlist p;
    private ArrayList<Song> favourites;

    public FreeUser(String name) {
        this.name = name;
        p = new Playlist();
        favourites = new ArrayList<>();
    }

    public void addToPlaylist(Song s) {
        if (p.getSongs().size() < 20)
            p.addSong(s);
        else System.out.println("A playlist can have a maximum of 20 songs. Upgrade to Premium to remove this limit");
    }

    @Override
    public void removeFromPlaylist(Song s) {
        p.removeSong(s);
    }

    @Override
    public void addToFavourites(Song s) {
        favourites.add(s);
    }

    public void listen(Song s) {
        s.playSong();
    }
}

class PremiumUser implements Playable {
    private String name;
    private Playlist p;
    private ArrayList<Song> favourites;

    public PremiumUser(String name) {
        this.name = name;
        p = new Playlist();
        favourites = new ArrayList<>();
    }

    public void addToPlaylist(Song s) {
        p.addSong(s);
    }

    @Override
    public void removeFromPlaylist(Song s) {
        p.removeSong(s);
    }

    @Override
    public void addToFavourites(Song s) {
        favourites.add(s);
    }

    public void listen(Song s) {
        s.playSong();
    }
}
