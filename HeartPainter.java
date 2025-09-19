import org.code.neighborhood.*;

public class HeartPainter extends PainterPlus {
    public void paintHeart(String color) {
      setPaint(12*12);
      turnRight();
      move();
      move();
      move();
      turnLeft();
      move();
      move();
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      turnLeft();
      move();
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      move();
      turnRight();
      move();
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      move();
      turnRight();
      move();
      paint(color);
      move();
      turnRight();
      move();
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      move();
      turnRight();
      move();
      paint(color);
      
      
    /*
    int line = 0;
    while(canMove()) {
      for(int i = 0; i<12; i++) {
        if(!canMove()) {
          break;
        }
        move();
      }
        if(line%2==0) {
          turnRight();
          move();
          turnRight();
        }
        else {
          turnLeft();
          move();
          turnLeft();
        }
      line++;  
      }
      */
      
  }
}