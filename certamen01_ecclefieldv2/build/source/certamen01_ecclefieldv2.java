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

// Variables para rotaciones
int rot;
float rot2;
float rot3;
float rot4;
float rot5;

// Variables para cambiar estados.
float estado;

// Booleanas para ocultar y mostrar metodos.
boolean sketch1 = false;         // Display sketch simple.
boolean sketch2 = true;          // Display sketch Complejo.

boolean ciclo3  = false;       // Ciclos que varían segun figura y fondo.
boolean ciclo4  = false;       // Ciclos que varían segun figura y fondo.
boolean ciclo1  = true;        // Ciclos que varían segun figura y fondo.
boolean ciclo2  = false;       // Ciclos que varían segun figura y fondo.

ClassMov_02 a;      // LLamar la clase

// Variables para color del fondo
int blanco = 255;
int negro = 0;
int fondo = 255;



public void setup(){
  
  a = new ClassMov_02(rot, rot2, rot3, rot4, rot5);       // LLamar al constructor y sus parametros.
}

public void draw(){

  background(fondo);
  rot = frameCount;
  rot2 = rot2 + 0.995f;        // velocidad Rotacion triangulos.
  rot3 = rot3 + 0.747f;        // velocidad Rotacion hexagonos.
  rot4 = rot4 + 1;            // velocidad Rotacion triangulos.
  rot5 = rot5 + 0.749f;        // velocidad Rotacion rectangulos.

  if(rot > 180){frameCount = 0;}      // Resetear el contador de frames ps.
  estado = estado + 0.988f;            // Contador que define el tiempo de cada ciclo.

  // Variables para definir el rango de tiempo de cada ciclo (Rotacion de las figuras y si display).

  if (sketch1 == true){             // Todo esto ocurrirá mientras el sketch 1 (Simple) este activo.
    if(ciclo1 == true){             // Estado del ciclo y display de los metodos.
      a.diagramacion1(rot);         // grilla de cuadrados negros que giran.
      a.diagramacion2(rot);         // grilla de cuadrados negros que giran.
    }

    if(ciclo2 == true){
      a.diagramacion3(rot);         // grilla de cuadrados blancos que giran.
      a.diagramacion4(rot);         // grilla de cuadrados blancos que giran.
    }

    if(rot > 90 && sketch1 == true){      // Los ciclos estan limitados por el tiempo y el angulo de rotacion.
      ciclo1 = false;                     // por lo tanto, si el objeto supera una cierta cantidad de tiempo rotando.
      ciclo2 = true;                      // se alteran los estados de los ciclos que son los que varian el display de los métodos.
      fondo = negro;                      // Estado de color del fondo.

    }

    if(rot < 90 && sketch1 == true){      // Los ciclos estan limitados por el tiempo y el angulo de rotacion.
      ciclo1 = true;                      // por lo tanto, si el objeto supera una cierta cantidad de tiempo rotando.
      ciclo2 = false;
      fondo = blanco;
    }
  }

//////////////////////////// SEGUNDO SKETCH /////////////////////////////////

  if (sketch2 == true){
    a.diagramacion5(rot4);
    ciclo1 = false;          // Cambia el estado de un ciclo a falso, desactivando el display de sus métodos.
    ciclo2 = false;          // Cambia el estado de un ciclo a falso, desactivando el display de sus métodos.
    fondo = blanco;          // Estado de color del fondo.

    if(estado > 108){         // Los ciclos estan limitados por el tiempo y el angulo de rotacion.
      ciclo4 = true;          // por lo tanto, si el objeto supera una cierta cantidad de tiempo rotando.
    }                         // se alteran los estados de los ciclos que son los que varian el display de los métodos.

    if(estado > 238 ){        // Los ciclos estan limitados por el tiempo y el angulo de rotacion.
      ciclo4 = false;         // por lo tanto, si el objeto supera una cierta cantidad de tiempo rotando.
      estado = 0;             // se alteran los estados de los ciclos que son los que varian el display de los métodos.
    }

    if(ciclo4 == true && sketch2 == true){      // condicion que maneja el displey de algunos metodos del sketch.
      a.diagramacion6(rot2);                    // Display metodo de triangulos.
      a.diagramacion7(rot2);                    // Display metodo de triangulos.
      a.diagramacion8(rot3);                    // Display metodo de rectangulos blancos.
      fondo = negro;                            // Estado de color del fondo.
    }

    if (ciclo4 == false && sketch2 == true){    // condicion que maneja el displey de algunos metodos del sketch.
      a.diagramacion9(rot5);                    // Display metodo de rectangulos negros.
      fondo = blanco;                           // Estado de color del fondo.
    }
  }
}


// Interacciones

public void keyPressed(){

// Tecla para cambiar al sketch 1 (Simple)
  if (keyPressed) {
    if (key == 'q' || key == 'Q') {
      sketch1 = true;
      sketch2 = false;

    }
  }

// Tecla para cambiar al sketch 1 (Complejo)
  if (keyPressed) {
    if (key == 'w' || key == 'W') {
      sketch1 = false;
      sketch2 = true;
    }
  }


}
class ClassMov_02{

// Variables de rotacion de la clase
int rot;
float rot2;
float rot3;
float rot4;
float rot5;

