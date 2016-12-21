package com.starbucks.com;

public class Queuelist {

	private Listnode first =null;
	private Listnode last=null;
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (first==null);
	}
	
	public void enqueue(Coffee coffee)
	{
		Listnode newCoffee = new Listnode(coffee);
		
		if (isEmpty()) {
			newCoffee.next = first;
            first = newCoffee;
            last = newCoffee;
        } else {
            last.next = newCoffee;
            last = newCoffee;
            last.next = null;
        }
	}

	
	
	public Coffee dequeue() {

        Listnode delElem = first;
        if (first.next == null)
            last = null;
        first = first.next;
        return delElem.link;

    }


public void displayList() {
    Listnode current = first;
    while (current != null) {
        current.displayNode();
        current = current.next;
    }
}

public int listSize()
{
	Listnode current = first;
	int size=0;
    while (current != null) {
         size+=1;
        current = current.next;
        }
    return size;
}
}	

