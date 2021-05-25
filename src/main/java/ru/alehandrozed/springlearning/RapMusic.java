package ru.alehandrozed.springlearning;

public class RapMusic implements Music {
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
