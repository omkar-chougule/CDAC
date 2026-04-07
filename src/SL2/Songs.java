package SL2;

import java.util.HashSet;
import java.util.Set;

public class Songs implements Comparable<Songs> {
    private int serialno, rating;
    private Set<String> artist = new HashSet<>();
    private String release_year, song_name;

    public Songs(int serialno, String song_name, int rating, Set<String> artist, String release_year) {

        this.serialno = serialno;
        this.song_name = song_name;
        this.rating = rating;
        this.artist = artist;
        this.release_year = release_year;
    }

    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Set<String> getArtist() {
        return artist;
    }

    public void setArtist(Set<String> artist) {
        this.artist = artist;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    @Override
    public String toString() {
        return "SongCollection{" +
                "serialno=" + serialno +
                ", rating=" + rating +
                ", artist=" + artist +
                ", release_year='" + release_year + '\'' +
                ", song_name='" + song_name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Songs o) {
        return Integer.compare(this.serialno,o.serialno);
    }
}
