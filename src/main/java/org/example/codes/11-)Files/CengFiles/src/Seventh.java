import java.util.*;
import java.io.*;
public class Seventh {
	//aynı anda birinden okuyup digerinden yazılması
	public static void main(String[] args)throws Exception {
		File source=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test.txt");
		if(!source.exists()){
			System.out.println("Kaynak dosya olusturulmamis.");
			System.exit(0);
		}
		File target=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src");
		if(!target.exists()){
			System.out.println("Hedef dosya olusmamis.");
			System.exit(0);
		}
		Scanner read=new Scanner(source);
		PrintWriter write=new PrintWriter(target);
		while(read.hasNext()){
			String s1=read.nextLine();
			write.println();
		}
		read.close();
		write.close();
	}

}
