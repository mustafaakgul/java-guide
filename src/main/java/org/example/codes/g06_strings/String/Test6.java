package org.example.codes.g06_strings.String;
import java.util.Scanner;
public class Test6 {
	


	
		
	private String str;
		
		public Test6 (){
			
		}
		public Test6 (String str){
			this.str=str;
		}
		public void yazkarakter(){
			Scanner input=new Scanner (System.in);
			StringBuilder s = new StringBuilder();
			System.out.println("Bir cumler giriniz");
			String cumle=input.nextLine();
			for(int i=0;i<cumle.length();i++){
				if(!Character.isDigit(cumle.charAt(i))){
					s.append(cumle.charAt(i));
				}
			}
		}
		public int yazsayi(){					
				int counter=0;
				boolean isdigit=true;
				String[] kelimeler=str.split(" ");
				System.out.println("sayisi: "+kelimeler.length);
				for(int i=0;i<kelimeler.length;i++){
					isdigit=true;
					for(int j=0;j<kelimeler[i].length();j++){
						if(!Character.isDigit(kelimeler[i].charAt(j)))
							isdigit=false;
					  }
					if(isdigit==true)
						counter++;
					}
				
			
				return counter;
			}
		public static void main(String[] args) {
			
		}

	


}
