import java.util.Scanner;


public class S3 {
	public static void main(String[] args) {
		System.out.println("iki sayi giriniz ilk kucuk sayi girin");
		Scanner input = new Scanner (System.in);
		int   x    =input.nextInt();
		int   y    =input.nextInt();
		System.out.println(bol(x,y));
	}
	public static int bol(int a,int b){
		while(a%5!=0){
			a=a+1;
			
		}
		while(b%5!=0)
			b--;
		if((b==a)){
				return b;     
						}
				else{
					return  (a)+bol(a+5,b);
							}
							
		
	}

}
