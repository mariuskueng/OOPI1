public class Cyrcle extends Figure{
  private int radius;
  
  public Cyrcle(int x, int y, int r){
    super(x,y);
    radius= r;
  }
  
  @Override
  public void moveIt(){
    x= x+(int)random(-2,2);
//    y= y+(int)random(-2,2);
  }
  
  @Override
  public void print(){
    setColor();
    ellipse(x,y,radius, radius);
  }
  
  @Override
  public int getVolume(){
    return (int)(PI*radius*radius);
  }
  
}
