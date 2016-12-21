package uberdispatch;
import java.util.Random;




public class User implements 	Runnable{
	
	private String userName;
	private long userTelephonenumber;
	private boolean cabBooked =false;
	private int userLocation =1;
	
	public User(long telephoneNum ,String name)
	{
		 userName= name;
		 userTelephonenumber= telephoneNum;
	};
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserTelephonenumber() {
		return userTelephonenumber;
	}

	public void setUserTelephonenumber(long userTelephonenumber) {
		this.userTelephonenumber = userTelephonenumber;
	}

	public boolean isCabBooked() {
		return cabBooked;
	}

	public void setCabBooked(boolean cabBooked) {
		this.cabBooked = cabBooked;
	}

	public int getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(int userLocation) {
		this.userLocation = userLocation;
	}

	public void userGeoLocation()
	{
		Random currentGeo = new Random();
		while(!cabBooked)
		{	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			userLocation = currentGeo.nextInt(10);
			
			
		}
	};
	
	@Override
	public void run()
	{
		this.userGeoLocation();
	};
}
