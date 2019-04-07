class ClassMov_02{

int rot;
int rot2;

  ClassMov_02(int rot, int rot2){
    this.rot = rot;
    this.rot2 = rot2;
  }


//  PRIMERA ROTACION //
void figura1(int rot){

  pushMatrix();
    rectMode(CENTER);
    noStroke();
    fill(0);
    rotate(radians(rot));
    rect(0, 0, 50, 50);
  popMatrix();
}


void diagramacion1(int rot){
  for(int posY = 0; posY < 650; posY = posY + 100){
    for(int posX2 = 0; posX2 < 900; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura1(rot);
      popMatrix();
    }
  }
}

void diagramacion2(int rot){
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

void figura2(int rot){
  pushMatrix();
    rectMode(CENTER);
    noStroke();
    fill(255);
    rotate(radians(rot));
    rect(0, 0, 50, 50);
  popMatrix();

}


void diagramacion3(int rot){
  for(int posY = -50; posY < 650; posY = posY + 100){
    for(int posX2 = 0; posX2 < 900; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura2(rot);
      popMatrix();
    }
  }
}


void diagramacion4(int rot){
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
void figura3(){
  for (int i = 0; i < 360; i= i + 60){
  pushMatrix();
    fill(0);
    rotate(radians(i));
    rect(30,0,60,68);
  popMatrix();
}
}

// TRIANGULO
void figura4(int rot2){

  fill(150,200,60);
  pushMatrix();
  rotate(radians(rot2));
  triangle(-35, 20, 0, -36, 34, 20);
  popMatrix();
}

void diagramacion5 (){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      rectMode(CENTER);
      translate(p, height/2);
      rotate(radians(frameCount+30));
      figura3();
    popMatrix();
}
}

void diagramacion6(int rot2){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      translate(p-69,336);
      figura4(rot2);
    popMatrix();
  }
}
}
