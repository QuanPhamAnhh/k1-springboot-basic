package com.nbstech.spring.basic.movierecommendersystem.Lesson3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("CBR")
public class ContentBasedFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        //implement logic of content based filter


        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
