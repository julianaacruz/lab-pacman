package Screens;


import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	private PImage menu;
	private PImage board;
	private PImage scores;
	private PImage marker;

	public int screen = 0;


	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(600,700);

	}
	public void setup() {
			
	}
	
	public void draw() {
		switch(screen) {

		  case 0: 
			  int x=330;
			  int y=200;
			  menu = loadImage ("Menu.png");
			  marker = loadImage ("Marker.png");
			  menu.loadPixels();
			  marker.loadPixels();
			  if((mouseX>300) && (mouseY>320)) {
				  x=260;
				  y=270;}
			  image (menu,0,0);
			  image (marker,x,y);
			  
			  if (mouseX>360 && mouseY<380 && mouseY>260 && x==330 && mousePressed==true) {
				 screen = 1;  
				 }else if (x==260 && mouseX>320 && mouseY>320 && mouseY<410 && mousePressed==true) {
				 screen = 2;	  
				  }
				break;
		  case 1: 
			  board = loadImage ("Board.png");
				board.loadPixels();
				image (board,0,0);
				break;
		  case 2:
				scores = loadImage ("HighScores.png");
				scores.loadPixels();
				image (scores,0,0);
				if (mouseX<95 && mouseY<660 && mouseY>600 && mousePressed==true) {
					screen=0;
		}
				break;
		}
	}
	}
	
			
	



