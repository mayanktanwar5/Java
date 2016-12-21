package com.browser.com;

public class Stacklist {

	private Listnode head= null;
	
	public void push(String str)
	{
		Listnode newLink = new Listnode(str); 
		newLink.next =head;
		head= newLink;
	}
	
	public String pop()
	{
		String linkValue = null;
		if(!isStackEmpty())
		{
			Listnode delLink = head;
			head=head.next;
			linkValue= delLink.link;
		}
		return linkValue;
		
	}
	public boolean isStackEmpty()
	{
		return (head==null);
	}
	
	public void displayList()
	{
		Listnode current = head;
		while(current!=null)
		{
			current.displayNode();
			current=current.next;
		}
	}
	
	}
	
	
	

