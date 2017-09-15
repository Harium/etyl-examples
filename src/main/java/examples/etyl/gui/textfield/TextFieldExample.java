package examples.etyl.gui.textfield;


import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.TextField;
import com.harium.etyl.ui.UI;

public class TextFieldExample extends Application {

    public TextFieldExample(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        TextField field = new TextField(120, 120, 100, 32);
        UI.add(field);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        /*g.setColor(Color.RED);
		g.fillRect(x, y, w, h);*/
    }

}
