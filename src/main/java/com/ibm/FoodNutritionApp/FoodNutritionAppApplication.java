package com.ibm.FoodNutritionApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ibm.FoodNutritionApp.DAO.NutritionAppRepository;
import com.ibm.FoodNutritionApp.Model.Nutrition;

@SpringBootApplication
public class FoodNutritionAppApplication {
	
	@Autowired
	NutritionAppRepository nutAppRepository;

	public static void main(String[] args) {
		SpringApplication.run(FoodNutritionAppApplication.class, args);
	}
	
	
	
	@Bean
	CommandLineRunner bootitup(ApplicationContext ctx) {
		return (a) -> {
			int count = ctx.getBeanDefinitionCount();
			System.out.println("Total Bean Count = " + count);
			String beans[] = ctx.getBeanDefinitionNames();
			/*
			 * for (int i = 0; i < count; i++) { System.out.println(beans[i]); }
			 */

			Nutrition nut = new Nutrition("100", "Milk", "10.24");
			nutAppRepository.save(nut);
			nut = new Nutrition("101", "Condensed Milk", "10.24");
			nutAppRepository.save(nut);
			nut = new Nutrition("102", "Potato", "10.24");
			nutAppRepository.save(nut);
			nut = new Nutrition("103", "Tomato", "10.24");
			nutAppRepository.save(nut);
			

			
		};
	}
	
	

}
