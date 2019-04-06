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
boolean ciclo1 = true;
boolean ciclo2 = false;
ClassMov_02 a;

// Colores de fondo
int blanco = 255;
int negro = 0;
int fondo = 255;

public void setup(){

a = new ClassMov_02(rot);

}

public void draw(){
  // Comprovaciones
  println(rot);
  /////////////////
  background(fondo);
  rot = frameCount;

  if(ciclo1 == true){
    a.diagramacion1(rot);
    a.diagramacion2(rot);
  }

  if(ciclo2 == true){
    a.diagramacion3(rot);
    a.diagramacion4(rot);
  }

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
}
class ClassMov_02{

int rot;


  ClassMov_02(int rot){
    this.rot = rot;
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
  for(int posY = 0; posY < height; posY = posY + 100){
    for(int posX2 = 0; posX2 < 842; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura1(rot);
      popMatrix();
    }
  }
}

public void diagramacion2(int rot){
  for(int posY = 50; posY < height; posY = posY + 100){
    for(int posX2 = 50; posX2 < 842; posX2 = posX2 + 100){
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
  for(int posY = -50; posY < height; posY = posY + 100){
    for(int posX2 = 0; posX2 < 842; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura2(rot);
      popMatrix();
    }
  }
}


public void diagramacion4(int rot){
  for(int posY = 0; posY < height; posY = posY + 100){
    for(int posX2 = -50; posX2 < 842; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura2(rot);
      popMatrix();
    }
  }
}


}
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
