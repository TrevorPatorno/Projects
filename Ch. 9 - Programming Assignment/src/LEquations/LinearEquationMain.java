package LEquations;

public class LinearEquationMain {
		public static void main(String[] args) {
			double a, b, c, d, e, f;
			a = 0; b = 0; c = 0; d = 0; e = 0; f= 0;

			LinearEquation LE = new LinearEquation( a, b, c, d, e, f);
			
			if (LE.isSolvable()) {
				System.out.println("X = " + LE.getX());
				System.out.println("Y = " + LE.getY());

			}
		}
	}


