package Screens;


import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	public PImage menu;
	public PImage board;
	public PImage scores;
	

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(600,700);

	}
	public void setup() {
			scores = loadImage ("HighScores.png");
			scores.loadPixels();
			image (scores,0,0);
	}
	
	public void draw() {
		
	}
	}
	
			
	



