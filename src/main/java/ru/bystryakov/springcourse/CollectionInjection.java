package ru.bystryakov.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Serge Bystryakov
 * Дата: 26.05.2020  Время: 19:30
 */
public class CollectionInjection {
    //List musicList;
    List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        //System.out.println("List of Music: " + musicList);

        this.musicList = musicList;
    }
}
