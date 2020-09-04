package Screens;

public class HighScores extends Main{
	public void setup() {
		scores = loadImage ("HighScores.png");
		scores.loadPixels();
		image (scores,0,0);
	}
}
