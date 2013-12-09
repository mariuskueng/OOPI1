public class Rectangle extends Figure{
  private int height, width;
  
  public Rectangle(int x, int y, int h, int w){
    super(x,y);
    height=h;
    width= w;
  }
  
  @Override
  public void moveIt(){
//    x= x+(int)random(-2,2);
    y= y+(int)random(-2,2);
  }
    
  @Override
  public void print(){
    setColor();
    rect(x,y,height, width);
  }
  @Override
  public int getVolume(){
    return (int)(height*width);
  }
}
