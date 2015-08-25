import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

float size = 50;
float size2 = 10;
int bg = 150;

public void setup()
{

	size(1000,800);
	background(155, 0, 50);
}
public void draw()
{

background(10, 150, 0);
	ellipse(mouseX,mouseY,size,size);
	ellipse(mouseX-10,mouseY-10,size2,size2);
	ellipse(mouseX+10,mouseY-10,size2,size2);

	beginShape();
	curveVertex(mouseX-20, mouseY);
	curveVertex(mouseX-20, mouseY);
	curveVertex(mouseX, mouseY+10);	
	curveVertex(mouseX+20, mouseY);
	curveVertex(mouseX+20, mouseY);
	endShape();
	/*if(size>0){
	size = size - 0.1;
	}
	if(size2>0){
	size2 = size2 - 0.05;
	}*/
	

}

public void mousePressed(){
		background(10, 0, 150);
	ellipse(mouseX,mouseY,200,200);
	ellipse(mouseX-40,mouseY-30,50,50);
	ellipse(mouseX+40,mouseY-30,50,50);

	beginShape();
	curveVertex(mouseX-50, mouseY+30);
	curveVertex(mouseX-50, mouseY+30);
	curveVertex(mouseX, mouseY);	
	curveVertex(mouseX+50, mouseY+30);
	curveVertex(mouseX+50, mouseY+30);
	endShape();



}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
