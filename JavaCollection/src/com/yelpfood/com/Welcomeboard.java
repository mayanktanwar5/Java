package com.yelpfood.com;

import java.util.Scanner;

public class Welcomeboard {

	
	
	public void welcome(){
		
		RestaurantRegulator rg = new RestaurantRegulator();
		rg.setRestaurants();
		System.out.println("Welcome to Yelp \n \n Enter your choice \n Press 1 for as User  \n Press 2  to register a restaurant");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		
		switch(choice)
		{ case 1:
			userChoices(rg);
			break;
		case 2:
			restaurantRegister(rg);
			break;
		} 
	}
	
	public static void userChoices(RestaurantRegulator rg)
	{	
		
		
		System.out.println("Please select your choices \n 1. Search Restaurant By Cuisine \n 2. Search Restaurant By Location.\n 3. See All Restaurants. \n Please enter 1,2 or 3");
		Scanner scan1 = new Scanner(System.in);
		int choice1 = scan1.nextInt();
		switch(choice1)
		{ case 1:
			userFoodChoices( rg);
			break;
		case 2:
			userRestaurantChoices(rg);
			break;
		case 3:
			rg.showAllRestaurants();
			break;
		} 
		
		
	}
	

	
	public static void restaurantRegister(RestaurantRegulator rg)
	{	
		 String restaurantname ,cuisisneType,restaurantLocation;
		 float averageCost;
		System.out.println("Please enter your restaurant Details");
		System.out.println("Your Rsetaurant name");
		Scanner scan = new Scanner(System.in);
		restaurantname = scan.next();
		System.out.println("Your Restaurant locatoin \n 1. South \n 2. North \n 3. East \n 4.West");
		Scanner scan1 = new Scanner(System.in);
		restaurantLocation =scan1.next();
		System.out.println("Your Restaurant Cuisine \n 1. Thai \n 2. Indian \n 3. Chinese \n 4.Italian ");
		Scanner scan2 = new Scanner(System.in);
		cuisisneType =scan2.next();
		System.out.println("Your restaurant's  average cost for two person");
		Scanner scan3 = new Scanner(System.in);
		averageCost = scan3.nextFloat();
		
		rg.addRestaurants(new Restaurant(restaurantname,restaurantLocation,cuisisneType,averageCost));
		System.out.println("SuccessFully added your restaurant \n Please select your view  to see restaurant ");
		userChoices(rg);
		
		
	}
	
	public static  void userFoodChoices(RestaurantRegulator rg)
	{
		
		System.out.println("Please select your food choices \n 1. Thai \n 2. Indian \n 3.Chinese \n 4.Italian \n Please enter 1,2,3 or 4");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice)
		{ case 1:
			rg.getRestaurantByCuisine("Thai");
			break;
		case 2:
			rg.getRestaurantByCuisine("Indian");
			break;
		case 3:
			rg.getRestaurantByCuisine("Chinese");
			break;
		case 4:
			rg.getRestaurantByCuisine("Italian");
			break;
		} 
		
	};
	public static void userRestaurantChoices(RestaurantRegulator rg)
	{
		
		System.out.println("Please select your food choices \n 1. South \n 2. East \n 3.West \n 4.North \n Please enter 1 or 2");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice)
		{ case 1:
			rg.getRestaurantByLocation("South");
			break;
		case 2:
			rg.getRestaurantByLocation("East");
			break;
		case 3:
			rg.getRestaurantByLocation("West");
			break;
		case 4:
			rg.getRestaurantByLocation("North");
			break;
		} 
		
	};
	
	

}



