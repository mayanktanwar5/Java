package com.amzaon.com;

import java.util.Scanner;

public class Books extends Product  {
	
	private String bookName;
	private float bookPrice;
	private boolean isPrime;
	private float discount;
	private String delivery;
	private String authorname;
	private String bookDiscount;
	

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
	
	
	public Books(String bookName,String authorname, float bookPrice, boolean isPrime)
	{
		super(1234, 1, "Stationary", "Book", isPrime);
		this.isPrime = isPrime;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.authorname=authorname;
		checkPrime();
		
	}

	public void checkPrime() {
		
		if(isPrime)
		{
		System.out.println("Please enter  discount type \n1. Ten \n2. Twenty  \n3. Thirty \n\n Type 1,2 or 3");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		setPrime(choice);
		
		}
		else
		{
			System.out.println("A new book is logged with following details ");
			System.out.println("===========================================");
			System.out.println("ProductId : "+ super.getProductId());
			System.out.println("ProductName : "+ super.getProductName());
			System.out.println("ProductType : "+ super.getCategory());
			System.out.println("BookName : "+bookName );
			System.out.println("BookAuthor : "+authorname );
			System.out.println("BookPrice : "+bookPrice+" Dollars" );
			System.out.println("is Prime : "+isPrime );
			System.out.println("Book Discount "+super.productPrice());
			System.out.println("Book Delivery  "+super.productDelivery());
			
		}
		
	}

	public void setPrime(int choice) {
		
		Tenpercent ten = new Tenpercent();
		Twentypercent twenty = new Twentypercent();
		ThirtyPercent thirty = new ThirtyPercent();
		
		switch(choice)
		{
			case 1:
				bookPrice = bookPrice*ten.primeDiscount();
				delivery = ten.primeDelivery();
				bookDiscount ="Ten Percent";
				break;
			case 2:
				bookPrice = bookPrice*twenty.primeDiscount();
				delivery = twenty.primeDelivery();
				bookDiscount ="Twenty Percent";
				break;
		
			case 3:
				bookPrice = bookPrice*thirty.primeDiscount();
				delivery = thirty.primeDelivery();
				bookDiscount ="Thirty Percent";
				break;	
			
		};
		
		System.out.println("A new book is logged with following details ");
		System.out.println("===========================================");
		System.out.println("ProductId : "+ super.getProductId());
		System.out.println("ProductName : "+ super.getProductName());
		System.out.println("ProductType : "+ super.getCategory());
		System.out.println("BookName : "+bookName );
		System.out.println("BookAuthor : "+authorname );
		System.out.println("BookPrice : "+bookPrice +" Dollars");
		System.out.println("is Prime : "+isPrime );
		System.out.println("Book Discount "+bookDiscount);
		System.out.println("Book Delivery "+delivery);
		
		
		
	}

	

	

	
	
}
