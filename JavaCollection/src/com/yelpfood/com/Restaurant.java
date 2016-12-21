package com.yelpfood.com;
import java.util.ArrayList;


public class Restaurant {

	 private String restaurantName;
	 private String restaurantLocation;
	 private float restaurantCost;
	 private  String restaurantCuisine;
	 private  ArrayList<String> cuisineList = new ArrayList<String>();
	 
	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public String getRestaurantLocation() {
		return restaurantLocation;
	}



	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}



	public float getRestaurantCost() {
		return restaurantCost;
	}



	public void setRestaurantCost(float restaurantCost) {
		this.restaurantCost = restaurantCost;
	}



	public String getRestaurantCuisine() {
		return restaurantCuisine;
	}



	public void setRestaurantCuisine(String restaurantCuisine) {
		this.restaurantCuisine = restaurantCuisine;
	}



	public ArrayList<String> getCuisineList() {
		return cuisineList;
	}



	public void setCuisineList(ArrayList<String> cuisineList) {
		this.cuisineList = cuisineList;
	}



	public Restaurant(String name, String location,String cuisine, float cost)
	{
		restaurantName =name;
		restaurantLocation=location;
		restaurantCost=cost;
		restaurantCuisine=cuisine;
		addCuisine(cuisine);
	};
	
	

	public  void addCuisine (String cuisine)
	{
		
		cuisineList.add(cuisine);
		
	}
	
	public  void removeCuisine (String cuisine)
	{
		
		for (String cuisineIn : cuisineList) {
            if(cuisineIn.matches(cuisine)){
            	cuisineList.remove(cuisineList.indexOf(cuisineIn));
            };
		
	}
	
	}}
