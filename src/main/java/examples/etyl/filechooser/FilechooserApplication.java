package examples.etyl.filechooser;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.MouseEvent;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.filechooser.FileChooser;
import com.harium.etyl.util.PathHelper;

public class FilechooserApplication extends Application {


    private FileChooser fileChooser;

    public FilechooserApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        fileChooser = new FileChooser(w, h, PathHelper.currentDirectory());
        fileChooser.setRectWidth(w / 2);
        fileChooser.show();

        loading = 100;
    }

    @Override
    public void updateMouse(PointerEvent event) {
        if (!fileChooser.isVisible()) {
            if (event.isButtonDown(MouseEvent.MOUSE_BUTTON_LEFT)) {
                fileChooser.show();
            }
        } else {
            fileChooser.updateMouse(event);
        }
    }

    @Override
    public void draw(Graphics g) {
        fileChooser.draw(g);
    }

}
