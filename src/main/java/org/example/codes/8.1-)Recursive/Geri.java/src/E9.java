public class E9 {
	public static void main(String[] args) {
		
		ntekrar(6);
	}
	public static void ntekrar(int n){
		System.out.println(n);
		if(n!=1)
			ntekrar(n-1);
		System.out.println("holl");
	}

}
