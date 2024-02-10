package String;
import java.util.Scanner;
public class Test2 {
		
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Bir String girin: ");
			String a=input.nextLine();
			a=a.replaceAll(" ","/");
	       System.out.println(" "+a);
		

	}


}
