public abstract class liquid extends Container{

	liquid(String m, String c, boolean f, String o, int v){
		super(m, c, f, o, v);

	}
	public void toString(Container t) {
		String fill = "N/A";

		if (t.filled) {
			fill = "filled";

			System.out.println("Container's Material: " + material);
			System.out.println("Container's Color: " + color);
			System.out.println("Container is " + fill);
			System.out.println("Container contains " + volume + " mL of soda");

		}
		else{
			fill = "not filled";
			System.out.println("The Container is made of " + material + " and the color is " + color);
			System.out.println("However, the Container is empty");

		}
		System.out.println("");

	}
}
