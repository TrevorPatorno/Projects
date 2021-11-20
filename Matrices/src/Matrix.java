// Trevor Patorno   W0714742   2-14-2021
public class Matrix {
	public static void main(String[] args) {
		double[][] table = {{1, 2},
							{2, 3}};
		
		MyMatrix a = new MyMatrix(table, 2);
		a.printMe();
		System.out.prtintln("Determinant of matrix a is " + a.getDeterminant());
		
		MyMatrix b = new MyMatrix(table3x3, 3);
		b.printMe();
		System.out.println("Determinant of matrix b is " + b.getDeterminant());
		
		
	

	}
}

	
	
	
	
	

