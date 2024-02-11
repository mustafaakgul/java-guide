
import java.util.Scanner;
public class S5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] dizi = new int [10];
		System.out.println("elemanları girin:");
		for(int i=0;i<dizi.length;i++){
		 dizi[i] = input.nextInt();
		}
		bulMax(x);
	}
	public static int bulMax(int n){
		int enBuyuk=dizi[0];
		  for(int n=1; n < dizi.length;n++){
		      if(dizi[n]> enBuyuk )
		          enBuyuk=dizi[n];
		  }
		      return n;
	

}
}
