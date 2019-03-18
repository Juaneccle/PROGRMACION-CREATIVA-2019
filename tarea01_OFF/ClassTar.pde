class ClassTar{

int i, posX;
int j, posY;
float r,g,b;
int h;
int v;

  ClassTar(int j,int i, int h, int v, float r, float g, float b){
    this.i = i;
    this.j = j;
    this.h = h;
    this.r = r;
    this.g = g;
    this.b = b;

  }


  void figura(int i, int j, int h, int v){
    ellipse(i,j,h,v);
  }

  void cuadrado(int posY, int posX, int h, int v){
    rectMode(CENTER);
    noStroke();
    rect(posX,posY,h,v);

  }

    void pintura(float r, float g, float b){
      fill(r,g,b);


    }
}
