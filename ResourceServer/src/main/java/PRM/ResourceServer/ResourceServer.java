package PRM.ResourceServer;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class ResourceServer {
	private static Date date;
	private static String time;
	private static HashMap<String,Pair> routine;
	private boolean shutDown = false;
	
	public ResourceServer() {
		date = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
		time = ft.format(date);
		
		//initialize an empty list
		routine = new HashMap<String, Pair>();
		
	}
	
	//This function regularly checks in interval if conditions are met in the
	//List, if so execute the task
	public void start() {
		Date xdate;
		while(!shutDown) {
			xdate = new Date();
			if(routine.containsKey(getCurrTime(xdate))) {
				//Execute the task
			}
		}
	}
	
	//Getting the current time to string
	public String getCurrTime(Date _date) {
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
		return ft.format(_date);
	}
	
	//Adds a resource at what time
	//This resource will be contacted to perform certain tasks
	public void addRoutine(String wtime, Object wresource, String task) {
		try {
		routine.put(wtime,new Pair(task,wresource));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Shutting down the system
	public void isShutdown() {
		shutDown = true;
	}
}
