public class solid extends Container{

	solid(String m, String c, boolean f, String o, int v){
		super(m, c, f, o, v);

	}
	public void toString(Container t) {
		String fill = "N/A";

		if (t.filled) {
			fill = "filled";

			System.out.println("Container's Material: " + material);
			System.out.println("Container's Color: " + color);
			System.out.println("Container is " + fill);
			System.out.println("Container contains " + volume + " cubic foot of " + object);

		}
		else {
			fill = "not filled";

			System.out.println("Container's Material: " + material);
			System.out.println("Container's Color: " + color);
			System.out.println("However, the Container is " + fill);
			System.out.println("Container's Potential Volume: " + volume + " cubic foot of space");

		}
		System.out.println("");

	}
}
