package Lab7;

public class vehicle {
	public int wheel ;
	
	public vehicle() {
		System.out.println("\n | Vehicle start |");
	}//end method
	
	/**
	 * Start move vehicle 
	 */
	public void move() {
		System.out.print(" | Vehicle Move  |");
	}//end method
	
	/**
	 * Just moving vehicle 
	 * @param name user input name Driver
	 */
	
	public void move( String name) {
		System.out.println("--|My Driver ::" + name +" --->");
	}//end method
}
