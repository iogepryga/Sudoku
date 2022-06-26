package sudoku.ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cell extends JPanel {
	int x;
	int y;
	boolean decided;

	private class CandidatePanel extends JPanel {
		private boolean candidate[];
		public CandidatePanel() {
			this.setLayout(new GridLayout(9, 9));
			candidate = new boolean[9];
			for(int i = 0; i < 9 ; i++) {
				candidate[i] = false;
			}
		}
	}

	CandidatePanel candidatepanel = new CandidatePanel();
	JLabel choice = new JLabel(" ");

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		this.decided = false;
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		this.add(choice);
	}

}
