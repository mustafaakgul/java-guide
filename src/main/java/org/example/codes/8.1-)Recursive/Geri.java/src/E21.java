public class E21 {
	public static int topla(int x){
		if(x==0)
			return 0;
		if(x<0)
			return x=-x;
		if(x%2==1)
			x=x-1;
		else
		System.out.println(x);
			return x+topla(x-2);
	}
	public static void main(String[] args){
		System.out.println(topla(-6));
	}

}
