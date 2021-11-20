import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int int1 = input.nextInt();
		int factor = 2;
		
		stackOfIntegers stack = new stackOfIntegers(20);
		
		while (factor <= int1) {
			if (int1 % factor == 0) {
				stack.push(factor);
				int1 /= factor;
			}
			else {
				factor++;
			}
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
