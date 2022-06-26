package sudoku.ui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Main extends JFrame {
	
	public Main(String title) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel gamepanel = new JPanel();
		gamepanel.setLayout(new GridLayout(3,3));
		this.add(gamepanel);
	}
	
	
	
	public static void main(String[] argv) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main("Sudoku");
			}
		});
	}

}
