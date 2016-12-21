package com.browser.com;

import java.util.Scanner;

public class Browse {

	Scanner scan = new Scanner(System.in);
	Browser web = new Browser();
	private String currentLink ;
	boolean status =true;
	int questionCount =0;
	
	public void website()
	{	
		
		
		currentLink= question();
		while(status)
		{questionCount+=1;
		askBrowseMore();
		
		}		
		
	}
	
	public String question()
	{
		System.out.println("Please enter the webiste link you want to visit");
		String answer = scan.next();
		web.forward(answer);
		web.allStack.push(answer);
		return answer;
	}
	
	public boolean askBrowseMore()
	{ 
		if(questionCount<2)
		{
			System.out.println( "Current link ===>"+question());
		}
		else{
		System.out.println("You want to browse more website ? \n========== Press 1 for yes or 2 for no==========");
		Scanner scan1 = new Scanner(System.in);
		int browseMore  = scan1.nextInt();
		System.out.println(browseMore);
		
		if(browseMore==1 && questionCount>=2)
		{	
			
			System.out.println( "Current link ===>"+checkNavigation());
			
			
			
		}
		
		
		else
		{	status =false;
			System.out.println("========== Thanks for browsing ,These are links you visisted=========");
			web.showList();
			
		}
		}
		return status;
	}
	
	public String checkNavigation()
	{
		System.out.println("========== Press 1 for go to your previous link======= \n==========or Press 2 to continue browsing==========");
		Scanner scan2 = new Scanner(System.in);
		int choice = scan2.nextInt();
		String choiceResult = null ;
		switch(choice)
		{
		case 1:
			String s= web.backward();
			choiceResult= web.backward();
			break;
		case 2:
			choiceResult = question();
			break;
			
		}
		return choiceResult;
		
		
	}
}
