package sudoku.ui;

import javax.swing.JPanel;

public class Square extends JPanel {

	public int x;
	public int y;

	public Cell[][] cells;

	public Square(int x, int y) {
		this.x = x;
		this.y = y;
		cells = new Cell[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cells[i][j] = new Cell(i,j);
			}
		}
	}

}
