

public class S8 {
public static int sum(int x){
	if(x==0)
		return 0;
	else
		System.out.println(x%10);
	return x%10+sum(x/10);
}
public static void main(String[] args) {
	System.out.println(sum(9876));
}
}