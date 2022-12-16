package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig.MovieRecommender;
//import com.nbstech.spring.basic.movierecommendersystem.Lesson3.MovieRecommender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



//@ComponentScan
//@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//AnnotationConfigApplicationContext appContext =
				//new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		//create object of RecommenderImplementation class
		//MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
		MovieRecommender recommender = new MovieRecommender();

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		 //XMLAppConfig: load the configuration file
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		//display results
		System.out.println(Arrays.toString(result));
		appContext.close();
	}


}
