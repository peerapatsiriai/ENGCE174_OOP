package Lab7;

public class motobike extends vehicle {
	/**
	 * Start move car 
	 */
	public motobike() {
		System.out.println(" | Motobike start ! |");
	}//end method

	/**
	 * Just moving a car 
	 * @param name user input speed for car and kilometer/hour
	 */

	public void move(String brand , float km) {
		System.out.println(" My Motobike Brand "+ brand  + "Max Speed" + km +" km/hr " );
	}//end method
}//end class
