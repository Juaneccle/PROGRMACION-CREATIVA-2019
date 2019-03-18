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

public class tarea01_v2 extends PApplet {


ClassTarV2 a;


public void setup(){
a = new ClassTarV2();

}

public void draw(){

}
class ClassTarV2{


ClassTarV2(){

  
}

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "tarea01_v2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
