package com.mygenerics.com;

import java.util.ArrayList;

public class RoomArranger {

	 
	 ArrayList<Room> roomList = new ArrayList<Room>();
	 
	 
	 public void setRooms()
	 
	 {
		 roomList.add(new Room("Single",1,19));
		 roomList.add(new Room("Twin",2,29));
		 roomList.add(new Room("Queen",2,39));
		 roomList.add(new Room("King",3,49));
		 roomList.add(new Room("Suite",2,70));
	 }
	 
	 public void welcome()
	 {
		 
	 }
	 
	 public void addRoom(Room room)
	 {
		 roomList.add(room);
		 
	 }
	 
	 public void showAllRooms()
	 {
		 System.out.println("Below are the list of all available Rooms");
		 int i=1;
		 for(Room r :roomList )
		 {
			 
			 System.out.println("=========Room No "+i+"==========");
			 System.out.println("Room Type : "+r.getRoomType());
			 System.out.println("No of Beds : "+r.getNoofBeds());
			 System.out.println("Price per Night : "+r.getPriceForNight());
			 i++;
		 }
	 }
	
}
