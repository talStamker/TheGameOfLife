
/**
 * This class represents the game, The class has a matrix field that holds the
 * values ​​in each cell. A full cell of the matrix will occupy a true value in
 * the corresponding cell in the matrix. An empty cell in the matrix will take
 * the false value in the corresponding cell in the matrix.
 * 
 * @author Tal
 */
public class GameOfLife {
	private boolean[][] matrix;

	/*---------Constructor---------
	 * It builds the matrix as follows: 
	 * It grills a number from 1 to 0 inclusiv. 
	 * If 1 comes out, it fills the cell with a true value. 
	 * If 0 comes out, it fills the cell's value with a false value.*/
	public GameOfLife(int rows, int columns) {
		matrix = new boolean[rows][columns];
		int num;
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix[0].length; j++) {
				num = (int) (Math.random() * 2);
				if (num == 1) {
					this.matrix[i][j] = true;
				} else {
					this.matrix[i][j] = false;
				}
			}
		}
	}

	/*---------Getter---------*/
	public boolean[][] getMatrix() {
		return matrix;
	}

	/*---------Setter---------*/
	public void setMatrix(boolean[][] matrix) {
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix[0].length; j++) {
				this.matrix[i][j] = matrix[i][j];
			}
		}
	}

	/*
	 * This function accepts values ​​i and j indicating the position of a cell in
	 * the matrix. The function will return how many neighbors the cell in question
	 * has that have a true value.
	 */
	private int counterLivingNeighbors(int i, int j) {
		int counter = 0;
		for (int k = i - 1; k <= i + 1; k++) {
			if (k >= 0 && k < this.matrix.length) {
				for (int m = j - 1; m <= j + 1; m++) {
					if (m >= 0 && m < this.matrix[0].length) {
						if ((m != j || k != i) && this.matrix[k][m]) {
							counter++;
						}
					}
				}
			}
		}
		return counter;
	}

	/*
	 * This function accepts a matrix and updates it with the values ​​of the next
	 * generation.
	 */
	public void updateTheNextGeneration(boolean[][] matrix) {
		int counter;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				counter = counterLivingNeighbors(i, j);
				if ((!this.matrix[i][j] && counter == 3) || (this.matrix[i][j] && (counter == 3 || counter == 2))) {
					matrix[i][j] = true;
				} else {
					matrix[i][j] = false;
				}
				counter = 0;
			}

		}
	}
}
