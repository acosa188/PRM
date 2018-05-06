package PRM.ResourceServer;

public class Pair extends Object{

	String time;
	Object resource;
	
	public Pair(String wtime, Object wresource) {
		time = wtime;
		resource = wresource;
	}
	
	public String getTime() {
		return time;
	}
	
	public Object getResource() {
		return resource;
	}
}
