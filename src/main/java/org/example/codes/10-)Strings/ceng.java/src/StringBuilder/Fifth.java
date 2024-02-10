package StringBuilder;
import java.util.Scanner;
public class Fifth {

	
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int say = 0;

			String x= "Merhaba Araba tyu araba glrkg";
			System.out.print("Aramak istediğiniz kelimeyi girin:");
			String y=s.next();
			String[] sDizi = x.split(" ");
			for(int i=0;i<sDizi.length;i++)
				if(sDizi[i].equalsIgnoreCase(y)){
					say++;
					System.out.println("indisi : "+x.indexOf(sDizi[i]));
				}
			System.out.println("sayı="+say+"tane var");
		}
	}

	//Bir stringdeki sayıların sayı değerlerini toplayan program (rakamları değil)


