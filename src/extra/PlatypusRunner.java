package extra;

public class PlatypusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Platypus mark = new Platypus("Mark");
		mark.sayHi();
		// What is happening here 'mark' is gaining access to the
		// private string of mark's name for the sake of the
		// sayHi() method.
	}

}
