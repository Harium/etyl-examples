package examples.etyl.animation.hello;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.interpolation.Interpolator;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;

public class HelloWorldAnimated extends Application {

    public HelloWorldAnimated(int w, int h) {
        super(w, h);
    }

    private ImageLayer hello;

    @Override
    public void load() {
        loadingInfo = "Loading images...";

        hello = new ImageLayer("hello.png");
        hello.centralizeX(0, w);
        hello.centralizeY(0, h);

        loadingInfo = "Loading animations...";
        loading = 50;

        Animation.animate(hello).scale().during(10000).from(0.1f).to(1)
                .interpolate(Interpolator.REVERSE_QUADRATIC)
                .and().rotate().during(5000).from(0).to(360).twice().start();
    }

    @Override
    public void draw(Graphics g) {
        hello.draw(g);
    }

}
