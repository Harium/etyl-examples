package examples.linear.arrow.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.linear.Point2D;

import java.awt.*;

public class ArrowApplication extends Application {

	private Point2D p;
	private Point2D q;
	
	public ArrowApplication(int w, int h) {
		super(w, h);
	}

	public void load() {

		p = new Point2D(100, 200);
		q = new Point2D(200, 300);
		
		loading = 100;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawArrow(p, q);
	}
	
	@Override
	public void updateMouse(PointerEvent event) {
		//dynamic position
		q.setLocation(event.getX(), event.getY());
	}

}

