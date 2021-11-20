public class Main {
	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		
		System.out.println("Distance from the two points: " + p1.distance(p2));
	}

}
