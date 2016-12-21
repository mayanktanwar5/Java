package com.starbucks.com;

public class Coffee {
	
	
	private String coffeeType;
	private String userName;
	
	public String getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Coffee(String coffeeType, String userName)
	{
		this.coffeeType=coffeeType;
		this.userName=userName;
		
		
	}
}
