package com.javaunit3.springmvc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;



@Component
@Qualifier("titanicMovie")
public class Titanic implements Movie{
    @Override
    public String getTitle() {
        return "Titanic";
    }

    @Override
    public String getMaturityRating() {
        return "PG-13";
    }

    @Override
    public String getGenre() {
        return "Romance";
    }

}
