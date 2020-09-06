package Screens;

import processing.core.PApplet;
import processing.core.PImage;

public class Dot extends PApplet {

	PApplet app;



	public Dot (PApplet app) {	
		this.app = app;	
	}
	
	public void crear(int posX, int posY, PImage image) {
		app.fill(255,0,0);
		
	//	app.ellipseMode(CORNER);
		//app.ellipse(posX, posY, 20, 20);	
		app.image(image,posX,posY);
		

	}

}
