package com.ibm.FoodNutritionApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.FoodNutritionApp.Model.Nutrition;
import com.ibm.FoodNutritionApp.Service.NutritionAppService;

@RestController
@RequestMapping("/v1")
public class NutritionAppController {
	
	@Autowired
	NutritionAppService nutAppService;
	
	@RequestMapping(path = "/default", method = RequestMethod.GET)
	public String healthCheck() {
		return "Nutrition App Up";
	}
	
	
	
	@RequestMapping(path = "/nutrient/{name}", method = RequestMethod.GET)
	public List<Nutrition> getNutrient(String foodName) {
		return nutAppService.getNutrientForName(foodName);
	}
	
	

}
