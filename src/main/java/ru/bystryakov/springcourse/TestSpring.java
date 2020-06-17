package ru.bystryakov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User:  Marina
 * Дата:  20.05.2020
 * Время: 21:56
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        // проверка аннотации Component
//        System.out.println("--- проверка аннотации Component ---");
//
//        Music music = context.getBean("classicalMusic", Music.class);   // если id нет, то classicalMusic
//        Music music2 = context.getBean("idRockMusic", Music.class);     // id есть
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);   // IoC
//        musicPlayer.playMusic();
//
//        MusicPlayer rockMusicPlayer2 = new MusicPlayer(music2);
//        rockMusicPlayer2.playMusic();

        // проверка аннотации Component
        System.out.println("--- проверка аннотации Autowired ---");
        // получим MusicPlayer из spring context
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
