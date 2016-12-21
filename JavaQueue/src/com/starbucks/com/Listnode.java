package com.starbucks.com;

public class Listnode {
	public Coffee link;
	public Listnode next;

	public Listnode(Coffee data) {
	    this.link = data;
	}

	public void displayNode() {
	    System.out.print(link.getUserName()+"  "+link.getCoffeeType()+" "+" ==> " );

	 }
}
