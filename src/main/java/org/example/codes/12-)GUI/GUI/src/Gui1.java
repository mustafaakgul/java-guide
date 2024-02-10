
	// Basit pencere ve merkeze almak
	import javax.swing.JFrame;
	public class Gui1 {
	  public static void main(String[] args) {
	    JFrame pencere = new JFrame("Deneme Penceresi");
	    pencere.setSize(400, 300);
	    pencere.setVisible(true);
	    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    pencere.setLocationRelativeTo(null); // frame'i merkeze al
	  }
	}



