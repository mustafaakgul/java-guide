public class E16 {
	public static void main(String[] args) {
		for(int i=6;i>=0;i--)
			ucgen(i);
	}
	public static void ucgen(int n) {
	if(n==0)
		System.out.println(n);
		else{
			System.out.print(n);
	ucgen(n-1);
		}
	
	}

}
