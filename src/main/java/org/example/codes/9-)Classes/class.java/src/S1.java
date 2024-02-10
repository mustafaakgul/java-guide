import java.util.Scanner;

public class S1 {
	private static String isim;
	private static String email;
	private static String cinsiyet;

	public String getName() {
		return isim;
	}

	public void setName(String name) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return cinsiyet;
	}

	public void setGender(String gender) {
		this.cinsiyet = cinsiyet;
	}

	public void print() {
		System.out.println("The Writer's name: " + isim
				+ "\nThe e- maid adress: " + email + "\nThe gender: " + cinsiyet);
	}

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("What's the name of writer? ");
		isim = p.next();
		System.out.println("What's the e-mail? ");
		email = p.next();
		System.out.println("What' the gender?");
		cinsiyet = p.next();

		S1 w1 = new S1();
		S1 w2 = new S1();
		S1 w3 = new S1();

		w1.print();

		w2.setName("Stephan Amel");
		w2.setEmail("stephan@hotmail.com");
		w2.setGender("Male");
		w2.print();

		w3.setName("Patrick Jane");
		w3.setEmail("patrick@hotmail.com");
		w3.setGender("Male");
		w3.print();

	}
}