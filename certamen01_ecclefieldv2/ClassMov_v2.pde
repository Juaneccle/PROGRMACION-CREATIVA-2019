class ClassMov_02{

int rotX;

  ClassMov_02(int rotX){
    this.rotX = rotX;

  }

void diagramacion(int rotX){

for(int i = 0; i < 360; i+=20){
  for(int j = 0; j < 842; j+=50){

     pushMatrix();
      rectMode(CENTER);
      stroke(0);
      fill(120,150,80);
      rotate(radians(frameCount));
      rect(j, 0, 45, 45);
     popMatrix();


}
}
}

}
