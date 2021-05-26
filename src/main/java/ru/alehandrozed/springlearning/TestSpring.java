package ru.alehandrozed.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        Music music1 = context.getBean("rapMusic", Music.class);
        MusicPlayer player = new MusicPlayer(music1);
        player.playMusic();

        Music music2=context.getBean("musicBean", Music.class);
        MusicPlayer player1 = new MusicPlayer(music2);
        player1.playMusic();


        context.close();
    }
}
