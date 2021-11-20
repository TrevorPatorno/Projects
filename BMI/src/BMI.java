//Trevor Patorno BMI Calculator W0714742
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		double BMI, weight, height;
		final double kilograms_per_pound, meters_per_inch;
		
		System.out.print("Enter height (in inches):");
		height = input.nextDouble();
		
		System.out.print("Enter weight (in pounds):");
		weight = input.nextDouble();

		kilograms_per_pound = 0.45359237;
		meters_per_inch = 0.0254;	
		
		double weightinKg = weight * kilograms_per_pound;
		double heightinM = height * meters_per_inch;
		
		BMI = weightinKg / (heightinM * heightinM);
		
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if (BMI < 25){
			System.out.print("Normal");
		}
		else if (BMI < 30) {
			System.out.print("Overweight");
		}
		else {
			System.out.print("Obese");
		}
	}
}
