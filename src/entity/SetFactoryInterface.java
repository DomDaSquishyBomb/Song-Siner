package entity;

import java.util.List;

public interface SetFactoryInterface {
    Set create(List<Song> songs, String name);
}
