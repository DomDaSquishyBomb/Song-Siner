package entity;

import java.util.List;

public class SetFactory implements SetFactoryInterface{
    public Set create(List<Song> songs, String name){
        return new Set(songs, name);
    }
}
