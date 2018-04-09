package examples.etyl.gui.textview;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.base.BaseTextView;

public class TextViewExample extends Application {

	public TextViewExample(int w, int h){
		super(w,h);
	}
		
	@Override
	public void load() {
		
		BaseTextView textView = new BaseTextView(20,30,120,40);
		textView.setText("Hello?");
		UI.add(textView);
		
		loading = 100;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(this);
	}

}
