package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.Lesson3.MovieRecommender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
@ComponentScan
//@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		//create object of RecommenderImplementation class
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
		//MovieRecommender recommender = new MovieRecommender();

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
		appContext.close();
	}


}
