/* Trevor Patorno   4/7/2021   CMPS 280
 * The objects are designated a color, told if it is filled with something (true if true, false if false), 
 * told what is inside the object (what it's filled with), the volume of the object / how much is in the object
 */
public class Main {

	public static void main(String[] args) {

		Container cup = new cup("plastic", "green", true, "soda", 250);
		cup.toString(cup);

		Container bag = new bag("paper", "blue", true, "groceries", 10);
		bag.toString(bag);

		Container bottle = new bottle("glass", "translucent", true, "air", 250);
		bottle.toString(bottle);

		Container box = new box("cardboard", "brown", false, "moving objects", 1);
		box.toString(box);

	}
}


