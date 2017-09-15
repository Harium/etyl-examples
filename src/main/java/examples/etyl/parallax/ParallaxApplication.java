package examples.etyl.parallax;

import com.harium.etyl.cinematics.parallax.ImageParallax;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.context.UpdateIntervalListener;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;

public class ParallaxApplication extends Application implements UpdateIntervalListener {
	
	private ImageParallax parallax;

	private int offset = 0;
	
	public ParallaxApplication(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {

		parallax = new ImageParallax("clouds.png");
		parallax.setProximity(2);
		
		updateAtFixedRate(10, this);
	}
	
	@Override
	public void timeUpdate(long now) {
		offset++;
		parallax.setOffset(offset);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.SKY_BLUE);
		g.fillRect(0, 0, w, h);
		
		parallax.draw(g);
	}

}
