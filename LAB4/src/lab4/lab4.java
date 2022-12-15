package lab4;
import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {
		// Lab 4.1
		System.out.println("Lab 4.1");
		MyArray MyobjOne = new MyArray();
		MyobjOne.arrayConfigure();
		MyobjOne.displayArray();
		MyobjOne.FineMax();
		MyobjOne.FineMin();
		
		System.out.println("\nLab 4.2");
		// Lab 4.2
		MyCurrentArray MyobjTwo = new MyCurrentArray();
		MyobjTwo.arrayConfigure();
		MyobjTwo.displayArray();
		MyobjTwo.FineMax();
		MyobjTwo.FineMin();
		MyobjTwo.Sort();
		MyobjTwo.Fine();
	}
}
