float sise = 50;
float sise2 = 10;
int bg = 150;

void setup()
{

	size(500,500);
	background(155, 0, 50);
}
void mouseClicked(){
	fill((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
}

void draw()
{

background(10, 150, 0);
	ellipse(mouseX,mouseY,sise,sise);
	ellipse(mouseX-10,mouseY-10,sise2,sise2);
	ellipse(mouseX+10,mouseY-10,sise2,sise2);

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

void mouseMoved(){
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

