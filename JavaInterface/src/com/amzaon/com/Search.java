package com.amzaon.com;

import java.util.Scanner;

public class Search {
	
	Scanner scan = new Scanner(System.in);
	public void askUser()
	
	{
		System.out.println("Please enter the book name you want to add");
		String bookName = scan.next(); 
		System.out.println("Please enter the Author name");
		String authorName =scan.next();
		System.out.println("Please enter the price of book");
		float price  =scan.nextFloat();
		System.out.println("Please enter the book is Prime");
		boolean isPrime = scan.nextBoolean();
		
		if(isPrime)
		{
			 new Books(bookName,authorName,price,true); 
		}
		else
		{
			 new Books(bookName,authorName,price,false);
		}
		
	}

}
