public abstract class Figure{
  protected int x;
  protected int y;
  public Figure(int x, int y){
    this.x=x;
    this.y=y;
  }
  public void setColor(){
    int vol= getVolume();
    if (vol<500) {
      noStroke();
colorMode(RGB, 100);
for (int i = 0; i < 100; i++) {
  for (int j = 0; j < 100; j++) {
    fill(i, j, 0);
    point(i, j);
  }
}
      fill(0,0,255);
    }
    else if (vol<1000) {
      fill(0,255,0);
    }
    else {
      fill(255,0,0);
    }
  }
  public abstract void moveIt();
  public abstract int getVolume();
  public abstract void print();
}
