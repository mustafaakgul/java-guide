
public class circle {
	private double r ;
	
	public void setr(double c){
		this.r=c;
	}
	public double getr(){
		return r;
	}
	public double aream(){
		return 3.14*r*r;
	}
	public double circumference(){
		return 2*3.14*r; //Math.PI  is possible to use
	}
	public static void main(String[] args){
		circle x = new circle();
		System.out.println(x.getr());
		System.out.println(x.aream());
		x.setr(5);
		System.out.println(x.getr());
		System.out.println(x.aream());
		System.out.println(x.circumference());
	}

}
