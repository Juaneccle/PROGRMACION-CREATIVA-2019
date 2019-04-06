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


int rotX;

ClassMov_02 a;


public void setup(){

a = new ClassMov_02(rotX);

}

public void draw(){

  background(255);

  a.diagramacion1();
  a.diagramacion2();
}
class ClassMov_02{

int rotX;


  ClassMov_02(int rotX){
    this.rotX = rotX;
  }


//  PRIMERA ROTACION //

public void diagramacion1(){
  for(int posY = 0; posY < height; posY = posY + 90){
    for(int posX2 = 0; posX2 < 842; posX2 = posX2 + 90){
      pushMatrix();
      translate(posX2,posY);
      figura1();
      popMatrix();
    }
  }
}

public void diagramacion2(){
  for(int posY = 45; posY < height; posY = posY + 90){
    for(int posX2 = 45; posX2 < 842; posX2 = posX2 + 90){
      pushMatrix();
      translate(posX2,posY);
      figura1();
      popMatrix();

    }
  }
}

public void figura1(){

  pushMatrix();
    rectMode(CENTER);
    stroke(0);
    fill(120,150,80);
    rotate(radians(frameCount));
    rect(0, 0, 45, 45);
  popMatrix();
}

///////////////////////////////////////////////////////////////////////////////

public void figura2(){
  pushMatrix();
    rectMode(CENTER);
    stroke(0);
    fill(120,150,80);
    rotate(radians(frameCount));
    rect(0, 0, 45, 45);
  popMatrix();



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
