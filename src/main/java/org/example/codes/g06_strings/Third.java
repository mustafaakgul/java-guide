import java.util.Scanner;


public class Third {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir string giriniz: ");
		String a = input.nextLine();
		String[] parcalar=a.split(" ");
			for (int i = 0; i < parcalar.length; i++) {
				System.out.println(parcalar[i]);
			}
			for (int i = 0; i < parcalar.length; i++) {
			int	buyukluk[i]=(int)(parcalar[i].charAt(0));
			}
			int min=buyukluk[0];
			  for(int i=1; i < buyukluk.length;i++){
			      if(buyukluk[i]< min )
			         min=buyukluk[i];
			  }
			
		for (int j = 0; j < buyukluk.length; j++) {
			System.out.print(buyuklul[i]);
		}
	}

}











