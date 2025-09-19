import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {
  public void paintBackground (String color) {
    setPaint(12*14);
    for(int i = 0; i<11; i++) {  
      while(canMove()){
        paint(color);
        move();
      }
      if(i%2==0) {
        paint(color);
        turnRight();
        move();
        paint(color);
        turnRight();
      }
      else {
        paint(color);
        turnLeft();
        move();
        paint(color);
        turnLeft();
      }
    }
  }
}