// Trevor Patorno	W0714742	CMPS 161-04 
import java.util.Scanner;

public class CityState {
	public static void main(String[] args) {
		Scanner city = new Scanner(System.in);
		
		System.out.println("Enter 5 cities and their respected states. Ex: Slidell, LA");
		
		for (int x = 1; x <= 5;) {
			
			System.out.print("City " + x + ": ");
			String c = city.nextLine();	
			
			x++;
		}
	}

	public static boolean checkString(String c) { 
		boolean result = false;
		Scanner city = new Scanner(System.in);
		c = city.nextLine();
		
		if (c.charAt(c.length() - 4) == ',' && c.charAt(c.length() - 3) == ' ') {
			result = true;
		}
		if (result = false) {
			System.out.print("ERROR! Please Re-enter");
		}
		return result;
		
		
		
	}
		

			
			
	
		public static boolean sameState(String c1, String c2) {
			boolean result = false;
			Scanner input = new Scanner(System.in);
			String city = input.nextLine();
			String state = input.nextLine();
			
			if (state == state) {
				result = true;
			}
			while (result == true) {
				System.out.print(c2 + ":" + c1 + ", " );
			}
			return result;
			
			
		}

	}


