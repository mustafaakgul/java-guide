
public class S5 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
			ucgen(i);
	}
	public static void ucgen(int n) {
	if(n==6)
		System.out.println(n);
		else{
			System.out.print(n);
	ucgen(n+1);
		}
	
	}

}
