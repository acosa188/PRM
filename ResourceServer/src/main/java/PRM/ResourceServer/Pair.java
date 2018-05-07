package PRM.ResourceServer;

public class Pair extends Object{

	String task;
	Object resource;
	
	public Pair(String wtask, Object wresource) {
		task = wtask;
		resource = wresource;
	}
	
	public String getTime() {
		return task;
	}
	
	public Object getResource() {
		return resource;
	}
}
