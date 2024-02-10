import java.io.*;
import java.util.*;
public class hesaplaNot {
	
	public static void main(String[] args) throws Exception{
		File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt");
		Scanner s=new Scanner(f);
		String hepsi="";
		while(s.hasNext()){
			String satir=s.nextLine();
			String[] parcalar=satir.split("\t");
			double toplam=Integer.parseInt(parcalar[1])*(0.3)+Integer.parseInt(parcalar[2])*(0.7);
			hepsi=hepsi+satir+"\t"+toplam+"\n";
			
		}
		FileWriter f1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt",false);
		PrintWriter p =new PrintWriter(f1);
		p.println(hepsi);
		p.close();
	}

}
