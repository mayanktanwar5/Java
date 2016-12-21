package com.browser.com;

public class Listnode {
	
	public String link;
	public Listnode next;

	public Listnode(String data) {
	    this.link = data;
	}

	public void displayNode() {
	    System.out.print(" ==> "+link );

	 }
}
