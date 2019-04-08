


void setup(){
size(500,500);
}

void draw(){

for(int posY = 0; posY < 100; posY = posY +10){
for (int opacidad = 255; opacidad > 0; opacidad = opacidad - 50){
    pushMatrix();
      ellipseMode(CENTER);
      translate(width/2, height/2);
      fill(230,50,opacidad);
      noStroke();
      ellipse(posY,posY, 100,100);
    popMatrix();

  }
}
}

/*int rot;

void setup(){
  size(842,595);

}

void draw(){
background(255);
rot = frameCount;
for (int p = 0; p < 960; p = p +138){
  pushMatrix();
    translate(p-69,336);
    triangulo();
  popMatrix();
}


for (int p = 0; p < 960; p = p +138){
  pushMatrix();
  rectMode(CENTER);
  translate(p, height/2);
  rotate(radians(30));
  hexagono();
  popMatrix();
}
}

void hexagono(){

  for (int i = 0; i < 360; i= i + 60){
  pushMatrix();
  fill(0);
  rotate(radians(i));
  rect(30,0,60,68);
  popMatrix();
  }
}

void triangulo(){
  fill(150,200,60);
    pushMatrix();

    rotate(radians(frameCount));
    triangle(-35, 20, 0, -36, 34, 20);
    popMatrix();

}
int blanco = 255;
int negro = 255;
int fondo = 255;

void draw(){
backgorund(fondo);
}

void keyPressed(){
  if (keyPressed) {
    if (key == 'b' || key == 'B') {
      fondo = negro;
    }
  }

  if (keyPressed) {
    if (key == 'w' || key == 'W') {
      fondo = blanco;
    }
  }
}
*/
