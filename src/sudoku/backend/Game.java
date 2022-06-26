package sudoku.backend;

public class Game {

	public int[][] game;
	public int[][] plateau;
	public boolean candidates[][][];

	public Game() {
		game = new int[9][9];
		plateau = new int[9][9];
		candidates = new boolean[9][9][9];
	}

	public void updateCell(int x, int y, int value) {
		plateau[x][y] = value;
	}
	
	public void updateCellCandidates(int x, int y, boolean[] value) {
		candidates[x][y] = value;
	}

}
