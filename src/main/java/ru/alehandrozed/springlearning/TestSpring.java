package ru.alehandrozed.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        MusicPlayer playerOne = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer playerTwo = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(playerOne == playerTwo);

        System.out.println(playerOne);
        System.out.println(playerTwo);

        playerTwo.setVolume(1000);

        System.out.println(playerOne.getVolume());
        System.out.println(playerTwo.getVolume());


        context.close();
    }
}
