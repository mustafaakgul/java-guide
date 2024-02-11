import java.util.Scanner;


public class S1 {
	public static void main(String[] args) {
		System.out.println("lütfen bir mesaj giriniz ve sayisini girin");
		Scanner input = new Scanner (System.in);
		String   x   =input.nextLine();
		int   y=input.nextInt();
		yaz(x,y);
	}
public static void yaz(String a ,int b){
	if(b==1)
		System.out.println(a);
	else
	{
		System.out.println(a);
		yaz(a,b-1);
	}
}
}
