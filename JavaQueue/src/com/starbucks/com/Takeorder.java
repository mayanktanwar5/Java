package com.starbucks.com;

import java.util.Scanner;

public class Takeorder  {
	
	Queuelist line = new Queuelist();
	Scanner scan = new Scanner(System.in);
	boolean nextCustomer=true;
	
	
	public void assistCustomer()
	{
		while(nextCustomer)
		{

			askCustomer();
		};
	}
	
	public void askCustomer()
	{
		System.out.println("===========Welcome to StarBucks===============");
		if(line.isEmpty())
		{
			System.out.println("Great You are first in ");
			System.out.println("Please select which coffee you want to have ");
			System.out.println("1. Mocha");
			System.out.println("2. Latte");
			System.out.println("Press 1 or 2 ");
			int choice = scan.nextInt();
			customerPick(choice,1);
		}
		
		else
		{
			System.out.println("Please select which coffee you want to have ");
			System.out.println("1. Mocha");
			System.out.println("2. Latte");
			System.out.println("Press 1 or 2 ");
			int choice = scan.nextInt();
			int customerNum = line.listSize() +1;
			customerPick(choice,customerNum);
		}
		
		
	}

	private void customerPick(int choice, int customerNum) {
		// TODO Auto-generated method stub
		if(choice==1)
		{	
			System.out.println("So Mocha it is \nPlease tell your name ");
			String username= scan.next();
			System.out.println("Great you are "+customerNum+" it will take "+ (2*customerNum)+" mins to get your order ready, Please wait");
			line.enqueue(new Coffee("Mocha",username));
			new Createorder(new Coffee("Mocha",username),line);
			Thread customerOrderThread = new Thread(new Createorder(new Coffee("Mocha",username),line));
			customerOrderThread.start();
			
			
		}
		else if(choice==2)
		{
			System.out.println("So Latte it is \nPlease tell your name ");
			String username= scan.next();
			System.out.println("Great you are "+customerNum+" it will take "+ (2*customerNum)+" mins to get your order ready, Please wait");
			line.enqueue(new Coffee("Latte",username));
			new Createorder(new Coffee("Latte",username),line);
			Thread customerOrderThread = new Thread(new Createorder(new Coffee("Latte",username),line));
			customerOrderThread.start();
			
			

		}
		
		System.out.print("Next Cutomer Please Y/N ?");
		String next = scan.next();
		if(next.equals("Y"))
		{
			
			
		}
		else
		{
			nextCustomer=false;
			line.displayList();
		}
	}


}
