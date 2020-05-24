package ru.bystryakov.springcourse;

/**
 * User:  Marina
 * Дата:  24.05.2020
 * Время: 19:29
 */
public class MusicPlayer {
    private Music music;
    // реализуем IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Играет " + music.getSong());
    }
}
