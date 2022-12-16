package com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig;

import org.springframework.stereotype.Component;

//@Component
public class MovieRecommender {
    //@Autowired
    MovieFilter movieFilter;

    public MovieRecommender(){

    }
    public MovieFilter getMovieFilter() {
        return movieFilter;
    }

    public void setMovieFilter(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
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
