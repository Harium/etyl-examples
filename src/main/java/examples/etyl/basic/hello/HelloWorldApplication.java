package examples.etyl.basic.hello;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;

import java.awt.*;

public class HelloWorldApplication extends Application {

    public HelloWorldApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void draw(Graphics g) {
        //Paint the background
        g.setColor(Color.BLUE);
        //this = this dice
        g.fillRect(this);
    }

    @Override
    public void load() {
        // TODO Auto-generated method stub
    }

}
