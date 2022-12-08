package com.nbstech.spring.basic.movierecommendersystem.Lesson2;

public class MovieRecommender {
    MovieFilter movieFilter;

    public MovieRecommender (MovieFilter movieFilter){
        super();
        this.movieFilter=movieFilter;
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
