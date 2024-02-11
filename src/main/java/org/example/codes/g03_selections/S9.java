

public class S9 {
    public static int faktor(int n){
		if (n==0)
			return 1;
		else
			return n*faktor(n-1);
	   }
	public static double eSayısı(int adım){
		  if(adım==0)
			return 1;
		  else
			return 1.0/faktor(adım)+eSayısı(adım-1);
		
	   }
	    
		public static void main (String args[] ){   
	      System.out.println("e="+eSayısı(20));
	   }
	}
