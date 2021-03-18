package samples.demo;

public class Location {

	private String place;
	
	//getter
	public String getPlace () {
		return place;
	}
	
	//setter
	public void setPlace(String c) {
		this.place = c;
	}

	public static void main (String[]args) {
		
		Location v1 = new Location ();
		v1.setPlace("UTeM");
		System.out.println (v1.getPlace());
	}
}