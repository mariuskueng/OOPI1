public class Oval extends Figure{
  private int width;
  private int height;
  
  public Oval(int x, int y, int w, int h){
    super(x,y);
    this.width = w;
    this.height = h;
  }
  
  @Override
  public void print(){
    setColor();
    ellipse(x,y,width, height);
  }
  
  @Override
  public int getVolume(){
    return (int)(PI*width*height);
  }
  
  @Override
  public void moveIt(){}
}
