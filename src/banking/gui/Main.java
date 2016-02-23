package banking.gui;

import javax.swing.JFrame;

/**
 * main method for running the program.
 * @author kevinagary
 *
 */
final class Main {
	/**
	 * Private constructor to address STYLE issue.
	 */
	private Main() {
	}
	
	/**
	 * All methods should have a Javadoc according to STYLE.
	 * @param args command-line arguments
	 * @throws Exception as per typical main specifications
	 */
	public static void main(final String[] args) throws Exception {

		/*
		 * Make sure the command-line argument in Eclipse is set
		 * to "my.properties". To do so, go to Run Configurations ->
		 * Variables, and insert "my.properties" as one of the
		 * program variables.
		 */
		if (args.length != 1) {
			System.out.println("Usage: java FormMain <property file>");
			System.exit(1);
		}

		String propertyFile = args[0];
		JFrame frame = new MainFrame(propertyFile);
		frame.setVisible(true);

	}
}
