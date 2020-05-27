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
        // коллекция - домашка
        CollectionInjection collectionInjection =
                (CollectionInjection) context.getBean("collectionInjection");   // читаем

        // сделаем через context
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        //System.out.println("");
/**/
        Music music2 = context.getBean("musicBean2", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();
        // домашка = джаз
        System.out.println("--- домашка = джаз ---");
        music2 = context.getBean("musicBeanJ", Music.class);
        musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();
        // плеер из контекста
        musicPlayer = context.getBean("musicP", MusicPlayer.class);
        System.out.print( "Bean = musicP. " );
        System.out.print( musicPlayer.getName() + " : " );
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playMusic();
        // домашка
        System.out.println("--- домашка = коллекция ---");
        musicPlayer.playMusicList(collectionInjection.getMusicList());
        // scope Singleton Prototype
        System.out.println("--- Singleton или Prototype ---");
        MusicPlayer mP1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer mP2 = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comp = mP1 == mP2;
        String scope = "Prototype";

        if (comp) { scope = "Singleton"; }
        System.out.println(mP1);
        System.out.println(mP2);
        System.out.print(comp);
        System.out.println(" => " + scope);
        // меняем уровень
        mP2.setVolume(33);
        System.out.println("изменили уровень для mP2 = " + mP2.getVolume() );
        System.out.println(mP1.getVolume());
        System.out.println(mP2.getVolume());
        // жизненный цикл
        System.out.println("--- жизненный цикл ---");
        Music musicP = context.getBean("musicBeanP", PopMusic.class );
        System.out.println(musicP.getSong());
        // проверка init & destroy для prototype
        System.out.println("--- проверка init & destroy для prototype ---");
        Music musicP1 = context.getBean("musicBeanP", PopMusic.class );
        System.out.println("1 " + musicP1.getSong() );
        Music musicP2 = context.getBean("musicBeanP", PopMusic.class );
        System.out.println("2 " + musicP2.getSong() );
        Music musicP3 = context.getBean("musicBeanP", PopMusic.class );
        System.out.println("3 " + musicP3.getSong() );

        context.close();
    }
}
