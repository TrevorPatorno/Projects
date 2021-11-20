// Volume of gas set to 0 due to the difficult way of measuring gases
public abstract class gas extends Container {

	gas(String m, String c, boolean f, String o, int v){
		super(m, c, f, o, v);

	}
	public void toString(Container t) {
		String fill = "N/A";

		if (t.filled) {
			fill = "filled";

			System.out.println("Container's Material: " + material);
			System.out.println("Container's Color: " + color);
			System.out.println("Container is " + fill + " and holds " + object + ". The volume of the gas is N/A");
			System.out.println("Container's Potential Volume: " + volume + " mL of volume");

		}
		else {
			fill = "not filled";
			System.out.println("Container is made of " + material + " and is " + color);
			System.out.println("However, the Container is " + fill);

		}
		System.out.println("");

	}
}
