# ShutDownLinuxPc

******************************************************************************************

Program in Java to shutdown Linux computer when battery power is low


******************************************************************************************

This script uses a timer to get battery percentage status every x seconds. When the battery percentage is lower than a threshold it shuts down the system using the command "shutdown -P minutes" through terminal. 

Instructions:

1. Open Main.java and Capacity.java in your workspace (Eclipse, netbeans, or other).
2. In Ubuntu 14.04 LTS there is a file located at "/sys/class/power_supply/BAT1/capacity" where the system outputs the current percentage of the battery. If you have another distribution of linux make sure this is the correct path. If it's not, correct the path inside the Capacity.java file. 
3. Set your sudo password in Main.java.
4. Export the project to a runnable Jar File.
5. Save Jar File to a secure location.


If you want to run the program automatically in the background every time you open your computer:

1. Go to StartUp Applications
2. Press Add
3. Set a Name
4. Browse your exported Jar File
5. In the Command section write: java -jar AbsolutePathOfJarFile
6. Set a description optionally 
7. Hit Save.




