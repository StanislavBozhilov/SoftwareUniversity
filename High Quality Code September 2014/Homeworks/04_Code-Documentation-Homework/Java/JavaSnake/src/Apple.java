import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Class Apple have some methods which
 */
public class Apple {
	public static Random randomGenerator;
	private Point appleObject;
	private Color snakeColor;
	
	public Apple(Snake s) {
		appleObject = createApple(s);
		snakeColor = Color.RED;
	}
	
	private Point createApple(Snake s) {
		randomGenerator = new Random();
		int x = randomGenerator.nextInt(30) * 20;
		int y = randomGenerator.nextInt(30) * 20;
		for (Point snakePoint : s.snakeBody) {
			if (x == snakePoint.getX() || y == snakePoint.getY()) {
				return createApple(s);
			}
		}
		return new Point(x, y);
	}
	
	public void drawApple(Graphics g){
		appleObject.drawAnimal(g, snakeColor);
	}	
	
	public Point getPoint(){
		return appleObject;
	}
}