package org.example.codes.g06_strings.Character;

public class KelimeSay {
	
	
		public static String temizle(String s){
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
			      if (Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i)==' ') {
			          sb.append(s.charAt(i));    //sayı, harf veya boşluk ise ekle
			        }
			}
			return sb.toString();
		}
		public static void main(String[] args) {
			String x="Orda bir köy var uzakta. O köy bizim köyümüzdür. Gezmesek de " +
					"tozmasak da. O köy bizim köyümüzdür. Orda bir ev var uzakta. O ev " +
					"bizim evimizdir. Yatmasak da kalkmasak da. O ev bizim evimizdir. ";
			int  indis=0;
			boolean var=false;
			
			String[] a=x.split(" ");
			String[] b=new String[a.length];
			for(int i=0;i<a.length;i++){    // kelimelerin noktalama işaretleri temizlenir.
				a[i]=temizle(a[i]);
			}
			for(int i=0;i<b.length;i++){
				b[i]="";
			}
			for (int i = 0; i < a.length; i++) {
				var=false;
				for(int j=0; j<=indis;j++){
					if(a[i].equalsIgnoreCase(b[j]))
						var=true;
				}	
				if(!var){
					b[indis]=a[i];
					indis++;
				}
			}
			for(int i=0;i<b.length;i++){
				if(!b[i].isEmpty())
					System.out.println(b[i]);
			}
		}
	}



