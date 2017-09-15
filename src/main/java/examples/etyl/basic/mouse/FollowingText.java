package examples.etyl.basic.mouse;

import java.awt.Color;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.TextLayer;

public class FollowingText extends Application{

	private TextLayer text = new TextLayer("Text!");

	public FollowingText(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		
		text.setBorder(true);
		text.setBorderColor(Color.BLACK);
		text.setBorderWidth(3f);
		
		text.setColor(Color.WHITE);
		
		loading = 100;
	}
	
	@Override
	public void updateMouse(PointerEvent event) {
		text.setLocation(event.getX(), event.getY());
	}
	
	@Override
	public void draw(Graphics g) {
		//Drawing background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x,y,w,h);
		
		//Drawing text		
		text.draw(g);
	}

	
}
