//This work is licensed under CC BY-NC-SA 4.0. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/

package app;

import entity.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> graph = new HashMap<>();
        List<Integer> songs = new ArrayList<>();

        boolean where = true;
        int count = 0;
        int place = 0;
        while(count < songs.size()){
            if (where){
                graph.put(1 + place, songs.get(count));
                count += 1;
                where = false;
            } else {
                graph.put(songs.size() - place, songs.get(count));
                count += 1;
                where = true;
                place += 1;
            }
        }
        for (Integer s: songs){
            System.out.println(graph.get(s));
        }

    }
}