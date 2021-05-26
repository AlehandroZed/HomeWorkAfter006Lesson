package ru.alehandrozed.springlearning;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Rhapsody";
    }


}
