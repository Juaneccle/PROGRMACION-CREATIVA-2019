
ClassTar a;
int h;
int v;
float r = random(255);
float g = random(255);
float b = random(255);

void setup( ) {
  frameRate(30);
  size(842,595);
  a = new ClassTar(10,50, h, v, r, g, b);
}

void draw(){
  println(h);
  h ++;
  v ++;
  if(h > 50){
    h = 0;
    v = 0;
  }
  background(200,100,100);
  for (int i = 22; i < width; i = i+50) {
  for (int j = 22; j < height; j = j+50) {
      a.pintura(r,g,b);
      a.figura(i,j,h,v);


  }
}
for (int posX = 0; posX < width; posX = posX+50) {
  for (int posY = 0; posY < height; posY = posY+50) {

    a.cuadrado(posY,posX,h-50,v-50);
    }
  }
}
