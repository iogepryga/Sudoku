package sudoku.fc;

public class SudokuUtils {

	public static int getX(int x_square, int x_cell) {
		return x_square*3+x_cell;
	}
	
	public static int getY(int y_square, int y_cell) {
		return y_square*3+y_cell;
	}
}
