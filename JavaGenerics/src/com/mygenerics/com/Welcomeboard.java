package com.mygenerics.com;

import java.util.Scanner;

public class Welcomeboard {
	
	Scanner scan = new Scanner(System.in);
	public void welcome()
	{
		RoomArranger arranger = new RoomArranger();
		arranger.setRooms();
		System.out.println("Please enter your Name  ");
		String customerName = scan.next();
		System.out.println("Here are the list of room we have ==> ");
		arranger.showAllRooms();
		System.out.println("Please enter a Room no below to select room ");
		//Scanner scan = new Scanner(System.in);
		int roomSelected = scan.nextInt();
		roomSelected = roomSelected -1;
		System.out.println("Please enter number of days you want to book the room");
		//Scanner scan1 = new Scanner(System.in);
		int noofDays = scan.nextInt();
		Bookroom newRoom = new Bookroom(arranger.roomList.get(roomSelected),new Customer(customerName,noofDays,roomSelected));
		
	}

}
