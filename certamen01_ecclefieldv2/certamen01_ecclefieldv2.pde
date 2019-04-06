
int rot;
boolean ciclo1 = true;
boolean ciclo2 = false;
ClassMov_02 a;

// Colores de fondo
int blanco = 255;
int negro = 0;
int fondo = 255;

void setup(){
size(842,595);
a = new ClassMov_02(rot);

}

void draw(){
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


void keyPressed(){
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
