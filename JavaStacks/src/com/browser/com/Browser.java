package com.browser.com;

public class Browser {

	Stacklist forwardStack = new Stacklist();
	Stacklist backwardStack = new Stacklist();
	Stacklist allStack = new Stacklist();
	public  void forward(String str)
	{
		
		forwardStack.push(str);
	}
	
	public String backward()
	{
		return forwardStack.pop();
	}
	public void showList()
	{
		allStack.displayList();
	}
	
}