  ClassMov_02(int rot, float rot2, float rot3, float rot4, float rot5){   // Colocar los parametros que recibira el constructor
    // Indicar que estamos trabajando con estas variables y no las del sketch
    this.rot = rot;
    this.rot2 = rot2;
    this.rot3 = rot3;
    this.rot4 = rot4;
    this.rot4 = rot5;
  }


/////////////////////////////////// SKETCH SIMPLE /////////////////////////////////////////

// Rectangulos negros que rotan en su eje.
// RECTANGULOS//
public void figura1(int rot){
  pushMatrix();
    rectMode(CENTER);
    noStroke();
    fill(0);
    rotate(radians(rot));
    rect(0, 0, 50, 50);
  popMatrix();
}

// Dispocisión de los rectangulos de la figura 1.
// Se pocisionan a lo largo y ancho del sketch.
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

// Dispocisión de los rectangulos de la figura 1.
// Se pocisionan a lo largo y ancho del sketch.
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

// Rectangulos blancos que rotan en su eje.
// RECTANGULOS//
public void figura2(int rot){
  pushMatrix();
    rectMode(CENTER);
    noStroke();
    fill(255);
    rotate(radians(rot));
    rect(0, 0, 50, 50);
  popMatrix();

}

// Dispocisión de los rectangulos de la figura 2.
// Se pocisionan a lo largo y ancho del sketch.
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

// Dispocisión de los rectangulos de la figura 2.
// Se pocisionan a lo largo y ancho del sketch.
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

///////////////////////////////////////Segundo sketch///////////////////////////////////////


// hexagono negro que gira en su eje. Recibe informacion del parametro "rot3", pocisiona
// los rectangulos simulando la forma de un hexagono
// HEXAGONO //
public void figura3(){
  for (int i = 0; i < 360; i= i + 60){
  pushMatrix();
    fill(0);
    rotate(radians(i));
    rect(30,0,60,68);
  popMatrix();
}
}

// triangulos blancos que giran en su propio eje. Reciben informacion del parametro "rot2", lo que los hace girar
// TRIANGULO
public void figura4(float rot2){
  stroke(0);
  fill(255);
  pushMatrix();
    triangle(-35, 20, 0, -36, 34, 20);
  popMatrix();
}

// triangulos blancos que giran en su propio eje. Reciben informacion del parametro "rot2", lo que los hace girar
// TRIANGULO
public void figura5(float rot2){
  stroke(0);
  fill(255);
  pushMatrix();
    rotate(radians(rot2));
    triangle(-35, 20, 0, -36, 34, 20);
  popMatrix();
}

// Rectangulos blancos del segundo sketch que giran en su propio eje
// RECTANGULOS BLANCOS
public void figura6(float rot3){
  stroke(0);
  fill(255);
  pushMatrix();
    rectMode(CENTER);
    rotate(radians(rot3));
    rect(0,0,68,68);
  popMatrix();
}

// Rectangulos negros que giran en su propio eje, aparecen luego que los rectangulos blancos terinan un ciclo de rotación.
// RECTANGULOS NEGROS
public void figura7(float rot3){
  stroke(0);
  fill(0);
  pushMatrix();
    rectMode(CENTER);
    rotate(radians(rot3));
    rect(0,0,68,68);
  popMatrix();
}

// Metodo para pocisionar y repetir el hexagono en el sketch
// DIAGRAMACIÓN HEXAGONO //
  public void diagramacion5 (float rot4){
    for(int posY = 0; posY < 650; posY = posY + 190){
      for (int p = 0; p < 960; p = p +138){
        pushMatrix();
          rectMode(CENTER);
          translate(p, posY);
          rotate(radians(rot4+30));
          figura3();
        popMatrix();
      }
    }
  }

// Metodo para pocisionar y repetir los triangulos en el sketch
// DIAGRAMACIÓN triangulos //
  public void diagramacion6(float rot2){
    for(int posY = -85; posY < 650; posY = posY + 187){
      for (int p = 0; p < 960; p = p +138){
        pushMatrix();
          translate(p-69,posY+50);
          rotate(radians(rot2+60));
          figura4(rot2);
        popMatrix();
      }
    }
  }

// Metodo para pocisionar y repetir los triangulos en el sketch
// DIAGRAMACIÓN triangulos //
  public void diagramacion7(float rot2){
    for(int posY = -10; posY < 650; posY = posY + 190){
        for (int p = 0; p < 960; p = p +138){
          pushMatrix();
            translate(p-70,posY+50);
            figura5(rot2);
          popMatrix();
        }
    }
  }

  public void diagramacion8(float rot3){
    for(int posY = 95; posY < 650; posY = posY + 190){
      for (int p = 0; p < 960; p = p +138){
        pushMatrix();
          translate(p,posY);
          figura6(rot3);
        popMatrix();
  }
}
}

public void diagramacion9(float rot5){

  for(int posY = 95; posY < 650; posY = posY + 190){
  for (int p = -70; p < 960; p = p +138){
    pushMatrix();
      translate(p,posY);
      figura7(rot5);
    popMatrix();
  }
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
  public void settings() {  size(842,595); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "certamen01_ecclefieldv2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
