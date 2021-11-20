import java.util.Scanner;

public class tritonacciSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* Tritonacci Sequence: 0 1 1 2 4 7 13 24...
		 * Sequence Indexes:    0 1 2 3 4 5 6  7 ...
		 * What is the number of the sequence at index N? */
		System.out.print("Enter the index: ");
		int index = input.nextInt();

		System.out.print("\nSolution through Recursion: ");
		System.out.printf("At index %d, the output = %d", index, recursionTritonacci(index));
		System.out.println(" ");

		System.out.print("Solution through Iteration: ");
		System.out.printf("At index %d, the output = %d\n\n", index, iterativeTritonacci(index));

		System.out.println("CHECK W/ TRITONACCI SEQUENCE BELOW (format: [index]: [output])\n");

		System.out.println("Tritonacci Sequence to the 15th index: ");

		for (int i = 0; i < 16; i++) {
			if (i == 15) {
				System.out.print(i + ": " + tritonacci(i));
			}
			else {
				System.out.print(i + ": " + tritonacci(i) + ", ");
			}
		}
	}

	public static long recursionTritonacci(int index) {
		/* BASE CASE, ALWAYS! */
		if (index == 0) {
			return 0;
		}
		else if (index == 1) {
			return 1;
		}
		else if (index == 2) {
			return 1;
		}
		return recursionTritonacci(index - 1) + recursionTritonacci(index - 2) + recursionTritonacci(index - 3);

	}
	public static long iterativeTritonacci(int index) {
		long past = 0, past1 = 0, now = 1;
		if (index < 0) {
			System.out.println("Error: Please enter an index greater than or equal to 1");
		}
		else if (index <= 0) {
			return 0;
		}
		else if (index == 1 || index == 2) {
			return 1;
		}
		for (int i = 1; i < index; i++) {
			long output = past + past1 + now;
			past = past1; 
			past1 = now;
			now = output;
		}
		return now;

	}
	public static long tritonacci(int index) {
		if (index == 0) {
			return 0;
		}
		else if (index == 1 || index == 2) {
			return 1;
		}
		return tritonacci(index - 1) + tritonacci(index - 2) + tritonacci(index - 3);
	}
}








