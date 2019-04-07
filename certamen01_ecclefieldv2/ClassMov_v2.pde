class ClassMov_02{

int rot;
float rot2;
float rot3;
float rot4;

  ClassMov_02(int rot, float rot2, float rot3, float rot4){
    this.rot = rot;
    this.rot2 = rot2;
    this.rot3 = rot3;
    this.rot4 = rot4;
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
void figura4(float rot2){
  stroke(0);
  fill(255);
  pushMatrix();
    triangle(-35, 20, 0, -36, 34, 20);
  popMatrix();
}

void figura5(float rot2){
  stroke(0);
  fill(255);
  pushMatrix();
    rotate(radians(rot2));
    triangle(-35, 20, 0, -36, 34, 20);
  popMatrix();
}

void figura6(float rot3){
  stroke(0);
  fill(255);
  pushMatrix();
    rectMode(CENTER);
    rotate(radians(rot3));
    rect(0,0,68,68);
  popMatrix();
}

void figura7(float rot3){
  stroke(0);
  fill(0);
  pushMatrix();
    rectMode(CENTER);
    rotate(radians(rot3));
    rect(0,0,68,68);
  popMatrix();
}

void diagramacion5 (float rot4){
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

void diagramacion6(float rot2){
  for(int posY = -81; posY < 650; posY = posY + 180){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      translate(p-69,posY+50);
      rotate(radians(rot2+60));
      figura4(rot2);
    popMatrix();
  }
}
}

void diagramacion7(float rot2){
  for(int posY = 10; posY < 650; posY = posY + 170){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      translate(p-69,posY+50);
      figura5(rot2);
    popMatrix();
  }
}
}

void diagramacion8(float rot3){

  for(int posY = 95; posY < 650; posY = posY + 190){
  for (int p = 0; p < 960; p = p +138){
    pushMatrix();
      translate(p,posY);
      figura6(rot3);
    popMatrix();
  }
}
}

void diagramacion9(float rot3){

  for(int posY = 95; posY < 650; posY = posY + 190){
  for (int p = -70; p < 960; p = p +138){
    pushMatrix();
      translate(p,posY);
      figura7(rot3);
    popMatrix();
  }
}
}

}
