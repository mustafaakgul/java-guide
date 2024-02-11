
public class BoundedTypesEx2 <T extends Number,V> {
	private T edge1;
	private T edge2;
	private T edge3;
	private V triangle;

	public BoundedTypesEx2(T edge1,T edge2,T edge3,V triangle){
		this.edge1=edge1;
		this.edge2=edge2;
		this.edge3=edge3;
		this.triangle=triangle;
	}
	public Number circumference(){
		return edge1.doubleValue() + edge2.doubleValue() + edge3.doubleValue();
	}
	public String getName(){
		return triangle.toString();
	}
 
}
