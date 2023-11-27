package entity;

public class Song implements SongInterface{
    private String title;
    private String artist;
    private Float energy;
    // private float danceability; // 0.0 to 1.0 for danceability
    // private float loudness; // -60.0 to 0.0 for how loud relatively in dbs
    // private float valence; // 0.0 to 1.0 for mood happiness
    // private Integer mode; // 0.0 or 1.0 for minor or major
    public Song(String title, String artist, float energy){
        this.title = title;
        this.artist = artist;
        this.energy = energy;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Float getEnergy() {
        return energy;
    }
}
