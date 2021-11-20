// Trevor Patorno   W0714742   03-05-21
package LEquations;
import java.util.Scanner;

public class LinearEquation {	
	private double a, b, c, d, e, f;

	public LinearEquation(double a, double b, double c, double d, double e, double f){

		System.out.println("Enter Six Values: ");

		System.out.print("Value for A: ");
		this.a = getA();

		System.out.print("Value for B: ");
		this.b = getB();

		System.out.print("Value for C: ");
		this.c = getC();

		System.out.print("Value for D: ");
		this.d = getD();

		System.out.print("Value for E: ");
		this.e = getE();

		System.out.print("Value for F: ");
		this.f = getF();
	}
	Scanner input = new Scanner(System.in);

	public double getA() {
		a = input.nextDouble();
		return a;
	}

	public double getB() {
		b = input.nextDouble();
		return b;
	}

	public double getC() {
		c = input.nextDouble();
		return c;
	}

	public double getD() {
		d = input.nextDouble();
		return d;
	}

	public double getE() {
		e = input.nextDouble();
		return e;
	}

	public double getF() {
		f = input.nextDouble();
		return f;
	}

	public boolean isSolvable() {
		if (a * d - b * c == 0) {
			System.out.print("The denominator is 0. Therefore, the equation has no solution.");
			return false;
		}
		else
			return true;
	}

	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}


