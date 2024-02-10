package StringBuilder;

public class First {

	public static void main(String[] args) {
		String s1="Welcome to Java";
		StringBuilder s2=new StringBuilder(s1);
		s2.append('d');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.insert(11,"html"));
		System.out.println(s2.delete(8, 11));
		System.out.println(s2.substring(5));
	}
}
