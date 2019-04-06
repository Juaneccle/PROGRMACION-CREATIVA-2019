class ClassMov_02{

int rotX;


  ClassMov_02(int rotX){
    this.rotX = rotX;
  }


//  PRIMERA ROTACION //

void diagramacion1(){
  for(int posY = 0; posY < height; posY = posY + 90){
    for(int posX2 = 0; posX2 < 842; posX2 = posX2 + 90){
      pushMatrix();
      translate(posX2,posY);
      figura1();
      popMatrix();
    }
  }
}

void diagramacion2(){
  for(int posY = 45; posY < height; posY = posY + 90){
    for(int posX2 = 45; posX2 < 842; posX2 = posX2 + 90){
      pushMatrix();
      translate(posX2,posY);
      figura1();
      popMatrix();

    }
  }
}

void figura1(){

  pushMatrix();
    rectMode(CENTER);
    stroke(0);
    fill(120,150,80);
    rotate(radians(frameCount));
    rect(0, 0, 45, 45);
  popMatrix();
}

///////////////////////////////////////////////////////////////////////////////

void figura2(){
  pushMatrix();
    rectMode(CENTER);
    stroke(0);
    fill(120,150,80);
    rotate(radians(frameCount));
    rect(0, 0, 45, 45);
  popMatrix();



}
}
