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
  a.diagramacion(rotX);
}
class ClassMov_02{

int rotX;

  ClassMov_02(int rotX){
    this.rotX = rotX;

  }

public void diagramacion(int rotX){

for(int i = 0; i < 360; i+=20){
  for(int j = 0; j < 842; j+=50){

     pushMatrix();
      rectMode(CENTER);
      stroke(0);
      fill(120,150,80);
      rotate(radians(frameCount));
      rect(j, 0, 45, 45);
     popMatrix();

     pushMatrix();
     rotate(radians(frameCount));
     rect(j, 0, 45, 45);
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
