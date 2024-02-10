package StringBuilder;

public class FindMaxWord {
	
	
		public static String temizle(String s){
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
			      if (Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i)==' ') {
			          sb.append(s.charAt(i));    //sayı, harf veya boşluk ise ekle
			        }
			}
			return sb.toString();
		}
		public static String maxBul(String s){
			int max=0, say;
			String sakla="";
			String x=temizle(s);
			String[] a=x.split(" ");
			for(int i=0;i<a.length;i++){
				say=0;
				for(int j=0;j<a.length;j++){
					if(a[i].equalsIgnoreCase(a[j]))
						say++;	
				}
				if(say>=max){
					max=say;
					sakla=a[i];
				}
			}
			return sakla;
		}
		
		public static void main(String[] args) {
			String s="Orda bir köy var uzakta. O köy bizim köyümüzdür. Gezmesek de " +
					"tozmasak da. O köy bizim köyümüzdür. Orda bir ev var uzakta. O ev " +
					"bizim evimizdir. Yatmasak da kalkmasak da. O ev bizim evimizdir. ";
					
			System.out.println("\nen çok kullanılan kelime="+maxBul(s));
				
		}
	}


