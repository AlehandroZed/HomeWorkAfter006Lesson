package ru.alehandrozed.springlearning;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Rhapsody";
    }

    public  void initMethod(){
        System.out.println("do my initialisation");
    }

    public void destroyMethod(){
        System.out.println("do my destroy");
    }
}
