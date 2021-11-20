import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		//Enter Values
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);

		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
	
		ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (!temp.contains(list.get(i))) {
                temp.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(temp);

		}
	
}