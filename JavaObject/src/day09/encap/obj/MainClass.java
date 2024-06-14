package day09.encap.obj;

public class MainClass {

	public static void main(String[] args) {
	
		Hotel hotel = new Hotel(new Chef());
		
		//setter
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		//getter
		Chef c = hotel.getChef();
		c.cooking();
		
		
		
		
		
		
		
		
		
		
	}
}
