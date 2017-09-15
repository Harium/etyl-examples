package examples.images;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class GifViewer extends Etyl {

    private static final long serialVersionUID = 1L;

    public GifViewer() {
        super(800, 600);
    }

    public static void main(String[] args) {
        GifViewer app = new GifViewer();
        app.init();
    }

    @Override
    public Application startApplication() {
        // Etyl tries to find the resources in your current directory
        return new GifAnimation(w, h);
    }

}
