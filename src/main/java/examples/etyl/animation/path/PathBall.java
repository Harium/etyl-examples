package examples.etyl.animation.path;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.commons.interpolation.Interpolator;
import com.harium.etyl.commons.layer.Layer;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.graphics.Graphics;

public class PathBall extends Application {

	public PathBall(int w, int h) {
		super(w, h);
	}

	private Layer ball;

	@Override
	public void load() {
		
		loading = 10;

		ball = new Layer(400, 200, 30, 30);
	
		int duration = 2000;

		Animation.animate(ball).interpolate(Interpolator.LINEAR)
				.move(duration).from(40, 80).to(280, 280).then()
				.move(duration).to(300, 180).then()
				.move(duration).to(100, 280).then()
				.move(duration).to(40, 80).start();

		loading = 100;
	}
	
	@Override
	public void draw(Graphics g) {
		drawBall(g, ball);
	}

	protected void drawBall(Graphics g, Layer ball) {
		g.setColor(Color.RED);
		g.fillOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
		g.setColor(Color.BLACK);
		g.drawOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
	}

}