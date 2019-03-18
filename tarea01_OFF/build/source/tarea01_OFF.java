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

public class tarea01_OFF extends PApplet {


ClassTar a;
int h;
int v;
float r = random(255);
float g = random(255);
float b = random(255);

public void setup( ) {
  frameRate(30);
  
  a = new ClassTar(10,50, h, v, r, g, b);
}

public void draw(){
  println(h);
  h ++;
  v ++;
  if(h > 50){
    h = 0;
    v = 0;
  }
  background(200,100,100);
  for (int i = 22; i < width; i = i+50) {
  for (int j = 22; j < height; j = j+50) {
      a.pintura(r,g,b);
      a.figura(i,j,h,v);


  }
}
for (int posX = 0; posX < width; posX = posX+50) {
  for (int posY = 0; posY < height; posY = posY+50) {

    a.cuadrado(posY,posX,h-50,v-50);
    }
  }
}
class ClassTar{

int i, posX;
int j, posY;
float r,g,b;
int h;
int v;

  ClassTar(int j,int i, int h, int v, float r, float g, float b){
    this.i = i;
    this.j = j;
    this.h = h;
    this.r = r;
    this.g = g;
    this.b = b;

  }


  public void figura(int i, int j, int h, int v){
    ellipse(i,j,h,v);
  }

  public void cuadrado(int posY, int posX, int h, int v){
    rectMode(CENTER);
    noStroke();
    rect(posX,posY,h,v);

  }

    public void pintura(float r, float g, float b){
      fill(r,g,b);


    }
}
  public void settings() {  size(842,595); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "tarea01_OFF" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
