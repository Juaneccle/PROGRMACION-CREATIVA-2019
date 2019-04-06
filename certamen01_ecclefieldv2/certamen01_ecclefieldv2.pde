
int rotX;

ClassMov_02 a;


void setup(){
size(842,595);
a = new ClassMov_02(rotX);

}

void draw(){

  background(255);
  a.diagramacion(rotX);
}
