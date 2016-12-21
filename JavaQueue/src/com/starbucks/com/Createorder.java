package com.starbucks.com;

public class Createorder implements Runnable{
	
	Queuelist queue;
	Coffee coffee;
	public Createorder(Coffee coffee, Queuelist queue)
	{
		this.queue=queue;
		this.coffee= coffee;
	}
	

	
	public void checkQueue(Queuelist queue)
	{
		int waitingTime =(queue.listSize()*2)*20;
		while(waitingTime>0)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if((waitingTime>0) && (waitingTime<10))
				{System.out.println( "Mr "+coffee.getUserName()+ " your waiting time===> "+ waitingTime);}
			waitingTime--;
		}
		
		if(waitingTime<=0)
		{
			Coffee cof =queue.dequeue() ;
			System.out.println("==============================================================================\n\n");
			System.out.println("Mr "+cof.getUserName()+" your "+cof.getCoffeeType()+" is ready . Enjoy it !!\n\n\n");
			System.out.println("-------People in queue now-------\n\n");
			queue.displayList();
			System.out.println("\n\n==============================================================================\n\n");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.checkQueue(queue);
		
	}

}
