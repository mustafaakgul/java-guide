package org.example.codes.g06_strings.String;

public class Test4 {
	

	
		
		private String str;
		
		public Test4 (){
			
		}
		public Test4 (String str){
			this.str=str;
		}
		public int yazUnlu(){
			char [] y={'a','e','ı','i','o','ö','u','ü'};
			int counter=0;
			for(int i=0;i<str.length();i++){
				for(int j=0;j<y.length;j++){
					if(str.charAt(i)==y[j])
						counter++;
				  }
				}
			return counter;
		}
		public int yazUnsuz(){
			char [] y={'b','c','d','f','g','h','j','k','l','m','n','p','r','s','t','v','y','z','x','w'};
			int counter=0;
			for(int i=0;i<str.length();i++){
				for(int j=0;j<y.length;j++){
					if(str.charAt(i)==y[j])
						counter++;
				  }
				}
			return counter;
		}
		public int yazNokta(){
			char [] y={'.',';',',','!','^','#','+','$','%','&','/','{'};
			int counter=0;
			for(int i=0;i<str.length();i++){
				for(int j=0;j<y.length;j++){
					if(str.charAt(i)==y[j])
						counter++;
				  }
				}
			return counter;
		}
		public int yazSayi(){
			/*char [] y={'1','2','3','4','5','6','7','8','9','0'};*/
			int counter=0;
			boolean isdigit=true;
			String[] kelimeler=str.split(" ");
			System.out.println("saisi"+kelimeler.length);
			for(int i=0;i<kelimeler.length;i++){
				isdigit=true;//farklı yere koy
				for(int j=0;j<kelimeler[i].length();j++){
					if(!Character.isDigit(kelimeler[i].charAt(j)))
						isdigit=false;
				  }
				if(isdigit==true)
					counter++;
				}
			
		
			return counter;
		}
		public int yazkelime(String s){	
			int counter=0;
			String[] kelimeler=s.split(" ");
			for(int i=0;i<kelimeler.length;i++){			
					if(kelimeler[i].contains("van")){
						counter++;
				  }
				}
			return counter;
		}
		public static void main(String[] args) {
			String x="ali 20 abb123 14  fef45";
			String x1="vanftr   vanarer adas  asdasdvan   arwrqwr rwqtyey";
			Test4 a = new Test4(x);
			System.out.println(a.yazUnlu());
			System.out.println(a.yazUnsuz());
			System.out.println(a.yazNokta());
			System.out.println(a.yazSayi());
	        System.out.println(a.yazkelime(x1));
		}

	}



