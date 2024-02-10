	import java.io.*;
	import java.util.Scanner;

public class Test3 {


		public static void main(String[] args) throws FileNotFoundException {
			File source=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\9.2\\Ceng\\src\\People");
			File target=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\9.2\\Ceng\\src\\PeopleInfo");
			Scanner s=new Scanner(source);
			PrintWriter p=new PrintWriter(target);
			
			while(s.hasNext()){
				String info=s.nextLine();
						p.println(info);
			}
			p.close();

		}

	}



