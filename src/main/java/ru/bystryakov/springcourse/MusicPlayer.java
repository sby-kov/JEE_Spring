package ru.bystryakov.springcourse;

/**
 * User:  Marina
 * Дата:  24.05.2020
 * Время: 19:29
 */
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;
    // реализуем IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {} // когда инициируется через setter, нужен пустой конструктор

    public void setMusic(Music music) { this.music = music; }

    public void setName(String name) { this.name = name; }

    public void setVolume(int volume) { this.volume = volume; }

    public String getName() { return name; }

    public int getVolume() { return volume; }

    public void playMusic() {
        System.out.println("Играет " + music.getSong());
    }
}
