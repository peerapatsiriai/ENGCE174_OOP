package Lab7;

public class car extends vehicle {
	/**
	 * Start move car 
	 */
	public car() {
		System.out.println(" | car start ! |");
	}//end method

	/**
	 * Just moving a car 
	 * @param name user input speed for car and kilometer/hour
	 */

	public void move(int speed , float km) {
		System.out.println(" My Driver , drive at speed "+ speed  + " km/hr form home " + km + " kilometer");
	}//end method
}//end class
