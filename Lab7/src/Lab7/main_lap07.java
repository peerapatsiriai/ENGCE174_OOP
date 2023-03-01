package Lab7;

public class main_lap07 {
	public class main {
		public static void main (String[] args) {
			vehicle vehicle = new vehicle();
			vehicle.move();
			vehicle.move("Peerapat");
			
			car car = new car();
			car.move(90, 50);
			supercar supercar = new supercar();
			supercar.move();
			
			motobike motobike = new motobike();
			motobike.move("honda", 150);
			
			ballon balloon = new ballon();
			balloon.move();
			
			drone drone = new drone();
			drone.move(120);;
			
		}
	}

}
