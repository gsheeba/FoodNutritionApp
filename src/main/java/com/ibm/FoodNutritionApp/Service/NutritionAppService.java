package com.ibm.FoodNutritionApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.FoodNutritionApp.DAO.NutritionAppRepository;
import com.ibm.FoodNutritionApp.Model.Nutrition;


@Component
public class NutritionAppService {
	
	@Autowired
	NutritionAppRepository nutritionAppRepository;
	
	public List<Nutrition> getNutrientForName(String foodName) {
		return nutritionAppRepository.findAll();
		
	}
}
