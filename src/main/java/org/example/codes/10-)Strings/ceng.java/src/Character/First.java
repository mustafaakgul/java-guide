package Character;

public class First {
	public static void main(String[] args) {
		Character x=new Character('b');
		
	System.out.println(x.compareTo('a'));	
	System.out.println(x.compareTo('b'));
	System.out.println(x.compareTo('c'));
		x.equals('b');
		System.out.println(x.charValue());
		
		  	
       System.out.println(x.equals(new Character('b')) ); 
       System.out.println(x.equals(new Character('d')));
       System.out.println(Character.isDigit('7'));
       
       System.out.println(Character.isDigit('8'));// true
       System.out.println(Character.isLetter('n'));//true
       

       for(int i=0;i<26;i++)
          System.out.print ((char)('a'+i)+" ");
       System.out.println();
       


       for(int i=0;i<26;i++)
           System.out.print ((Character.toUpperCase((char)('a'+i)))+" ");
       System.out.println();
       
     //  System.out.print("0x",0x0000);



	}

}
