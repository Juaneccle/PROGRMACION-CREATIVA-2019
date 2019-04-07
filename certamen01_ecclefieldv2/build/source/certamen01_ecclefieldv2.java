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

public class certamen01_ecclefieldv2 extends PApplet {


int rot;
int rot2;
int estado;
boolean estadoFondo = true;
boolean sketch2 = false;
boolean sketch3 = false;
boolean ciclo3 = false;
boolean ciclo4 = false;
boolean ciclo1 = true;
boolean ciclo2 = false;
ClassMov_02 a;

// Colores de fondo
int blanco = 255;
int negro = 0;
int fondo = 255;

public void setup(){

a = new ClassMov_02(rot, rot2);

}

public void draw(){
  // Comprovaciones
  println(rot,rot2);
  /////////////////
  background(fondo);
  rot = frameCount;
  rot2 = rot2 + 1;
  estado = estado + 1;

  if(ciclo1 == true){
    a.diagramacion1(rot);
    a.diagramacion2(rot);
  }

  if(ciclo2 == true){
    a.diagramacion3(rot);
    a.diagramacion4(rot);
  }

  if(rot > 90){
    fondo = negro;
    ciclo1 = false;
    ciclo2 = true;

  }

  if(rot < 90 ){
    fondo = blanco;
    ciclo1 = true;
    ciclo2 = false;
  }

  if(estado > 108){
    ciclo4 = true;
    
  }

  if(estado > 240 ){
    ciclo4 = false;
    estado = 0;
  }


  if (ciclo3 == true){
    a.diagramacion5();
    //a.diagramacion6();
    fondo = blanco;
    ciclo1 = false;
    ciclo2 = false;
    sketch2 = true;
  }


  if(ciclo4 == true && sketch2 == true){
    a.diagramacion6(rot2);
  }


  if(rot > 180){frameCount = 0;}      // Resetear el contador
}



public void keyPressed(){
  if (keyPressed) {
    if (key == 'b' || key == 'B') {
      fondo = negro;
      ciclo1 = false;
      ciclo2 = true;
    }
  }

  if (keyPressed) {
    if (key == 'n' || key == 'N') {
      fondo = blanco;
      ciclo1 = true;
      ciclo2 = false;
    }
  }

  if (keyPressed) {
    if (key == 'q' || key == 'Q') {
      ciclo1 = false;
      ciclo2 = false;
      ciclo3 = true;
      sketch2 = true;

    }
  }

  if (keyPressed) {
    if (key == 'e' || key == 'E') {

      sketch3 = true;
    } else if (key == 'r' || key == 'R'){
      sketch3 = false;
    }
  }

}
class ClassMov_02{

int rot;
int rot2;

  ClassMov_02(int rot, int rot2){
    this.rot = rot;
    this.rot2 = rot2;
  }


//  PRIMERA ROTACION //
public void figura1(int rot){

  pushMatrix();
    rectMode(CENTER);
    noStroke();
    fill(0);
    rotate(radians(rot));
    rect(0, 0, 50, 50);
  popMatrix();
}


public void diagramacion1(int rot){
  for(int posY = 0; posY < 650; posY = posY + 100){
    for(int posX2 = 0; posX2 < 900; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura1(rot);
      popMatrix();
    }
  }
}

public void diagramacion2(int rot){
  for(int posY = 50; posY < 650; posY = posY + 100){
    for(int posX2 = 50; posX2 < 900; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura1(rot);
      popMatrix();

    }
  }
}



///////////////////////////////////////////////////////////////////////////////

public void figura2(int rot){
  pushMatrix();
    rectMode(CENTER);
    noStroke();
    fill(255);
    rotate(radians(rot));
    rect(0, 0, 50, 50);
  popMatrix();

}


public void diagramacion3(int rot){
  for(int posY = -50; posY < 650; posY = posY + 100){
    for(int posX2 = 0; posX2 < 900; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura2(rot);
      popMatrix();
    }
  }
}


public void diagramacion4(int rot){
  for(int posY = 0; posY < 650; posY = posY + 100){
    for(int posX2 = -50; posX2 < 900; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura2(rot);
      popMatrix();
    }
  }
}

//////////////////////////////Segundo sketch/////////////////////////////
//////////////////////////////////////////////////////////////////////////

// HEXAGONO
public void figura3(){
  for (int i = 0; i < 360; i= i + 60){
  pushMatrix();
    fill(0);
    rotate(radians(i));
    rect(30,0,60,68);
  popMatrix();
}
}

// TRIANGULO
public void figura4(int rot2){

  fill(150,200,60);
  pushMatrix();
  rotate(radians(rot2));
  triangle(-35, 20, 0, -36, 34, 20);
  popMatrix();
}

public void diagramacion5 (){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      rectMode(CENTER);
      translate(p, height/2);
      rotate(radians(frameCount+30));
      figura3();
    popMatrix();
}
}

public void diagramacion6(int rot2){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      translate(p-69,336);
      figura4(rot2);
    popMatrix();
  }
}
}
/*
// HEXAGONO
void setup(){
  size(500,500);
  background(255);
}

void draw(){

for (i = 0; i < 360; i + 40){
pushMatrix();
fill(0);
rectMode(CENTER);
translate(width/2, height/2);
rotate(radians(i));
rect(0,0,50,50);
popMatrix();
}

}
*/
  public void settings() { 
size(842,595); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "certamen01_ecclefieldv2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
