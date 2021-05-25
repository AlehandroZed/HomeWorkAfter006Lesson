package ru.alehandrozed.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        Music music1 = context.getBean("musicBean1", RapMusic.class);
//        Music music2 = context.getBean("musicBean1", RapMusic.class );
//        Music music3 = context.getBean("musicBean1", RapMusic.class );

//        MusicPlayer playerOne = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer playerTwo = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(playerOne == playerTwo);
//
//        System.out.println(playerOne);
//        System.out.println(playerTwo);
//
//        playerTwo.setVolume(1000);
//
//        System.out.println(playerOne.getVolume());
//        System.out.println(playerTwo.getVolume());

        System.out.println(music1.getSong());
//        System.out.println(music2.getSong());


        context.close();
    }
}
