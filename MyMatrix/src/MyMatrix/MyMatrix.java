// Trevor Patorno   W0714742   2-14-2021
package MyMatrix;

class MyMatrix {
	
	double determinant = 0.0;
	MyMatrix(double[][] table, int size){

		if (table.length == 2) {
			determinant = (table[0][0] * table[1][1]) - (table[1][0] * table[0][1]);
		}
		else if (table.length == 3) {
			determinant = (table[0][0] * table[1][1] * table[2][2] - table[1][2] * table[2][1]) - 
					(table[0][1] * table[1][0] * table[2][2] - table[1][2] * table[2][0]) +
					(table[0][2] * table[1][0] * table[2][1] - table[1][1] * table[2][0]);
		}
	}
	public double getDeterminant() {
		return determinant;
	}
	public void printMe(double[][] table) {

		for (int i = 0; i < table.length; i++) {
			String image = "";

			for (int i2 = 0; i2 < table[i].length; i2++) {
				image += image + " " + table[i][i2];
			}
			System.out.print(image);
		}
	}

}