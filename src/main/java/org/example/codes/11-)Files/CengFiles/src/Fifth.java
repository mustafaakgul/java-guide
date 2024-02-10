import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//dosyaya bilgi eklenmesi
public class Fifth {

	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test.txt",true);
		PrintWriter write=new PrintWriter(f);
		write.println("merhaba");
		write.println("Mmerhaba");
		write.printf("%d\n",2015);
		write.close();

	}

}
