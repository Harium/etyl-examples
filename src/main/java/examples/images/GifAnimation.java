package examples.images;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.context.UpdateIntervalListener;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.loader.image.ImageFrame;
import com.harium.etyl.loader.image.ImageLoader;

import java.util.List;

public class GifAnimation extends Application implements UpdateIntervalListener {

    public GifAnimation(int w, int h) {
        super(w, h);
    }

    private List<ImageFrame> frames;

    @Override
    public void load() {

        loading = 10;

        frames = ImageLoader.getInstance().getAnimation("shark.gif");

        updateAtFixedRate(frames.get(0).getDelay(), this);

        loading = 100;
    }

    private int count = 0;

    public void timeUpdate(long now) {
        count++;
        count %= frames.size();
    }

    @Override
    public void draw(Graphics g) {

        g.drawImage(frames.get(count).getImage(), 0, 0);

    }
}
