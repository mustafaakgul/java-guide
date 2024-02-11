
public class UsingBoundedTypes {
	public static void main(String[] args) {
		BoundedTypesEx2<Integer, String> triangle=new BoundedTypesEx2<Integer, String>(1, 2, 3, "unequal triangle");
		System.out.println(triangle.getName());
		System.out.println(triangle.circumference());
	}

}
