package Screens;

public class Board extends Main {
	public void setup() {
		board = loadImage ("Board.png");
		board.loadPixels();
		image (board,0,0);
		}
}
