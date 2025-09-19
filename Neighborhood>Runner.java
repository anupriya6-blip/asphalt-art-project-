import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  BackgroundPainter priya  = new BackgroundPainter();
    priya.paintBackground("LightPink");
  
    FramePainter fp = new FramePainter();
    fp.paintFrame("red");

    HeartPainter hp = new HeartPainter();
    hp.paintHeart("red");

    
  }
}