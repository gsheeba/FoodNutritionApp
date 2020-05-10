package com.ibm.FoodNutritionApp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Nutrients")
public class Nutrition {

	@Id
	public String id;

	public String name;
	public String protein;

	public Nutrition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nutrition(String id, String name, String protein) {
		super();
		this.id = id;
		this.name = name;
		this.protein = protein;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the protein
	 */
	public String getProtein() {
		return protein;
	}

	/**
	 * @param protein the protein to set
	 */
	public void setProtein(String protein) {
		this.protein = protein;
	}

	@Override
	public String toString() {
		return "Nutrition [id=" + id + ", name=" + name + ", protein=" + protein + "]";
	}

	

}
