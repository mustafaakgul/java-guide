package Character;

public class Unicode {
	
	// Unicode tablosunu her satıra 6 tane gelecek şekilde yazdırmak için. 
	public static void main(String[] args) {
		
	    		for (int i=0x0000;i<0x0100;i++){
			    	if(i%6==0)
			    	     System.out.println();
			     System.out.printf("0x%x : %c\t",i,(char)i);
			    }
			}



}
