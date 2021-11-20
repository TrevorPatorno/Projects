// Trevor Patorno   W0714742   2-14-2021
package Matrices;
public class Main {
	public static void main(String[] args) {

		double[][] table = {{1, 2}, {2, 3}};
		MyMatrix A = new MyMatrix(table, 2);
		A.printMe(table);
		System.out.println("");
		System.out.println("The Determinant of Matrix A is " + A.getDeterminant());

		double[][] table3x3 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
		MyMatrix B = new MyMatrix(table3x3, 3);
		B.printMe(table3x3);
		System.out.println("");
		System.out.println("The Determinant of Matrix B is " + B.getDeterminant());
	}
}

