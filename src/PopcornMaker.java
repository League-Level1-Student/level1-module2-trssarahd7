import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String userflav = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn pop = new Popcorn(userflav);
		String howlong = JOptionPane.showInputDialog("How long do you want to microwave it for?");
		Microwave mike = new Microwave ();
		
	}

}