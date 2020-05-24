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
        // прямое определение плеера
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);   // IoC

        // сделаем через context
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        //System.out.println("");
/**/
        Music music2 = context.getBean("musicBean2", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();

        context.close();
    }
}
