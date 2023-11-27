package entity;

import java.util.*;

public class Set implements SetInterface{
    private String name;
    private List<Song> songs;
    private Integer count;
    private String function;

    Set(List<Song> songs, String name){
        this.songs = songs;
        // counter
        this.count = songs.size();
        this.name = name;
        this.function = null;
    }

    void Increasing(Set set){
        this.songs.sort((s1, s2) -> {
            return s1.getEnergy() > s2.getEnergy() ? 1 : -1;
        });
        this.function = "increasing";
    }

    void Decreasing(Set set){
        Increasing(set);
        this.songs = this.songs.reversed();
        this.function = "decreasing";
    }
    // subdivide function so that it puts the song in the funcs

   void Bell(Set set) {
        Increasing(set);

        List<Song> newOrder = new ArrayList<>();
        Map<Integer, Song> graphed = new HashMap<>();
        List<Song> songs = this.songs;
        boolean where = true;
        int count = 0;
        int place = 0;


        while (count < this.count) {
            if (where) {
               graphed.put(1 + place, songs.get(count));
               count += 1;
               where = false;
            } else {
                graphed.put(this.count - place, songs.get(count));
                count += 1;
                where = true;
                place += 1;
           }
       }
        for (int i = 1; i <= this.count; i++){
            newOrder.add(graphed.get(i));
        }
        this.songs = newOrder;
        this.function = "bell";
    }

    void Cup(Set set) {
        Decreasing(set);

        List<Song> newOrder = new ArrayList<>();
        Map<Integer, Song> graphed = new HashMap<>();
        List<Song> songs = this.songs;
        boolean where = true;
        int count = 0;
        int place = 0;


        while (count < this.count) {
            if (where) {
                graphed.put(1 + place, songs.get(count));
                count += 1;
                where = false;
            } else {
                graphed.put(this.count - place, songs.get(count));
                count += 1;
                where = true;
                place += 1;
            }
        }
        for (int i = 1; i <= this.count; i++){
            newOrder.add(graphed.get(i));
        }
        this.songs = newOrder;
        this.function = "cup";
    }

    void Sin

    public Integer getCount() {
        return count;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getFunction() {
        return function;
    }

    public String getName() {
        return name;
    }
}
