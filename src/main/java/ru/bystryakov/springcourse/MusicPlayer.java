package ru.bystryakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User:  Marina
 * Дата:  24.05.2020
 * Время: 19:29
 */
@Component                // теперь пометим плеер через аннотацию Component
public class MusicPlayer {
    // изменим класс для применения @Autowired
    private ClassicalMusic classicalMusic;
    // IoC для ClassicalMusic

    @Autowired  // работает и без
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
            System.out.println("Играет " + classicalMusic.getSong());
    }
//    private Music music;
//    // реализуем IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Играет " + music.getSong());
//    }
}
