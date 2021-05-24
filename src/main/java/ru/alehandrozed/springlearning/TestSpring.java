package ru.alehandrozed.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);


        player.playMusic();

        context.close();
    }
}
