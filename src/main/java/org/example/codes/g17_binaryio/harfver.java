import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class harfver {
	public static void main(String[] args)throws Exception {
		
	
	File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt");
    Scanner s=new Scanner(f);
    String hepsi="";
    String harf="";
    while(s.hasNext()){
    	String satir=s.nextLine();
    	String[] satirlar=satir.split("\t");
    	if(Double.parseDouble(satirlar[3])>90){
    		harf="AA";
    	}
    	else if(Double.parseDouble(satirlar[3])>80){
    		harf="BA";
    	}
    	else if(Double.parseDouble(satirlar[3])>70){
    		harf="BB";
    	}
    	else if(Double.parseDouble(satirlar[3])>60){
    		harf="CB";
    	}
    	else if(Double.parseDouble(satirlar[3])>50){
    		harf="CC";
    	}
    	else{
    		harf="FF";
    	}
    	hepsi=hepsi+satir+"\t"+harf+"\n";
    }
	File f1=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt",false); 
    PrintWriter p=new PrintWriter(f1);
    p.println(hepsi);
    p.close();
}
}