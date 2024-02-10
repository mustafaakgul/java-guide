import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Fourth {
	

	public static void main(String[] args) throws FileNotFoundException {
		File source=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\9.2\\Ceng\\src\\People");
		Scanner s = new Scanner(source);
		Scanner input = new Scanner(System.in);
		System.out.println("Aramak istediginiz kelime");
		String ad=input.nextLine();		
		while(s.hasNext()){
		String info=s.nextLine();
		System.out.println(info);
		String[] b=info.split("\t");
		System.out.println("kısıler"+b[0]);
		System.out.println(b[1]);
		if(b[0].equals(ad)){
			System.out.println("Buldugumuz kelime: "+info);
		}
		}
		
		
	}

}
