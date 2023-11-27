package entity;

public class SongFactory implements SongFactoryInterface{
    public Song create(String title, String artist, Float energy){
        return new Song(title, artist, energy);
    }

}
