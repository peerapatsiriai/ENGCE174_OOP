package lab4;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList; // import the ArrayList class
public class MyArray {
	
	int MyArray[] = new int[10];
	int n = MyArray.length;
	
	public void arrayConfigure () {
		Random rand = new Random();
		for(int i = 0; i < n; i++) {
			int int_random = rand.nextInt(13); 
			MyArray[i] = int_random;
		}
	}
	
	public void displayArray() {
		System.out.print("Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(" " +MyArray[i]);
		}
		System.out.print("\n");
	}
	
	public void FineMax() {
		int max = Arrays.stream(MyArray).max().getAsInt();
		System.out.println("Max: " + max);
	}
	
	public void FineMin() {
		int min = Arrays.stream(MyArray).min().getAsInt();
		System.out.println("Min: " + min);
	}
	
}

class MyCurrentArray extends MyArray {
	
	public void Sort() {
		Arrays.sort(MyArray);
		System.out.print("Sort: ");
		for(int i = 0; i < n; i++) {
			System.out.print(" " +MyArray[i]);
		}
		System.out.print("\n");
	}
	
	public void Fine() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Fine Number: ");
		int number = keyboard.nextInt();
		boolean check = true;
		for(int i = 0; i < n; i++) {
			if(number == MyArray[i]) {
				System.out.println(number + " Have In Array");
				check = false;
				break;
			} 
		}
		if(check) {
			System.out.println(number + " Not In Array");
		}
	}
	
}