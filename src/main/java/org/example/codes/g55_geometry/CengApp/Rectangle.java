package CengApp;

public class Rectangle {
	private Point p;
	private int width;
	private int height;

	public Rectangle(){
	}
	public Rectangle(Point a,int w,int l){
		p=a;
		width=w;
		height=l;
	}
	public void setRectangle(Point a,int w,int l){
		p=a;
		width=w;
		height=l;
	}
	public void setPoint(Point a){
		p=a;
	}
	public void setWidth(int w){
		width=w;
	}
	public void setheight(int l){
		height=l;
	}
	public Point getPoint(){
		return p;
	}
	public int getWidth(){
		return width;
	}
	public int getheight(){
		return height;
	}
	public boolean isOnLeft(Rectangle r){
		boolean left=false;
		if(p.isEqual(r.getPoint()))
			System.out.println("İki rectangle aynı yerde .");
		else{
			if(p.isEqual(r.getPoint()))
				left=true;
			System.out.println(toString()+" is on the "+(left?"left":"right")+" of "+r.toString());
		}
		return left;
	}
	public String toString(){
		return "Rectangle located in "+p.toString()+" has width "+width+" and height "+height;
	}
	public void printRectangle(){
		System.out.println(toString());
	}
	public static void main(String[] args) {

		Rectangle r=new Rectangle(new Point(2,3),10,20);
		r.printRectangle();
		Rectangle r1=new Rectangle(new Point(5,3),2,3);
		r1.printRectangle();
		r.isOnLeft(r1);
		
	}
}