import java.util.*;
import java.io.*;
//kllnıcndan oknn blgılerın dosyaya yzlması
public class Sixth {
	public static void main(String[] args)throws Exception {
		Scanner input=new Scanner(System.in);
		String ad,soyad;
		int yas;
		File file=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test.txt");
		FileWriter f = new FileWriter(file,true);
		PrintWriter p=new PrintWriter(f);
		for (int i = 0; i < 3; i++) {
			System.out.println("Ad : ");
			ad=input.next();
			System.out.println("Soyad : ");
			soyad=input.next();
			System.out.println("Yas : ");
			yas=input.nextInt();
			p.print(ad+" ");
			p.print(soyad+" ");
			p.println(yas);
		}
		p.close();
	}

}
