package Screens;

import processing.core.PApplet;

public class Dot extends PApplet {
	
	int size;
	int x;
	int y;
	PApplet app;


	public Dot (PApplet app) {	
		size = 7;
		this.app = app;	
	}
	
	public void crear(int posX, int posY) {
		app.fill(255);
		app.ellipse(posX+30, posY+30, size, size);	
		x=posX;
		y= posY;
	}

}
