package String;

public class Compare {
	public static void main(String[] args) {
		String s1 = new String("Hoşgeldiniz");
		String s2 = "Hoşgeldinis";
		
	  if (s1.compareTo(s2) > 0) {  
	    System.out.println(" s1 s2’den daha büyük ");
	  }
	  else if (s1.compareTo(s2) == 0) { 
		  System.out.println(" s1 ve s2 aynı içeriğe sahip ");
	  }
	  else 
		  System.out.println("s1 s2’den daha küçük ");
	}}  // s1 s2’den daha büyük
