

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

/** This department runs the game */
public class DrawGameOfLifeController {
	GameOfLife game;

	public DrawGameOfLifeController() {
	}

	@FXML
	private Button drawTheNextGeneration;

	@FXML
	private Canvas myCanvas;

	/* This function will build a game with random values ​​and draw itץ */
	@FXML
	void initialize() {
		game = new GameOfLife(10, 10);
		drawGameOfLife();
	}

	/* This function draw the current generation */
	public void drawGameOfLife() {
		GraphicsContext gc = myCanvas.getGraphicsContext2D();
		gc.clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
		double width = myCanvas.getWidth() / game.getMatrix().length;
		double height = myCanvas.getHeight() / game.getMatrix().length;
		int i, j;
		double w, h;
		for (w = 0, i = 0; i < this.game.getMatrix().length; i++, w += width) {
			for (h = 0, j = 0; j < this.game.getMatrix().length; j++, h += height) {
				gc.strokeRect(w, h, w + width, h + height);
				if (this.game.getMatrix()[i][j] == true) {
					gc.setFill(Color.GRAY);
					gc.fillRect(w, h, w + width, h + height);
				} else {
					gc.setFill(Color.WHITE);
					gc.fillRect(w, h, w + width, h + height);
				}
			}
		}
	}

	/*
	 * This function check the values of the next generation, and draw the next
	 * generation
	 */
	@FXML
	void drawTheNextGenerationButtonPressed(ActionEvent event) {
		boolean[][] matrix = new boolean[game.getMatrix().length][game.getMatrix().length];
		game.updateTheNextGeneration(matrix);
		game.setMatrix(matrix);
		drawGameOfLife();
	}
}
