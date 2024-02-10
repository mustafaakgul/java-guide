package String;

public class First {

	public static void main(String[] args) {
		
		String s = "Hosgeldiniz";
		System.out.println(s);
		s="hobb";
		System.out.println(s);
		String s1 = "Hosgeldiniz";
		String s2="Hosgeldiniz";
		String s3=new String("Hosgeldiniz");
		if(s1==s3)
			System.out.println("True");
		else
			System.out.println("False");
		if(s1.equals(s2))
			System.out.println("True");
		System.out.println(s1.concat(s2));
		String s4 ="aldeshlerlslegepal";
		s4.indexOf('l');
		System.out.println(s4);
		String s5="Welcome to Java";
		System.out.println(s5.indexOf('W'));
		

	}

}
