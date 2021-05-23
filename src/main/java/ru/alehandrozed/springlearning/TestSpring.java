package ru.alehandrozed.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //TestBean testBean = context.getBean("testBean", TestBean.class);
        //System.out.println(testBean.getName());

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer player = new MusicPlayer(music);

        player.playMusic();

        context.close();
    }
}
