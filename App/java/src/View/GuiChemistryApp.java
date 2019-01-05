package View;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GuiChemistryApp extends JFrame {

	private static final String APP_CAPTION = "The Chemistry App";
	
	public GuiChemistryApp() {
		super(APP_CAPTION);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Set up the content pane */
		addComponentsToPane(this.getContentPane());
		/* Set up window (frame) size */
		this.setSize(new Dimension(600,400));
		/* Display the window */
		this.pack();
		this.setVisible(true);
	}
	
	private void addComponentsToPane(final Container pane) {
		// To implement
	}
}
