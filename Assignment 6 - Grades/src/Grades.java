import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner grades = new Scanner(System.in);

		System.out.println("Enter the 7 Grades: ");

		double[] grade = new double[7];

		System.out.print("Grade 1: ");
		grade[0] = grades.nextInt();

		System.out.print("Grade 2: ");
		grade[1] = grades.nextInt();

		System.out.print("Grade 3: ");
		grade[2] = grades.nextInt();

		System.out.print("Grade 4: ");
		grade[3] = grades.nextInt();

		System.out.print("Grade 5: ");
		grade[4] = grades.nextInt();

		System.out.print("Grade 6: ");
		grade[5] = grades.nextInt();

		System.out.print("Grade 7: ");
		grade[6] = grades.nextInt();

		System.out.println("Grades: " + grade[0] + ", " + grade[1] + ", " + grade[2] + ", " + grade[3] + ", " + grade[4] + ", " + grade[5] + ", " + grade[6]);

		//This prints the average.

		double average;

		average = (grade[0] + grade[1] + grade[2] + grade[3] + grade[4] + grade[5] + grade[6]) / 7;

		System.out.println("Average: " + average);

		//This is for the Highest and Lowest Grades
		double x, y, z, a, b, c, d, highest;

		x = Math.max(grade[0], grade[1]);

		y = Math.max(grade[2], grade[3]);

		a = Math.max(x, y);

		b = Math.max(grade[4], grade[5]);

		c = grade[6];

		d = Math.max(b, c);

		highest = Math.max(a, d);

		System.out.print("Highest: " + highest);

		double l, m, n, o, p, q, lowest;

		l = Math.min(grade[0], grade[1]);

		m = Math.min(grade[2], grade[3]);

		n = Math.min(l, m);

		o = Math.min(grade[4], grade[5]);

		p = grade[6];

		q = Math.min(o, p);

		lowest = Math.min(n, q);

		System.out.println(" Lowest: " + lowest);

		lowest = grade[0];
		highest = grade[6];

		for (int i = 0; i < grade.length; i++) {

			if (grade[i] == 100) {

				System.out.println("PERFECT SCORE");
			}
		} 
		sort(grade); 

		System.out.print("Median: " + grade[3]);
	}

	public static void sort (double [] grade){
		double temp;

		for (int i = 0; i < grade.length-1; i++) {

			if (grade[i] > grade[i+1]) {
				temp = grade[i];
				grade[i] = grade[i+1];
				grade[i+1] = temp;
				i=-1;
			}
		}
	}
}



			
			
				
				
			
		


