
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


public class Main  {
	
	//****** Set The sudo Password *******
	final String password = "";
	//************************************
	
	Capacity getPower;
	String Percentage;
	Timer timer;
	
	final int delay = 60; // Get battery percentage status every 60 seconds
	final int threshold = 3;// Shutdown threshold (battery percentage)
	
	final String command = "echo " + password + " | sudo -S shutdown -P 1";
    
	public Main() {
	   getPower = new Capacity();
	}
	
	public void Start() {
	   timer = new Timer();
           timer.schedule(new RunTask(),0, delay*1000);
	}
	
	
	class RunTask extends TimerTask {
	public void run(){
		
		Percentage = getPower.getCapacity();// Get current battery percentage
	
		if (Integer.parseInt(Percentage) <= threshold){ // If current battery percentage is equal or lower than percentage
		
		String[] args = new String[] {"/bin/bash", "-c", command, "with", "args"};// shutdown system in one minute
		try {
			Process proc = new ProcessBuilder(args).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}//end if
		
	}
	}

	public static void main(String[] args) {
		
       Main startit = new Main();
       startit.Start();

	}

}
