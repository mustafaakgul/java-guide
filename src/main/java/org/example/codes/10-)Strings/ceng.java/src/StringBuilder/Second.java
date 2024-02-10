package StringBuilder;

public class Second {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to Java");
		System.out.println(sb.toString()); 
		System.out.println("uzunluk:"+sb.capacity());
		
		sb.append("Java");  
		System.out.println(sb); 
		
		sb.insert(11, "HTML ve");
		System.out.println(sb);
		sb.delete(8, 22); 
		System.out.println(sb);
		sb.deleteCharAt(8) ; 
		System.out.println(sb);
		sb.insert(8, "to J");
		sb.reverse(); 
		System.out.println(sb);
		sb.reverse();
		sb.replace(11, 15, "HTML"); 
		System.out.println(sb);
		sb.setCharAt(0, 'w'); 
        System.out.println(sb);
        System.out.println("kapasite:"+sb.capacity());
        System.out.println("uzunluk:"+sb.length());
        
        sb.trimToSize();
        System.out.println("trimToSize kullandıktan sonra :\n");
        System.out.println("kapasite:"+sb.capacity());
        System.out.println("uzunluk:"+sb.length());
	}


}
