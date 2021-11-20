public class MyPoint {
	double x, y;
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	public MyPoint() {
		this(0, 0);
		
	}
	public double getX() {
		return x;
		
	}
	public void setX(double x) {
		this.x = x;
		
	}
	public double getY() {
		return y;
		
	}
	public void setY(double y) {
		this.y = y;
		
	}
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		
	}
	public double distance(MyPoint point) {
		return distance(point.x, point.y);
		
	}
	public MyPoint getCenterPoint(MyPoint p) {
		return new MyPoint((p.x + this.x)/ 2, (p.y + this.y) / 2);
		
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
