package String;

public class Concat {
	public static void main(String[] args) {
		
	

    String a=" Merhaba ";
	String b="Mine";
	String c = a.concat(b);    //String c = a + b;
    //System.out.println(c);   // Merhaba Mine
	System.out.println(((a.concat(b)).concat(c)));//a+b+c// 

}
}