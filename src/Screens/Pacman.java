package Screens;

import processing.core.PApplet;
//import processing.core.PImage;


public class Pacman extends PApplet{
	//PImage pacman1;
	int x=286;
	int y=472;
	int direction;
	//PImage pacmanImage;
	PApplet app;
	//Maze maze;


	public Pacman (PApplet app) {
		this.app = app;
		//pacmanImage = p;

	}
	
	public void setup () {
		//maze = new Maze (this);
		//pacman1 = loadImage("Pacman1.png");

	}

	public void drawPacman() {
		//pacman1.loadPixels();
		//image(p,100,100);
		app.noStroke();
		app.fill(255,240,0);
		app.ellipseMode(CORNER);
		app.ellipse(x, y, 25, 25);
		//x++;

	}
	/*public void keyPressed() {
		switch (keyCode) {
		case RIGHT:
			if(matrix[matY][matX+1]!=1) {
				posX += 20;
				matX++;
			}
			break;
		case LEFT:
			if(matrix[matY][matX-1]!=1) {
				posX -= 20;
				matX--;
			}
			break;
		case UP:
			if(matrix[matY-1][matX]!=1) {
				posY -= 20;
				matY--;
			}
			break;
		case DOWN:
			if(matrix[matY+1][matX]!=1) {
				posY += 20;
				matY++;
			}
			break;
		default:
			break;
		}
	}*/
}
