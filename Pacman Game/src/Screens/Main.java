package Screens;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	

	static PImage menu;
	static PImage board;
	static PImage scores;
	static PImage marker;
	static PImage howto;
	static PImage win;
	static PImage lose;
	static PImage blue, yellow, red, orange;
	static PImage pacman1;
	static PImage up1,up2;
	static PImage down1,down2;
	static PImage left1,left2;
	static PImage right1,right2;
	static PImage diamond;
	static PImage star;
    private boolean htp = true;
    boolean winScreen =false;
    boolean dot1, dot2, dot3;
	public int screen = 0;
	Pacman pacman;
	//Maze maze;
	int size;
	int [][] matrix; 
	int posX,posY;	
	int matX, matY;
	int col,row;
	int velx=30, vely=0;
	int vel=30;
	int posXO,posXO1, posXO2;
	int posYO,posYO1, posYO2;
	Dot dot;
	int puntos;
	int time;
	boolean timeStart;
	boolean loseScreen;
	//enemigos
	int posXE=210;
	int posYE=210;
	int posXE2=30;
	int posYE2=60;
	int posXE3=30;
	int posYE3=420;
	int posXE4=390;
	int posYE4=210;
	//510
	int vel2=30;
	int vel3=30;
	int vel4=30;
	Character enemy1;
	Character enemy2;
	Character enemy3;
	Character enemy4;
	boolean reset=false;
	int m1;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(600,700);

	}
	public void setup() {
		pacman1 = loadImage("Pacman1.png");
		menu = loadImage ("Menu.png");
		marker = loadImage ("Marker.png");
		board = loadImage ("Fondo.png");
		scores = loadImage ("HighScores.png");
		howto = loadImage ("HowToPlay.png");
		blue = loadImage("Inky.png");
		red = loadImage("Blinky.png");
		yellow = loadImage("Kiiro.png");
		orange = loadImage("Clyde.png");
		win = loadImage("Win.png");
		lose = loadImage("GameOVer.png");
		diamond= loadImage("Diamond.png");
		star= loadImage("star.png");
		dot=new Dot(this);
		pacman = new Pacman(this);
		enemy1= new Character(this);
		enemy2= new Character(this);
		enemy3= new Character(this);
		enemy4 = new Character (this);
		m1=1;

		posXO=180;
		posXO1=210;
		posXO2=450;
		posYO=210;
		posYO1=390;
		posYO2=450;
		
		
		
		
		dot1=true;
		dot2=true;
		dot3=true;
		
		col = 30;
		row = 35;
		size=20;

		matX = 1;
		matY = 1;
		matrix = new int [20][20];
		
		//negros
		
		//lat derecho
		matrix[0][19]=1;
		matrix[1][19]=1;
		matrix[2][19]=1;
		matrix[3][19]=1;
		matrix[4][19]=1;
		matrix[5][19]=1;
		matrix[6][19]=1;
		matrix[7][19]=1;
		matrix[8][19]=1;
 
		matrix[7][18]=1;
		matrix[8][18]=1;
		matrix[7][17]=1;
		matrix[8][17]=1;
		
		matrix[10][18]=1;
		matrix[11][18]=1;
		matrix[10][17]=1;
		matrix[11][17]=1;
		
		matrix[10][14]=1;
		matrix[11][14]=1;
		
		matrix[10][19]=1;
		matrix[11][19]=1;
		matrix[12][19]=1;
		matrix[13][19]=1;
		matrix[14][19]=1;
		matrix[15][19]=1;
		matrix[16][19]=1;
		matrix[17][19]=1;
		matrix[18][19]=1;
		matrix[19][19]=1;
		
		
		//mitad
		
		
		matrix[3][14]=1;
		matrix[3][13]=1;
		matrix[3][16]=1;
		matrix[5][16]=1;
		
		
		//lat izquierdo
		matrix[1][0]=1;
		matrix[2][0]=1;
		matrix[3][0]=1;
		matrix[4][0]=1;
		matrix[5][0]=1;
		matrix[6][0]=1;
		matrix[7][0]=1;
		matrix[8][0]=1;

		matrix[7][1]=1;
		matrix[8][1]=1;
		matrix[7][2]=1;
		matrix[8][2]=1;
		
		matrix[10][1]=1;
		matrix[11][1]=1;
		matrix[10][2]=1;
		matrix[11][2]=1;
		
		matrix[10][5]=1;
		matrix[11][5]=1;
		
		matrix[10][0]=1;
		matrix[11][0]=1;
		matrix[12][0]=1;
		matrix[13][0]=1;
		matrix[14][0]=1;
		matrix[15][0]=1;
		matrix[16][0]=1;
		matrix[17][0]=1;
		matrix[18][0]=1;
		matrix[19][0]=1;
		
		//mitad 
		
		matrix[3][3]=1;
		matrix[3][5]=1;
		matrix[3][6]=1;
		matrix[5][3]=1;
		
		

		matrix[5][8]=1;
		matrix[5][9]=1;
		matrix[5][10]=1;
		matrix[5][11]=1;
		
		matrix[16][5]=1;
		matrix[15][5]=1;
		
		matrix[16][14]=1;
		matrix[15][14]=1;
		
		
		matrix[12][8]=1;
		matrix[11][8]=1;
		matrix[12][9]=1;
		matrix[12][10]=1;
		matrix[12][11]=1;
		matrix[11][11]=1;
		matrix[10][11]=1;
		matrix[10][8]=1;
		
		//abajo
		matrix[19][0]=1;
		matrix[19][1]=1;
		matrix[19][2]=1;
		matrix[19][3]=1;
		matrix[19][4]=1;
		matrix[19][5]=1;
		matrix[19][6]=1;
		matrix[19][7]=1;		
		matrix[19][8]=1;
		matrix[19][9]=1;
		matrix[19][10]=1;
		matrix[19][11]=1;
		matrix[19][12]=1;
		matrix[19][13]=1;
		matrix[19][14]=1;
		matrix[19][15]=1;
		matrix[19][16]=1;
		matrix[19][17]=1;
		matrix[19][18]=1;
		matrix[19][19]=1;
		
		

		matrix[17][3]=1;
		matrix[17][4]=1;
		matrix[17][5]=1;
		matrix[17][6]=1;
		matrix[17][7]=1;		
		matrix[17][8]=1;

		matrix[17][11]=1;
		matrix[17][12]=1;
		matrix[17][13]=1;
		matrix[17][14]=1;
		matrix[17][15]=1;
		matrix[17][16]=1;

		
	}
	


	public void draw() {
		
		
		
		
		
		switch(screen) { // PANTALLAS

		
		// pantalla inical
		  case 0: 
			  int x=330; //pos marker
			  int y=200;
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
				
				//pantalla juego
		  case 1: 

			 
			  background (0);
			  image(board,0,0);
			  noStroke();
			
				
				//puntos
				
				  fill(255);
				  textSize(40);
				  text("SCORE:" + " " + puntos,100,650);
				  
				//Tiempo
				  text("TIME"+" "+time,320,650);
				  
				//pintar pacman
				pacman.drawPacman(posX,posY,m1);
				
				//pintar enemigos
				enemy1.pintar(posXE,posYE,orange);
				enemy2.pintar(posXE2,posYE2,blue);
				enemy3.pintar(posXE3,posYE3,yellow);
				enemy4.pintar(posXE4, posYE4,red);
				
				//pintar puntos
				if(dot1==true) {
					dot.crear(posXO,posYO,diamond);
				}
				
				if(dot2==true) {
				dot.crear(posXO1,posYO1,diamond);
				}
				
				if(dot3==true) {
				dot.crear(posXO2,posYO2,star); 
				}
				
				//pantalla ganar
				if(winScreen==true) {
		        	  image(win,120,200);
		          }
				
				//pantalle perder
				if(loseScreen==true) {
		        	  image(lose,120,200);
		          }
				
				
				
			//contador
				if(frameCount%10 == 0){
					
					if(timeStart==true) {
						time++;
					}
					
					//Movimiento de los enemigos
					
					//1
					posYE+=vel;
					
					if (posYE==210) {
						vel=vel*-1;
					}
					if (posYE==360) {
						vel=vel*-1;
					}
					
					//2
				     posXE2+=vel2;
					
					if (posXE2==30) {
						vel2=vel2*-1;
					}
					if (posXE2==540) {
						vel2=vel2*-1;
					}
					
					//3
				    posXE3+=vel3;
					
						if (posXE3==30) {
							vel3=vel3*-1;
						}
						if (posXE3==540) {
							vel3=vel3*-1;
						}
						
			     	//4
						
						posYE4+=vel;
						
						if (posYE4==210) {
							vel4=vel4*-1;
						}
						if (posYE4==360) {
							vel4=vel4*-1;
						}
					
					
						
					    //Coordenadas en la matriz de la posicion del pacman 
					    int fila = posY/30;
					    int columna = posX/30;
					    int estadoFuturo = -1;
					    
					    
					    //Consultar en la matriz el valor futuro
					    
					    //movimiento
					    if(timeStart==true) {
					    
					    if(velx == 30){
					      if(columna+1 < 20) estadoFuturo = matrix[fila][columna+1];
					      else estadoFuturo = matrix[fila][0];
					    }else if(velx == -30){
					       if(columna-1 >= 0) estadoFuturo = matrix[fila][columna-1];
					       else estadoFuturo = matrix[fila][19];
					    }else if(vely == 30){
					      if(fila+1 < 20) estadoFuturo = matrix[fila+1][columna];
					      else estadoFuturo = matrix[0][columna];
					    }else if(vely == -30){
					      if(fila-1 >= 0) estadoFuturo = matrix[fila-1][columna];
					      else estadoFuturo = matrix[19][columna];
					    }
					    }
					    
					    
					    //posicion en la matriz de los enemigos
					    
					    int filaE = posYE/30;
					    int columnaE = posXE/30;
					    matrix[filaE][columnaE]=1;
					    if(vel>0) {
					    	matrix[filaE-1][columnaE]=0;
						    }
						    if(vel3<0) {
						    	matrix[filaE+1][columnaE]=0;
							    }
						    
					    
					    int filaE2 = posYE2/30;
					    int columnaE2= posXE2/30;
					    matrix[filaE2][columnaE2]=1;
					    if(vel2>0) {
					    	matrix[filaE2][columnaE2-1]=0;
						    }
						    if(vel3<0) {
						    	matrix[filaE2][columnaE2+1]=0;
							    }
					    
					    int filaE3 = posYE3/30;
					    int columnaE3 = posXE3/30;
					    matrix[filaE3][columnaE3]=1;
					    if(vel3>0) {
					    	matrix[filaE3][columnaE3-1]=0;
					    }
					    if(vel3<0) {
					    	matrix[filaE3][columnaE3+1]=0;
						    }
					    
					    
					    int filaE4 = posYE4/30;
					    int columnaE4 = posXE4/30;
					    matrix[filaE][columnaE4]=1;
					    if(vel4>0) {
					    	matrix[filaE4-1][columnaE4]=0;
						    }
						    if(vel3<0) {
						    	matrix[filaE4+1][columnaE4]=0;
							    }
					     
					    
					    
					    
					    //posicion en la matriz de los objetos(recogibles)
						    
						    //objeto1
						    if(dot1==true) {
						    	 int filaOB= posYO/30;
								    int columnaOB = posXO/30;
								    matrix[filaOB][columnaOB]=2;  
						    }
						    if(dot1==false) {
						    	 int filaOB= posYO/30;
								    int columnaOB = posXO/30;
								    matrix[filaOB][columnaOB]=0;  
						    }
					   
					    //objeto2
						    if(dot2==true) {
					    int filaOB1= posYO1/30;
					    int columnaOB1 = posXO1/30;
					    matrix[filaOB1][columnaOB1]=2;
						    }
						    if(dot2==false) {
						    	 int filaOB= posYO/30;
								    int columnaOB = posXO/30;
								    matrix[filaOB][columnaOB]=0;  
						    }
					    //objeto3
						    if(dot3==true) {
					    int filaOB2= posYO2/30;
					    int columnaOB2 = posXO2/30;
					    matrix[filaOB2][columnaOB2]=2;
						    }
						    
						    if(dot3==false) {
						    	 int filaOB= posYO/30;
								    int columnaOB = posXO/30;
								    matrix[filaOB][columnaOB]=0;  
						    }
					    
					    
					    
					    //Estado futruo del pacman y que hacer en cada caso
						    
					    switch(estadoFuturo){
					      case 0:
					        posX+=velx;
					        posY+=vely;
					        break;
					        
					      case 1: 
					       loseScreen=true;
					       timeStart=false;
					        break;
					        
					      case 2:
					          posX += velx;
					          posY += vely;
					          matrix[posX/30][posY/30] = 0;
					          
					          if(posX==180&&posY==210){
					        	  
					        	  dot1=false;
					          }
					          
					          if(posX==210&&posY==390){
					        	  
					        	  dot2=false;
					          }
					          
					          if(posX==450&&posY==450){
					        	  
					        	  dot3=false;
					          }
					  
					    
					          println("-------------punto---------------");
					          puntos++;
					          
					          if(puntos>=3) {
					        	timeStart=false;
					        	  winScreen=true;
					        	  
					          }
					         

					          break;

					    }
					    
					    
					    //continuar de un lado al otro (en la matriz)
					    if(posX>585) posX=30;
					    if(posX<0) posX = 570;
					    if(posY>585) posY =30;
					    if(posY<0) posY = 570;
					    
					    
					    
					 
					  }
				
				
		
				//instrucciones
				if(htp==true) {
					image (howto,92,100);
				}
				if (mouseX>250 && mouseX<385 && mouseY>480 && mouseY<530 && screen==1 && mousePressed==true &&htp==true) {
			    htp=false;
			    timeStart=true;
			   
			    
				} 
				
				//ganar
				
				if (winScreen==true && mouseX>250 && mouseX<385 && mouseY>380 && mouseY<430 && screen==1 && mousePressed==true) {			
					screen=0;
					
				} 
				
				
				//perder
				if (loseScreen==true && mouseX>250 && mouseX<385 && mouseY>380 && mouseY<430 && screen==1 && mousePressed==true) {			
					screen=0;
					
					
				} 
				
				//condiciones para reiniciar
				
				if(screen==0) {
					reset=true;
				}
				if (screen==1) {
					reset=false;
				}
				
				
				
				
				//reiniciar
				
				if(reset==true) {
				posXO=180;
				posXO1=210;
				posXO2=450;
				posYO=210;
				posYO1=390;
				posYO2=450;
				
				
				puntos=0;
				time=0;
				dot1=true;
				dot2=true;
				dot3=true;
				timeStart=false;
				posX=0;
				posY=0;
				winScreen=false;
				loseScreen=false;
				htp=true;
				matrix[0][0]=0;
				velx = 30;
				 vely = 0;
				}
				
				break;
				
				
				//puntajes
				
		  case 2:
			//	scores.loadPixels();
				image (scores,0,0);
				if (mouseX<95 && mouseY<660 && mouseY>600 && mousePressed==true) {
					screen=0;
		}
				break;
		} 
	}
	
	
		//contro del pacman con las flechas
	
	public void keyPressed() {
		
		
		if(timeStart==true) {
			
			
			
			if(keyCode==UP) {
				
				m1=7;
				vely = -30;
				velx = 0;
		}
		if(keyCode==DOWN) {
			m1=3;
			   vely = 30;
			  velx = 0;
			
				
			
		}
		if(keyCode==RIGHT) {
			
			m1=1;	
			velx = 30;
			   vely = 0;
			
		}			
		if(keyCode==LEFT) {
			m1=5;
				 velx = -30;
			  vely = 0;
			
		}
			
			
		}
		
		}
	
	
	}
	
	
			
	



