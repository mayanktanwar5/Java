package com.mygenerics.com;

public class Customer {

	private String customerName;
	private int noofDays;
	private int roomType;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getNoofDays() {
		return noofDays;
	}
	public void setNoofDays(int noofDays) {
		this.noofDays = noofDays;
	}
	
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	
public Customer(String customerName ,int noofDays , int roomType)
{
	this.customerName =customerName;
	this.noofDays = noofDays;
	this.roomType = roomType;

}
	
	
}
