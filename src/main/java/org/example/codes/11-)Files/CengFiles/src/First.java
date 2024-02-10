import java.io.File;


public class First {
	public static void main(String[] args) {
		
	
	
	File f = new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test.txt");
	
	System.out.println("File exists ? "+f.exists());
	System.out.println("File length : "+f.length());
	System.out.println("Can read "+f.canRead());
	System.out.println("Can write "+f.canWrite());
	System.out.println("Klasormu "+f.isDirectory());
	System.out.println("Is file "+f.isFile());
	System.out.println("Is hidden "+f.isHidden());
	System.out.println("Exact name"+f.isAbsolute());
	System.out.println(f.getAbsolutePath());
	System.out.println(new java.util.Date(f.lastModified()));
	System.out.println(f.lastModified());
	

}
}
