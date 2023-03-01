package Lab7;

public class drone extends ballon {
	/**
	 * Start move car 
	 */
	public drone() {
		System.out.println(" | Drone Fly ! |");
	}//end method

	/**
	 * Just moving a car 
	 * @param name user input speed for car and kilometer/hour
	 */

	public void move(int speed ) {
		System.out.println("Thes Drone Con Fly Max Speed: " + speed);
	}//end method
}//end class
