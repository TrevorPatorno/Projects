// Trevor Patorno   W0714742   2-07-2021
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array_change = 0;
		
		double[] myList = new double[10];
		
		System.out.println("Enter 1 for a User-Input Array or Enter 2 for a Random-Input Array ");
		
		int x = input.nextInt();
		
		if (x == 1) {
			arrayInput(myList);
		}
		if (x == 2) {
			arrayRandom(myList);
		}
		
		while (array_change <= 8) {
			
		System.out.println(" ");
		System.out.println("Enter 1 to Display Arrays ");
		System.out.println("Enter 2 to Sum All Elements ");
		System.out.println("Enter 3 to Find the Largest Element ");
		System.out.println("Enter 4 to Find the Smallest Index of the Largest Element ");
		System.out.println("Enter 5 to Randomly Shuffle ");
		System.out.println("Enter 6 to Shift Elements ");
		System.out.println("Enter 7 to Exit ");
		
		array_change = input.nextInt();
			
		switch(array_change) {
		
		case 1:
			System.out.println("Current Array: " + myList[0] + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + myList[8] + ", " + myList[9]);
			displayArray(myList);
			System.out.println("New Array: " + myList[0] + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + myList[8] + ", " + myList[9]);	
			break;
			
		case 2:
			System.out.print(sumAll(myList));
			break;
			
		case 3:
			System.out.print(largestElement(myList));
			break;
			
		case 4:
			System.out.print(smallestIndex(myList));
			break;
			
		case 5:
			System.out.println("Current Array: " + myList[0] + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + myList[8] + ", " + myList[9]);
			randomShuffle(myList);
			System.out.println("New Array: " + myList[0] + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + myList[8] + ", " + myList[9]);
			break;
			
		case 6:
			System.out.println("Current Array: " + myList[0] + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + myList[8] + ", " + myList[9]);
			shiftElement(myList);
			System.out.println("New Array: " + myList[0] + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + myList[8] + ", " + myList[9]);
			break;
			
		case 7:
			array_change = 10;
			break;
		}
			
		}
	
	
	}
	public static void arrayInput(double[] myList) {
		java.util.Scanner input2 = new java.util.Scanner(System.in);
		
		System.out.print("Enter " + myList.length + " values: ");
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input2.nextDouble();
		}
	}
	public static void arrayRandom(double[] myList) {
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = Math.random() * 100;
		}
	}
	public static void displayArray(double[] myList) {
		
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
	}
	public static double sumAll(double[] myList) {
		double total = 0;
		
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		return total;
	}
	public static double largestElement(double[] myList) {
		double max = myList[0];
		
		for (int i = 1; i < myList.length; i++) {
			
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		return max;
	}
	public static double smallestIndex(double[] myList) {
		double max = myList[0];
		int indexOfMax = 0;
		
		for (int i = 1; i < myList.length; i++) {
			
			if (myList[i] > max) {
				max = myList[i];
				indexOfMax = i;
			}
		}
		return indexOfMax;
	}
	public static void randomShuffle(double[] myList) {
		
		for (int i = 0; i < myList.length - 1; i++) {
			int j = (int)(Math.random() * myList.length);
			double temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}
	}
	public static void shiftElement(double[] myList) {
		double temp = myList[0];
		
		for (int i = 1; i < myList.length; i++) {
			myList[i - 1] = myList[i];
		}
		myList[myList.length - 1] = temp;
	}
}


	



