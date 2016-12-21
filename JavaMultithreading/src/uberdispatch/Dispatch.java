package uberdispatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dashboard uber = new Dashboard();
		
		uber.findCab(uber.userRegulator(), uber.driverRegulator());
		
		}
}


