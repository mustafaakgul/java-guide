
class Multiplication {
	
	static <T extends Number> double multiply(T value,T factor){
		return value.doubleValue()*factor.doubleValue();
	}

}
/*public class GenericMethod{
	public static void main(String[] args) {
		System.out.println(Multiplication.multiply(2, 3));
		System.out.println(Multiplication.multiply(1L,5F));
		System.out.println(Multiplication.multiply(2D, 3D));
		System.out.println(Multiplication.multiply(2L,3D));
	}
}
*/