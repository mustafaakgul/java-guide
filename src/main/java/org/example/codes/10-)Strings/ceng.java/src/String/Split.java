package String;

public class Split {
public static void main(String[] args) {
	

	String s="Java#HTML#Perl";
    String[] parcalar=s.split("#");
	for (int i = 0; i < parcalar.length; i++) 
		System.out.println(parcalar[i] );
}
}
