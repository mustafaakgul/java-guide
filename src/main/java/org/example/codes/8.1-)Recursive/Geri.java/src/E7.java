public class E7 {
	public static void main(String[] args) {
		ntekrar(6);
	}
	public static void ntekrar(int n){
		if(n>1)
			ntekrar(n-1);
		
		System.out.println(n+":merhba");
	}

}
