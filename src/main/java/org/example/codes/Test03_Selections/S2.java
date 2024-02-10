
public class S2 {
	public static void main(String[] args) {
		System.out.println(topla(50));
	}
	public static int topla(int n){
		if(n==2)
			return 2;
		else
			return n+topla(n-2);
	}

}
