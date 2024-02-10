package String;

public class Replace {
	
	public static void main(String[] args) {
		String s= "Hoşgeldiniz";
		System.out.println(s.toLowerCase()); //şu string döner: hoşgeldiniz.
		System.out.println(s.toUpperCase());// şu string döner: HOŞGELDİNİZ.
			
		System.out.println(s.replace('i','A'));  // şu string döner: HoşgeldAnAz.
		System.out.println(s.replaceFirst("in", "ABC"));// şu string döner: HoşgeldABCiz.
		System.out.println(s.replace("i", "AB"));// şu string döner: HoşgeldABnABz.
		System.out.println(s.replace("el", "AB"));// şu string döner: HoşgABdiniz.
	        
		String s2="  Hoş geldiniz  ";  // baştan ve sondan boşluklar silinir
		System.out.println(s2.trim()); // şu string yazılır:  Hoş geldiniz.
		}


}
