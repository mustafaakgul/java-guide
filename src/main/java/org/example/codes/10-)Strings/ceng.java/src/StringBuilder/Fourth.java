package StringBuilder;
import java.util.Scanner;
public class Fourth {
	
	
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);

			// cümle parçala
			System.out.print("Bir cümle girin: ");
			String x=s.nextLine();
			String [] y=x.split(" ");
			// kelime sayısı
			System.out.println(y.length+" kelime bulunmaktadır");
			
			// boşlukları karakterle veya stringle değiştir.  replace
			x=x.replace(" ", "_");
			System.out.println("x="+x);

			// kelimeleri tek tek başka bir stringe ekle 
			String a="";
			for (int i = 0; i < y.length; i++) {
				a=a+y[i]+" + ";
			}
			System.out.println("Başka bir String kullanarak : "+a);

			// StringBuilder kullanarak kelimeleri tek tek ekle. append
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < y.length; i++) {
				sb.append(y[i]+"/");
			}
			System.out.println("append kullanarak : "+sb);

			// kelimelerin tek tek uzunluklarını yaz
			for (int i = 0; i < y.length; i++) {
				System.out.println(y[i]+" : "+y[i].length());
			}
			//Bir stringde kaç tane rakam var.
			int say=0;
			for (int i = 0; i < x.length(); i++) {
				if(Character.isDigit(x.charAt(i)))
					say++;
			}
			System.out.println(say+" tane rakam var.");
			
		}
	}


//bir kelimenin bir stringde olup olmadığını ve varsa hangi indislerde olduğunu bulan program



