package com.ibm.FoodNutritionApp.DAO;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.FoodNutritionApp.Model.Nutrition;

@Repository
public interface NutritionAppRepository extends MongoRepository<Nutrition, String>{
	
	
}
