package com.gaana.com;

import java.util.Scanner;

public class Player {

	Scanner scan = new Scanner(System.in);
	public void createAlbum()
	{
		System.out.println("Please enter the name of the Album you want to create  ");
		String albumName = scan.next();
		System.out.println("Please enter the number of Songs  in your Album  ");
		int albumSongCount = scan.nextInt();
		Album myAlbum =	new Album(albumName,albumSongCount);
		
		
	}
	
	
	


	
}
