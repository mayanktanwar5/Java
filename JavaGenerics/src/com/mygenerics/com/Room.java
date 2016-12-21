package com.mygenerics.com;

public class Room {

	private String roomType;
	private int noofBeds;
	private float priceForNight;
	
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getNoofBeds() {
		return noofBeds;
	}
	public void setNoofBeds(int noofBeds) {
		this.noofBeds = noofBeds;
	}
	public float getPriceForNight() {
		return priceForNight;
	}
	public void setPriceForNight(float priceForNight) {
		this.priceForNight = priceForNight;
	}
	 public Room(String roomType, int noofBeds, float priceForNight)
	 {
		 this.roomType=roomType;
		 this.noofBeds = noofBeds;
		 this.priceForNight = priceForNight;
	 }
	
}
