import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Capacity {
	
	String returnC;
	BufferedReader brTest;

	public Capacity() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCapacity(){
		
		try {
			brTest = new BufferedReader(new FileReader("/sys/class/power_supply/BAT1/capacity"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     
		try {
			returnC = brTest .readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnC;
		
	}

}
