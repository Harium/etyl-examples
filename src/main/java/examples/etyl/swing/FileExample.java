package examples.etyl.swing;

import com.harium.etyl.awt.components.chooser.FileChooser;
import com.harium.etyl.awt.components.chooser.SelectFileListener;
import com.harium.etyl.awt.core.AWTCore;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.commons.event.MouseEvent;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;
import com.harium.etyl.layer.StaticLayer;
import com.harium.etyl.loader.image.ImageLoader;
import com.harium.etyl.util.PathHelper;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FileExample extends Application implements SelectFileListener {

    private FileChooser fc;

    public FileExample(int w, int h) {
        super(w, h);
    }

    private int px, py;

    private ImageLayer hello;

    private List<ImageLayer> layers = new ArrayList<ImageLayer>();

    @Override
    public void load() {

        loading = 10;
        hello = new ImageLayer(200, 100, "hello.png");
        loading = 100;

        Component component = (Component) session.get(AWTCore.COMPONENT);
        fc = new FileChooser(component, PathHelper.currentDirectory());
        fc.setListener(this);
    }

    @Override
    public void draw(Graphics g) {
        hello.draw(g);

        for (ImageLayer layer : layers) {
            layer.draw(g);
        }
    }

    @Override
    public void update(long now) {

        if (right) {
            hello.offsetX(1);
        }
        if (left) {
            hello.offsetX(-1);
        }

        if (down) {
            hello.offsetY(1);
        }
        if (up) {
            hello.offsetY(-1);
        }
    }

    private boolean up = false;
    private boolean down = false;

    private boolean right = false;
    private boolean left = false;

    @Override
    public void updateKeyboard(KeyEvent event) {

        if (event.isKeyDown(KeyEvent.VK_RIGHT_ARROW)) {
            right = true;
        }
        if (event.isKeyUp(KeyEvent.VK_RIGHT_ARROW)) {
            right = false;
        }

        if (event.isKeyDown(KeyEvent.VK_LEFT_ARROW)) {
            left = true;
        }
        if (event.isKeyUp(KeyEvent.VK_LEFT_ARROW)) {
            left = false;
        }

        if (event.isKeyDown(KeyEvent.VK_UP_ARROW)) {
            up = true;
        }
        if (event.isKeyUp(KeyEvent.VK_UP_ARROW)) {
            up = false;
        }

        if (event.isKeyDown(KeyEvent.VK_DOWN_ARROW)) {
            down = true;
        }

        if (event.isKeyUp(KeyEvent.VK_DOWN_ARROW)) {
            down = false;
        }
    }

    @Override
    public void updateMouse(PointerEvent event) {

        if (event.isButtonDown(MouseEvent.MOUSE_BUTTON_LEFT)) {
            px = event.getX();
            py = event.getY();
            fc.openDialog();
        }
    }

    @Override
    public void onSelectFile(String path) {
        System.out.println("Selected: " + path);

        StaticLayer image = ImageLoader.getInstance().loadImage(path, true);
        System.out.println(image.getPath());

        ImageLayer layer = new ImageLayer(px, py);
        layer.cloneLayer(image);

        layers.add(layer);
    }

    @Override
    public void onCancel() {
        System.out.println("Dialog was closed.");
    }

}
