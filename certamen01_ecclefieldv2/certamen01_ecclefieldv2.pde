
int rot;
int rot2;
float rot3;
float rot4;

float estado;
float estadoRect;

boolean sketch1 = true;
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

void setup(){
size(842,595);
a = new ClassMov_02(rot, rot2, rot3, rot4);

}

void draw(){
  // Comprovaciones
  println(rot,rot2, estado);
  /////////////////
  background(fondo);
  rot = frameCount;
  rot2 = rot2 + 1;
  rot3 = rot3 + 0.75;
  rot4 = rot4 + 1;
  estado = estado + 1;
  estadoRect = estadoRect + 0.6;

if (sketch1 == true){

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
}

//////////////////////////// SEGUNDO SKETCH /////////////////////////////////

if (sketch2 == true){


  if(estado > 108){
    ciclo4 = true;
}

  if(estado > 238 ){
    ciclo4 = false;
    estado = 0;
  }


  if (sketch2 == true){
    a.diagramacion5(rot4);
    //a.diagramacion6();
    fondo = blanco;
    ciclo1 = false;
    ciclo2 = false;
    sketch2 = true;
  }


  if(ciclo4 == true && sketch2 == true){
    a.diagramacion6(rot2);
    a.diagramacion7(rot2);
    a.diagramacion8(rot3);

  }

}
  if(rot > 180){frameCount = 0;}      // Resetear el contador
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

  if (keyPressed) {
    if (key == 'q' || key == 'Q') {
      sketch1 = false;
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
