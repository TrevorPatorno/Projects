import java.util.Scanner;

public class TestMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Type in three integers:");
		int c = input.nextInt();
		int g = input.nextInt();
		int t = input.nextInt();

		int f = max(c , g, t);
		System.out.println("The max of " + c + ", " + g + ", and " + t + " is " + f);
	}

	public static int max(int c, int g, int t) {
		int result = 0;

		if (c >= g && c >= t) {
			result = c;
		}
		else if (g >= c && g >= t) {
			result = g;
		}
		else if (t >= c && t >= g) {
			result = t;
		}
		return result;
	}
}
