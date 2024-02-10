import java.io.File;
	import java.util.Scanner;
public class Test6 {
	


	
		public static StringBuilder notlamasil(String a){
				StringBuilder s = new StringBuilder();
			for (int i = 0; i < a.length(); i++) {
				if(Character.isLetterOrDigit(a.charAt(i))){
				s.append(a.charAt(i));
				}
				else if(a.charAt(i)==' '){
					s.append(a.charAt(i));
				}
			}
			System.out.println(s);
			return s;
		}
		public static void okudosyanoktasil(File a)throws Exception{
			Scanner read=new Scanner(a);
			StringBuilder s=new StringBuilder();
			String satirlar="";
			while(read.hasNext()){
				String k=read.nextLine();
				satirlar=satirlar+k+"\n";
			}
			System.out.println(satirlar);
			notlamasil(satirlar);
			
		}
		public static StringBuilder unlusil(String a){
			StringBuilder s=new StringBuilder();
			
			String[] b={a,e,ı,o,u};
			for (int i = 0; i < a.length(); i++) {
				for (int k = 0; k < b.length; k++) {
				if(a.charAt(i)==b[j]){
					s.deleteCharAt(i);
				}
				else {
					s.append
				}
			}
	   }	
			System.out.println(s);
			return s;
		}
		public static void okudosyam(){
			
		}

		public static void main(String[] args)throws Exception {
			String a="Ali ata baksana.^+%&";
		    System.out.println(notlamasil(a));
		    File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.1\\Lab\\src\\dosya.txt");
			okudosyanoktasil(f);
			unlusil(a);
	       
		}

	}



