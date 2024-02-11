import java.io.File;
import java.io.PrintWriter;
import java.util.*;


public class ortalama {
	public static void main(String[] args)throws Exception {
		
		File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt");
		Scanner s=new Scanner(f);
		String hepsi="";
		double toplam_vize=0,toplam_final=0;
		int sayac=0;
		while(s.hasNext()){
			String satir=s.nextLine();
			String[] satirlar=satir.split("\t");
			toplam_vize=toplam_vize+Integer.parseInt(satirlar[1]);
			toplam_final=toplam_final+Integer.parseInt(satirlar[2]);
			sayac++;
			hepsi+=satir+"\n";
			
		}
		File f1=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt",false);
		PrintWriter p=new PrintWriter(f1);
		p.println(hepsi+"\n"+"\t"+toplam_vize/sayac+"\t"+toplam_final/sayac);
		p.close();
	}

}
