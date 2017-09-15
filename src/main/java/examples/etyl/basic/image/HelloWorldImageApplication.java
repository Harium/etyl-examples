package examples.etyl.basic.image;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;

public class HelloWorldImageApplication extends Application {

	ImageLayer layer;

	public HelloWorldImageApplication(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		layer = new ImageLayer("logo.png");
		layer.centralize(this);

		loading = 100;
	}

	@Override
	public void draw(Graphics g) {
		layer.draw(g);
	}

}
