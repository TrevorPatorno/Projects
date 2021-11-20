public class Main {
	public static void main(String[] args) {
		
		MyInteger int1 = new MyInteger(7);
		MyInteger int2 = new MyInteger(7);
		MyInteger int3 = new MyInteger(25);
		
		System.out.printf("Integer 1 = %d isPrime: %b isOdd: %b isEven %b\n", 
				int1.getNumber(), int1.isPrime(), int1.isOdd(), int1.isEven());
		System.out.printf("Integer 2 = %d isPrime: %b isOdd: %b isEven %b\n", 
				int2.getNumber(), int2.isPrime(), int2.isOdd(), int2.isEven());
		System.out.printf("Integer 3 = %d isPrime: %b isOdd: %b isEven %b\n", 
				int3.getNumber(), int3.isPrime(), int3.isOdd(), int3.isEven());

	}

}
