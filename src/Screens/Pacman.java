package Screens;

import processing.core.PApplet;


public class Pacman extends PApplet{

	int x=286;
	int y=472;
	int direction;
	PApplet app;
	//Maze maze;


	public Pacman (PApplet app) {
		this.app = app;

	}
	
	public void setup () {
		//maze = new Maze (this);

	}

	public void drawPacman() {
		app.noStroke();
		app.fill(255,240,0);
		app.ellipseMode(CORNER);
		app.ellipse(x, y, 25, 25);
	

	}
}
