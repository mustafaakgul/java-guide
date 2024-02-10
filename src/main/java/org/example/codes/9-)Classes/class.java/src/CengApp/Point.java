package CengApp;

public class Point {
	private double x;
	private double y;
	public Point(){
		x=0;
		y=0;
	}
	public Point(double a, double b){
		x=a;
		y=b;
	}
	public void setPoint(double c, double d){
		x=c;
		y=d;
	}
	public void setX(double a){
		x=a;
	}
	public void setY(double b){
		y=b;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double distance2P(Point a){
			return Math.sqrt(Math.pow((this.x-a.x),2)+Math.pow((this.y-a.y),2));
	}
	public double distance(){
			return Math.sqrt(x*x+y*y);
	}
	public boolean isEqual(Point n){
		if(this.x==n.x && this.y==n.y)
			return true;
		else 
			return false;
	}
	public void printPoint(){
		System.out.println("("+x+","+y+")");
	}
}