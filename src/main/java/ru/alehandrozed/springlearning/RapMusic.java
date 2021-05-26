package ru.alehandrozed.springlearning;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    private RapMusic() {
    }

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "Ice,Ice, Baby";
    }
    public  void initMethod(){
        System.out.println("do my initialisation");
    }

    public void destroyMethod(){
        System.out.println("do my destroy");
    }
}
