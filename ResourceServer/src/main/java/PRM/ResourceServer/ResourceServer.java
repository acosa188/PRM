package PRM.ResourceServer;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class ResourceServer {
	private static Date date;
	private static String time;
	private static HashMap<Pair,String> routine;
	
	public ResourceServer() {
		date = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
		time = ft.format(date);
		
		//initialize an empty list
		routine = new HashMap<Pair, String>();
		
	}
	
	//Adds a resouce at what time
	//This resource will be contacted to perform certain tasks
	public void addRoutine(String wtime, Object wresource, String task) {
		try {
		routine.put(new Pair(wtime,wresource), task);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
