package com.yelpfood.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

public class RestaurantRegulator {
	 ArrayList<Restaurant> restaurantListThai = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListIndian = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListChinese = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListItalian = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListNorth = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListEast = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListWest = new ArrayList<Restaurant>();
	 ArrayList<Restaurant> restaurantListSouth = new ArrayList<Restaurant>();
	
	 HashMap<String, ArrayList<Restaurant>> restaurantByCuisine =new HashMap<String,ArrayList<Restaurant>>();
	 HashMap<String, ArrayList<Restaurant>> restaurantByLocation =new HashMap<String,ArrayList<Restaurant>>();
     ArrayList<Restaurant> allRestaurants = new ArrayList<Restaurant>();
	
    
    
public void setRestaurants()
{
	
	 Restaurant  r1 = new Restaurant("Indian Masala" ,"North","Indian",20);
	 Restaurant  r2 = new Restaurant("Chinese Masala" ,"East","Chinese",20);
	 Restaurant  r3 = new Restaurant("Italian Masala" ,"West","Italian",20);
	 Restaurant  r4 = new Restaurant("Thai Masala" ,"South","Thai",20);
	 restaurantListThai.add(r4);
	 restaurantListIndian.add(r1);
	 restaurantListChinese.add(r2);
	 restaurantListItalian.add(r3);
	 restaurantListNorth.add(r1);
	 restaurantListEast.add(r2);
	 restaurantListWest.add(r3);
	 restaurantListSouth.add(r4);
	 allRestaurants.add(r1);
	 allRestaurants.add(r2);
	 allRestaurants.add(r3);
	 allRestaurants.add(r4);
	 restaurantByCuisine.put("Thai", restaurantListThai);
	 restaurantByCuisine.put("Italian", restaurantListItalian);
	 restaurantByCuisine.put("Chinese", restaurantListChinese);
	 restaurantByCuisine.put("Indian", restaurantListIndian);
	 restaurantByLocation.put("South", restaurantListSouth);
	 restaurantByLocation.put("East", restaurantListEast);
	 restaurantByLocation.put("West", restaurantListWest);
	 restaurantByLocation.put("North", restaurantListNorth);

}

public  void getRestaurantByCuisine(String foodtype)
{	ArrayList<Restaurant> addedRestaurant;
	if(foodtype == "Thai")
	{
		addedRestaurant = restaurantByCuisine.get("Thai");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }
	
	else if(foodtype == "Indian")
	{
		addedRestaurant = restaurantByCuisine.get("Indian");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }
	
	else if(foodtype == "Chinese")
	{
		addedRestaurant = restaurantByCuisine.get("Chinese");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }
	
	else 
	{	if(foodtype == "Italian"){
		addedRestaurant = restaurantByCuisine.get("Italian");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }}
	}

public  void getRestaurantByLocation(String location)
{	ArrayList<Restaurant> addedRestaurant;
	if(location == "South")
	{
		addedRestaurant = restaurantByLocation.get("South");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }
	
	else if(location == "East")
	{
		addedRestaurant = restaurantByLocation.get("East");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }
	
	else if(location == "West")
	{
		addedRestaurant = restaurantByLocation.get("West");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
		
	      }
	
	else 
	{ if(location == "North"){
		addedRestaurant = restaurantByLocation.get("North");
		System.out.println(addedRestaurant);
		for(Restaurant res:addedRestaurant)
		{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		}
	}
	      }
	}

public  void addRestaurants(Restaurant res)
{
	String cuisine = res.getRestaurantCuisine();
	String location = res.getRestaurantLocation();
	allRestaurants.add(res);
	

	
	if(cuisine.equals("Thai"))
	{
		restaurantListThai.add(res);
		restaurantByCuisine.put("Thai", restaurantListThai);
//		System.out.println("SuccessFully added your restaurant \n Please check your restaurant in below list");
//		getRestaurantByLocation("Thai"); 
	}
	else if(cuisine.equals("Indian"))
	{
		restaurantListIndian.add(res);
		 restaurantByCuisine.put("Indian", restaurantListIndian);
//		 System.out.println("SuccessFully added your restaurant \n Please check your restaurant in below list");
//			getRestaurantByLocation("Indian"); 
	}
	else if(cuisine.equals("Italian"))
	{
		restaurantListItalian.add(res);
		 restaurantByCuisine.put("Italian", restaurantListItalian);
//		 System.out.println("SuccessFully added your restaurant \n Please check your restaurant in below list");
//			getRestaurantByLocation("Italian"); 
	}
	else 
	{
		if(cuisine.equals("Chinese"))
		{System.out.println("SuccessFully added your restaurant  in Chinese list");
			restaurantListChinese.add(res);
		 restaurantByCuisine.put("Thai", restaurantListChinese);
		 }
//			getRestaurantByLocation("Chinese"); 
	}
	
	if(location.equals("North"))
	{
		restaurantListNorth.add(res);
		restaurantByLocation.put("North", restaurantListNorth);
		System.out.println("SuccessFully added your restaurant  in North list");
//		getRestaurantByLocation("Thai"); 
	}
	else if(location.equals("East"))
	{
		restaurantListEast.add(res);
		restaurantByLocation.put("East", restaurantListEast);
//		 System.out.println("SuccessFully added your restaurant \n Please check your restaurant in below list");
//			getRestaurantByLocation("Indian"); 
	}
	else if(location.equals("West"))
	{
		restaurantListWest.add(res);
		restaurantByLocation.put("West", restaurantListWest);
//		 System.out.println("SuccessFully added your restaurant \n Please check your restaurant in below list");
//			getRestaurantByLocation("Italian"); 
	}
	else 
	{ if(location.equals("South")){
		restaurantListSouth.add(res);
		 restaurantByLocation.put("South", restaurantListSouth);}
//		 System.out.println("SuccessFully added your restaurant \n Please check your restaurant in below list");
 
	}
	
	
}

public void showAllRestaurants()

{
	
	for(Restaurant res :allRestaurants)
	{
			System.out.println("=======Restaurant========");
			System.out.println("Restaurant name :" +res.getRestaurantName());
			System.out.println("Location : "+res.getRestaurantLocation());
			System.out.println("Average Cost for 2  :"+res.getRestaurantCost());
			System.out.println("Cuisine :"+res.getRestaurantCuisine());
		
	}
}


}


