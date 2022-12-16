package com.nbstech.spring.basic.movierecommendersystem.ExternalProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    //@Autowired
    MovieFilter movieFilter;
    @Value("${movie.name}")
    private String favoriteMovie;

    public String getFavoriteMovie() {
        return favoriteMovie;
    }


    public String [] recommendMovies (String movie) {


        //use content based filter to find similar movies

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
