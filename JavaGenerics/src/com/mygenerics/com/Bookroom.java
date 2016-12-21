package com.mygenerics.com;

public class Bookroom {

	private float totalCost;
	
	public Bookroom(Room room , Customer cust)
	{
		
		this.totalCost = (room.getPriceForNight())*(cust.getNoofDays());
		System.out.println("Congratulations "+cust.getCustomerName()+"  your room is booked ");
		System.out.println("Your iterniary ====>");
		System.out.println("Room Type : "+room.getRoomType());
		System.out.println("No of Beds in Room : "+room.getNoofBeds());
		System.out.println("Price for Night : "+room.getPriceForNight());
		System.out.println("No of days you are satying :"+cust.getNoofDays());
		System.out.println("Total cost for stay :" +this.totalCost);
	}
	
}
