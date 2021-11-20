public abstract class Container {
	String material; String color; boolean filled; String object; int volume;

	Container(String m, String c, boolean f, String o, int v){
		this.material = m;
		this.color = c;
		this.filled = f;
		this.object = o;
		this.volume = v;

	}
	public abstract void toString(Container t);

}
