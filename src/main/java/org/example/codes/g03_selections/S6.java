
public class S6 {	
	public static void main(String[] args) {
	cikti2(1);
	}
	public static void cikti2(int n){
		if(n==6){
			System.out.print(6);
			
		}
			else{
				
				System.out.print(n);
				
		        cikti2(n+1);
			}
	}

}
