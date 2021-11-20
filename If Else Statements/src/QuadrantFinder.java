import java.util.Scanner;

public class QuadrantFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
			System.out.print( "Input x-value:");
		int x = input.nextInt();
			System.out.print( "Input y-value:");
		int y = input.nextInt();
			
		if ( x > 0 && y > 0 ) {
			System.out.print( "Quadrant 1" );
		}
		else if ( x < 0 && y > 0 ) {
			System.out.print( "Quadrant 2" );
		}
		else if ( x < 0 && y < 0 ) {
			System.out.print( "Quadrant 3" );
		}
		else if ( x > 0 && y < 0 ) {
			System.out.print( "Quadrant 4" );
		}
			input.close();
	}
}


