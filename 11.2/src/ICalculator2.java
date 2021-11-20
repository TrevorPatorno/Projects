import java.util.Scanner;

public class ICalculator2{
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Value for currentValue: ");
	int currentValue = input.nextInt();
	
	add(currentValue);
	sub(currentValue);
	mul(currentValue);
	div(currentValue);
	negate(currentValue);
	
	System.out.print("New Value: " + negate(currentValue));
	}
	static Scanner input = new Scanner(System.in);

	public static void add(int x){
		System.out.print("Enter Value to Add to currentValue: ");
		int addSolution = x + input.nextInt();
		System.out.print("Solution is " + addSolution);

	}
	public static void sub(int x){
		System.out.println();
		System.out.println("Enter Value to Subtract to currentValue: ");
		int subSolution = x - input.nextInt();
		System.out.println("Solution is " + subSolution);

	}
	public static void mul(int x){
		System.out.println();
		System.out.println("Enter Value to Multiply to currentValue: ");
		int mulSolution = x * input.nextInt();
		System.out.println("Solution is " + mulSolution);

	}
	public static void div(int x){
		System.out.println();
		System.out.println("Enter Value to Divide to currentValue: ");
		int divSolution = x / input.nextInt();
		System.out.println("Solution is " + divSolution);

	}
	public static int negate(int currentValue){
		return currentValue * -1;

	}
}


