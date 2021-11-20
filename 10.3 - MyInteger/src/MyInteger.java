public class MyInteger {
	private int number;
	
	public MyInteger(int number) {
		this.number = number;
		
	}
	public int getNumber() {
		return number;
		
	}
	public void setNumber(int number) {
		this.number = number;
		
	}
	public boolean isEven() {
		return number % 2 == 0;
		
	}
	public boolean isOdd() {
		return !isEven();
		
	}
	public boolean isPrime() {
		double range = Math.sqrt(number);
		
		for (int i = 2; i < range; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int number) {
		return number % 2 == 0;
		
	}
	public static boolean isOdd(int number) {
		return !isEven(number);
		
	}
	public static boolean isPrime(int number) {
		double range = Math.sqrt(number);
		
		for (int i = 2; i < range; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
		
	}
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isPrime();
		
	}
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
		
	}
	public boolean equals(int number) {
		return this.number == number;
		
	}
	public boolean equals(MyInteger myInteger) {
		return this.number == myInteger.number;
		
	}
	public static int convertInt(char[] number) {
		double numberDouble = 0;
		int toPower = number.length - 1;
		for (char aNumber : number) {
			numberDouble += Math.pow(10, toPower--) * (aNumber - '0');
		}
		return (int)numberDouble;
		
	}
	public static int convertInt(String number) {
		return MyInteger.convertInt(number.toCharArray());
	}
	
}
