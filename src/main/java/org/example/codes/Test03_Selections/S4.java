
public class S4 {
	public static void main(String[] args) {
		say(5);
	}
	public static void say(int n) {
		if(n==1)
			System.out.println("1 saniye kaldi");
		else{
			System.out.println(n+"saniye kaldi");
		say(n-1);
		}
	}

}
