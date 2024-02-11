import java.io.File;
import java.util.Scanner;


public class notlamasi {
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
		
	/*	String[] b={a,e,ı,o,u};
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
		System.out.println(s);*/
		String bos="";
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)='a'||'e'||'i'||'o'||'u'||'ü'||'ı'){
				
			}
			else{
				s.append(a.charAt(i));
			}
			bos=bos+a.charAt(i);
		}
	
	return s;
	}			
	public static void okudosyam(){
		
	}
   public static void cevir1(String a){
	   for (int i = 0; i < a.length(); i++) {
		if((int)a.charAt(i)>=65 ||(int)a.charAt(i)<=97){
			char x=(char)((int)a.charAt(i)+32);
			
		}
	}
   }
   public static void cevir2(String a){
	   for (int i = 0; i < a.length(); i++) {
		if((int)a.charAt(i)>=98 ||(int)a.charAt(i)<=112){
			char x=(char)((int)a.charAt(i)-32);
			
		}
	}
   }
   public static int[] sayHarf(String s) {
	    int[] sayaclar = new int[30];

	    for (int i = 0; i < s.length(); i++) {
	      if (Character.isLetter(s.charAt(i)))
	        sayaclar[s.charAt(i) - 'a']++;
	    }
	    return sayaclar;
	  }
   public static void kelimesay(String ss){
	   Scanner input=new Scanner(System.in);
	   File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.1\\Lab\\src\\dosya.txt");
		Scanner s=new Scanner(f);
		System.out.println("Aranacak kelime: ");
		String kelime=input.next();
		
		while(s.hasNext()){
			String satir=s.nextLine();
			String parca[]=satir.split(" ");
			int i =0;
			while(i<parca.length){
				if(parca[i].equalsIgnoreCase(kelime)){
					
					System.out.println(satir+": cümlesinde "+kelime+" bulundu. ");
				
				}
				i++;
				
			}
		}
		
   }
	public static void main(String[] args)throws Exception {
		String a="Ali ata baksana.^+%&";
	    System.out.println(notlamasil(a));
	    File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.1\\Lab\\src\\dosya.txt");
		okudosyanoktasil(f);
	//	unlusil(a);
       
	}

}
