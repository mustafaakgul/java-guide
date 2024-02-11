package CengApp;

public class Nokta {
	private double x;
	private double y;
	public Nokta(){
		x=0;
		y=0;
	}
	public Nokta(double a, double b){
		x=a;
		y=b;
	}
	public void setNokta(double c, double d){
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
	public void yazNokta(){
		System.out.println("("+x+","+y+")");
	}
	public double uzaklik(){
		return Math.sqrt(x*x+y*y);
	}
	public boolean esitmi(Nokta n){
		if(this.x==n.x && this.y==n.y)
			return true;
		else
			return false;
	}

public static void main(String[] args){
	Nokta n1=new Nokta(3,4);
	Nokta n2;
	n2=new Nokta(4,5);
	
}
}