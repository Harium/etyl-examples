package examples.fx.application;

import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.animation.script.complex.StretchAndBackVertical;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;

import java.awt.*;

public class StretchApplication extends Application {

	private StretchAndBackVertical animation;

	private int surfaceY = 327;
	private ImageLayer layer;

	public StretchApplication(int w, int h) {
		super(w,h);
	}

	@Override
	public void load() {
		layer = new ImageLayer(300,surfaceY-27,"blue_ninja.png");

		animation = new StretchAndBackVertical(layer, 1200);
		animation.setInterval(1, 1.15);

		Animation.getInstance().add(animation);
	}

	@Override
	public void draw(Graphics g) {
		layer.draw(g);

		g.setColor(Color.BLACK);
		g.drawLine(300, surfaceY, 300+layer.getW(), surfaceY);
	}

}
