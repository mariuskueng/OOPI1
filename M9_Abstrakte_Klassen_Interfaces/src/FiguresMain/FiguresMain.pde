Figure[] figures= new Figure[30];

public void setup(){
  size(400,400);
  for (int i=0; i<figures.length; i++){
    if (i%2==0){
       figures[i]= new Cyrcle((int)random(400),(int)random(400), (int)random(6,40));
    }
   else if(i%3==0){
     figures[i]= new Oval((int)random(200),(int)random(250), (int)random(6,50), (int)random(6,55));
   } 
    else {
      figures[i]= new Rectangle((int)random(400),(int)random(400), (int)random(6,40), (int)random(6,40));
    }
  }
}
public void draw(){
  background(0);
  for (int i=0; i<figures.length; i++){
    figures[i].moveIt();
    figures[i].print();
  }
}
