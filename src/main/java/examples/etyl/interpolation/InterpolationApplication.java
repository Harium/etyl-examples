package examples.etyl.interpolation;

import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.animation.script.HorizontalAnimation;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.commons.interpolation.Interpolator;
import com.harium.etyl.commons.interpolation.LinearInterpolator;
import com.harium.etyl.commons.interpolation.QuadraticInterpolator;
import com.harium.etyl.commons.interpolation.RadialInterpolator;
import com.harium.etyl.commons.interpolation.ReverseQuadraticInterpolator;
import com.harium.etyl.commons.layer.Layer;

public class InterpolationApplication extends Application {

	public InterpolationApplication(int w, int h) {
		super(w, h);
	}
	
	HorizontalAnimation rightLinearScript;
	HorizontalAnimation leftLinearScript;

	HorizontalAnimation rightQuadraticScript;
	HorizontalAnimation leftQuadraticScript;

	HorizontalAnimation rightRadialScript;
	HorizontalAnimation leftRadialScript;

	HorizontalAnimation rightReverseQuadraticScript;
	HorizontalAnimation leftReverseQuadraticScript;
		
	private Layer linearBall;
	private Layer quadraticBall;
	private Layer radialBall;
	private Layer reverseQuadraticBall;
	
	@Override
	public void load() {
		
		loading = 10;
		
		linearBall = new Layer(40, 80, 30, 30);
		quadraticBall = new Layer(40, 120, 30, 30);
		radialBall = new Layer(40, 160, 30, 30);
		reverseQuadraticBall = new Layer(40, 200, 30, 30);
				
		leftLinearScript = createLeftScript(linearBall, new LinearInterpolator());
		rightLinearScript = createRightScript(linearBall, new LinearInterpolator());
		rightLinearScript.addNext(leftLinearScript);
		leftLinearScript.addNext(rightLinearScript);
		
		Interpolator quadraticInterpolator = new QuadraticInterpolator();
		
		leftQuadraticScript = createLeftScript(quadraticBall, quadraticInterpolator);
		rightQuadraticScript = createRightScript(quadraticBall, quadraticInterpolator);
		rightQuadraticScript.addNext(leftQuadraticScript);
		leftQuadraticScript.addNext(rightQuadraticScript);
		
		Interpolator radialInterpolator = new RadialInterpolator();
		
		leftRadialScript = createLeftScript(radialBall, radialInterpolator);
		rightRadialScript = createRightScript(radialBall, radialInterpolator);
		rightRadialScript.addNext(leftRadialScript);
		leftRadialScript.addNext(rightRadialScript);
		
		Interpolator reverseQuadraticInterpolator = new ReverseQuadraticInterpolator();
		
		leftReverseQuadraticScript = createLeftScript(reverseQuadraticBall, reverseQuadraticInterpolator);
		rightReverseQuadraticScript = createRightScript(reverseQuadraticBall, reverseQuadraticInterpolator);
		rightReverseQuadraticScript.addNext(leftReverseQuadraticScript);
		leftReverseQuadraticScript.addNext(rightReverseQuadraticScript);

		Animation.getInstance().add(rightLinearScript);
		Animation.getInstance().add(rightQuadraticScript);
		Animation.getInstance().add(rightRadialScript);
		Animation.getInstance().add(rightReverseQuadraticScript);
		
		loading = 100;
	}

	protected HorizontalAnimation createRightScript(Layer target, Interpolator interpolator) {
		HorizontalAnimation rightScript = new HorizontalAnimation(target, 3000);
		rightScript.setInterval(40, 640);
		rightScript.setInterpolator(interpolator);
		return rightScript;
	}

	protected HorizontalAnimation createLeftScript(Layer target, Interpolator interpolator) {
		HorizontalAnimation leftScript = new HorizontalAnimation(target, 3000);
		leftScript.setInterval(640, 40);
		leftScript.setInterpolator(interpolator);
		return leftScript;
	}
	
	@Override
	public void draw(Graphics g) {
		drawBall(g, linearBall);
		drawBall(g, quadraticBall);
		drawBall(g, radialBall);
		drawBall(g, reverseQuadraticBall);
	}

	protected void drawBall(Graphics g, Layer ball) {
		g.setColor(Color.RED);
		g.fillOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
		g.setColor(Color.BLACK);
		g.drawOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
	}
		
}