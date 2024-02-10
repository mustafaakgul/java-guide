
public class E18 {
	public static int factor(int n){
		if(n==0)
			return 1;
		else return n*factor(n-1);
	}
public static double esayisi(int adim){
	if(adim==0)
		return 1 ;
	else
		return 1.0/factor(adim)+esayisi(adim-1);
}
public static void main(String[] args) {
	System.out.println(esayisi(5));
}
}
