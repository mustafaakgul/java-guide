import java.util.Scanner;


public class E5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen,cümle giriniz:");
		String  x =input.nextLine();
		System.out.println("sayi giriniz");
		int y =input.nextInt();
		yazi(x,y);
	}
	public static void yazi(String n,int a){
		if(a==1)
			System.out.println(n);
		else{
			 System.out.println(n);
			 yazi(n,a-1);
		}
	}

}
