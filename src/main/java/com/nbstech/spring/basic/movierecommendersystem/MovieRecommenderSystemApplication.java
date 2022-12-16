package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.ExternalProperty.MovieRecommender;
//import com.nbstech.spring.basic.movierecommendersystem.Lesson3.MovieRecommender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



@ComponentScan(basePackages = "com.nbstech.spring.basic.movierecommendersystem.ExternalProperty")
@PropertySource("classpath:app.properties")
//@SpringBootApplication


public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		//create object of RecommenderImplementation class
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
		//MovieRecommender recommender = new MovieRecommender();

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		 //XMLAppConfig: load the configuration file


		//display results
		System.out.println(Arrays.toString(result));
		System.out.println(recommender.getFavoriteMovie());
		appContext.close();
	}


}
