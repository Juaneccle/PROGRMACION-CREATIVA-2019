class ClassMov_02{

int rot;


  ClassMov_02(int rot){
    this.rot = rot;
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
  for(int posY = 0; posY < height; posY = posY + 100){
    for(int posX2 = 0; posX2 < 842; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura1(rot);
      popMatrix();
    }
  }
}

void diagramacion2(int rot){
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
  for(int posY = -50; posY < height; posY = posY + 100){
    for(int posX2 = 0; posX2 < 842; posX2 = posX2 + 100){
      pushMatrix();
      translate(posX2,posY);
      figura2(rot);
      popMatrix();
    }
  }
}


void diagramacion4(int rot){
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
