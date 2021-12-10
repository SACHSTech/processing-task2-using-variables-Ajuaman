import processing.core.PApplet;

public class Sketch extends PApplet {
	
	// BASE DIEMSIONS USED TO CALCULATE DOOR POSITION
	int baseX = 200;
	int baseY = 400;
	
	public void settings() {
	   size(200, 500);
	}
	  
	public void setup() {
	   background(210, 255, 173);
	   strokeWeight(5);
	}

	public void draw() {
		
	   // BASE OF THE HOUSE
	   fill(138, 132, 127);
	   rect(width/3, (float) (height/1.5), width/3, height/4);
	   // DOOR
	   fill(118, 156, 145);
	   rect((float) (width/2.142), (float) (height / 1.2), width/20, height/12);
		
	   // ROOF
	   fill(44, 245, 188);
	   triangle((width/6), (float) (height/1.5), (width/2), (float) (height/7.5), (float) (width/1.2), (float) (height/1.5));
		
	   // WINDOWS
	   fill(255);
	   ellipse((float) (width/1.71), (float) (height/1.33), width/20, height/20);
	   ellipse((float) (width/2.4), (float) (height/1.33), width/20, height/20);
		
	   line(width/2, height/2, (float) (width/3.75), height/2);
	   line(width/2, height/3, (float) (width/2.69), height/3);
	   
	   // GROUND
	   fill(94, 219, 98);
	   rect(0, (float) (height/1.09), width, height/6);
	   	   
	   fill(242, 255, 59);
	   ellipse(0, 0, width/6, height/6);
	}
}