package examples.etyl.customloading.application;

import java.awt.Font;

import com.harium.etyl.commons.context.load.GenericLoadApplication;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.theme.Theme;
import com.harium.etyl.ui.theme.ThemeManager;

public class YellowLoading extends GenericLoadApplication {

	private Font f;
	
	private Font p;
		
	public YellowLoading(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		Theme theme = ThemeManager.getInstance().getTheme();
		
		f = new Font(theme.getFontName(), theme.getFontStyle(), 26);
		p = new Font(theme.getFontName(), theme.getFontStyle(), 18);
	}
	
	private float rectW = w*2/3;
	private float rectX = w/2-rectW/2;
	private float rectY = h/2+100;
	private float rectH = 32;

	private Color backgroundColor = new Color(0xff,0xcc,0x0);
	
	@Override
	public void draw(Graphics g) {

		g.setFont(f);
		
		g.setColor(backgroundColor);
		g.fillRect(0, 0, w, h);
		
		g.setColor(Color.WHITE);
		g.drawStringShadowX(phrase, 280-y);

		g.drawRect(rectX, rectY, rectW, rectH);
		g.fillRect(rectX+2, rectY+2, (int)((rectW*fill)/100)-3, rectH-3);
		
		g.setFont(p);
		g.drawStringShadow(percent, rectX, rectY, rectW, rectH, Color.BLACK);
		
	}
	
}
