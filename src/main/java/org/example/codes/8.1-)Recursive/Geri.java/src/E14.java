
public class E14 {
	public static void main(String[] args) {
		for(int i=6;i>=1;i--)
			ucgen(i);
	}
	public static void ucgen(int n) {
	if(n==1)
		System.out.println(n);
		else{
			System.out.print(n);
	ucgen(n-1);
		}
	/*if!=0 sopn cugen n-1*/
	/*for artırırsan farklı ucgn cıkar*/
	}

}
