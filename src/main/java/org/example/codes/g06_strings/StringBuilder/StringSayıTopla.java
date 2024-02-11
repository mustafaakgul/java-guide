package org.example.codes.g06_strings.StringBuilder;
import java.util.Scanner;

	
	

	public class StringSayıTopla {
		public static boolean sayiMi(String s){
			boolean b=true;
			for (int i = 0; i < s.length(); i++) {
				if(!Character.isDigit(s.charAt(i))){
					b=false;
				}
			}
			return b;
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			// cümle parçala
			System.out.print("Bir cümle girin: ");
			String x=s.nextLine();
			String [] y=x.split(" ");
			
			//Bir stringdeki sayıların sayı değerlerini topla (rakam değil)
			int toplam=0;
			for (int i = 0; i < y.length; i++) {
				if(sayiMi(y[i]))
					toplam+=Integer.parseInt(y[i]);
			}
			System.out.println("Toplam="+toplam);
		}
	}


