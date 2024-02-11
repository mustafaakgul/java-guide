import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ekleDosya {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("Bilgiler:");
		String a=input.nextLine();
		FileWriter f=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt",true);
		PrintWriter p=new PrintWriter(f);
		p.println(a);
		p.close();
	}

}
