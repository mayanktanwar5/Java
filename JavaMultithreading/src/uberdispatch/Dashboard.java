package uberdispatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dashboard {

	public List<Driver> driverRegulator()
	{
		 List<Driver> drivers = new ArrayList<Driver>();
		 List<Thread> threads = new ArrayList<Thread>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of drivers you want to hire");
		int driverCount = scan.nextInt();
		
		for(int i=0;i<driverCount;i++)
		{	
			Scanner scan2 = new Scanner(System.in);
     		System.out.println("Hello Please enter Driver details  \n Driver name ");
			String name = scan2.next();
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Mobile number");
			long  tel =scan1.nextLong();
			drivers.add(new Driver(tel,name));
			threads.add(new Thread(drivers.get(i)));
			new Driver(tel,name);
		}
		for(int i=0;i<driverCount;i++)
		{
			threads.get(i).start();
		}
		
	return drivers;	
		
	}
	

	
	public  User userRegulator()
	{	
		System.out.println("Hello Please enter your details  \n Your name ");
		Scanner scan = new Scanner(System.in);
		String getname = scan.next();
		System.out.println("Your mobile number");
		long  getUserNum =scan.nextLong();
		User firstuser = new User(getUserNum,getname);
		
		firstuser.setUserName(getname);
		firstuser.setUserTelephonenumber(getUserNum);
		Thread userThread = new Thread(firstuser);
		userThread.start();
		
		return firstuser;
		
	}
	
	public  void findCab(User firstuser, List<Driver> drivers )
	{
		
		while(!firstuser.isCabBooked())
		{  
			for(int i=0;i<drivers.size();i++)
			{ //System.out.println("user "+firstuser.getUserName() +" location ===>" + firstuser.getUserLocation() +"  driver "+drivers.get(i).getDriverName()+" ====>  location " +drivers.get(i).getDriverLocation());
				if( (firstuser.getUserLocation())==(drivers.get(i).getDriverLocation()))
				{
					
					System.out.println( " Mr "+firstuser.getUserName() +" your cab is booked "+drivers.get(i).getDriverName()+"  is on his way");
					firstuser.setCabBooked(true);
					for(int j=0;j<drivers.size();j++)
					{
						drivers.get(j).setCabBooked(true);
					}
					break;
				}
			}
			
			
		}
	}
	
}
