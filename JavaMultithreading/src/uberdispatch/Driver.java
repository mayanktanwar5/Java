	package uberdispatch;
import java.util.Random;
//import java.util.HashMap;
//import java.util.Map;



public class Driver implements 	Runnable {

	private String driverName;
	private long driverTelephonenumber;
	private boolean cabBooked;
	private int driverLocation =5;
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public long getDriverTelephonenumber() {
		return driverTelephonenumber;
	}
	public void setDriverTelephonenumber(long driverTelephonenumber) {
		this.driverTelephonenumber = driverTelephonenumber;
	}
	public boolean isCabBooked() {
		return cabBooked;
	}
	public void setCabBooked(boolean cabBooked) {
		this.cabBooked = cabBooked;
	}
	public int getDriverLocation() {
		return driverLocation;
	}
	public void setDriverLocation(int driverLocation) {
		this.driverLocation = driverLocation;
	}
	public Driver(long telephoneNum ,String name)
	{
		 driverName= name;
		 driverTelephonenumber= telephoneNum;
		 
	};
	public void driverGeoLocation()
	{
		Random currentGeo = new Random();
		while(!cabBooked)
		{	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			driverLocation = currentGeo.nextInt(10);
			
		}
		
	};
	
	
	
	
	
	@Override
	public void run()
	{
		this.driverGeoLocation();
	};
	
	
}
