package com.ibm.FoodNutritionApp.Model;

import org.springframework.data.annotation.Id;

public class NutritionBean {

	public String name;
	public String protein;

	public NutritionBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NutritionBean(String id, String name, String protein) {
		super();
		this.name = name;
		this.protein = protein;
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

}
