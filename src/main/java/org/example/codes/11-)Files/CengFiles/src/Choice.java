import java.util.*;
import java.io.*;
public class Choice {

	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		int secim,a;
		String satir;
		File file=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\Choice.txt");
        FileWriter fw;
        PrintWriter pw;
        Scanner s;
        do{
        	System.out.println("1 Dosyaya ekle");
        	System.out.println("2 Dosyadan oku");
        	System.out.println("3 Dosyada string ara");
        	System.out.println("4 Dosyada kelime ara");
        	System.out.println("5 Cik");
        	System.out.println("Seciminiz");
        	secim=input.nextInt();
        	satir=input.nextLine(); //enter tusunu yutmasi icin
        	switch(secim){
        	case 1 :
        		fw=new FileWriter(file,true);
        		pw=new PrintWriter(fw);
        		satir=input.nextLine();
        		pw.println(satir);
        		System.out.flush();
        		pw.close();
        		break;
        	case 2 :
        		s=new Scanner(file);
        		while(s.hasNext()){
        			satir=s.nextLine();
        			System.out.println(satir);        			
        		}
        		s.close();
        		break;
        	case 3 :
        		s=new Scanner(file);
        		System.out.println("Aranacak kelime: ");
        		String kelime=s.nextLine();
        		boolean buldum=false;
        		while(s.hasNext()&&!buldum){
        			satir=s.nextLine();
        			if(satir.indexOf(kelime)!=-1){
        				buldum=true;
        				System.out.println(satir+": cümlesinde "+kelime+" bulundu. ");
        			}
        		}
        		if(!buldum)
        			System.out.println(kelime+" "+file.getName()+"dosyasında bulunamadı. ");
        		
        		s.close();
        		break;
        	case 4 :
        		s=new Scanner(file);
        		System.out.println("Aranacak kelime: ");
        		kelime=input.next();
        		buldum=false;
        		while(s.hasNext()&&!buldum){
        			satir=s.nextLine();
        			String parca[]=satir.split(" ");
        			int i =0;
        			while(i<parca.length&&!buldum){
        				if(parca[i].equalsIgnoreCase(kelime)){
        					buldum=true;
        					System.out.println(satir+": cümlesinde "+kelime+" bulundu. ");
        					break;
        				}
        				i++;
        				
        			}
        		}
        		if(!buldum)
        			System.out.println(kelime+" "+file.getName()+"dosyasında bulunamadı. ");
        			s.close();
        			break;
        		
        	}//switch
        	}while(secim!=5);
        		System.out.println("yanlıs secenek");
        
	}

}
