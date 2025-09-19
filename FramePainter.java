import org.code.neighborhood.*;
public class FramePainter extends PainterPlus{
  public void paintFrame (String color){
    setPaint(12*4);
    while(canMove()){
      paint(color);
      move();
      if(!canMove()){
        paint(color);
        turnRight();
      }
      if(!hasPaint()) {
        break;
      }
    }
  }
    

}