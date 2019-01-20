package examples.etyl.dnd;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class DragAndDropExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public DragAndDropExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        DragAndDropExample app = new DragAndDropExample();
        app.setTitle("Drag and Drop Example");
        app.init();
    }

    @Override
    public Application startApplication() {
        return new DragAndDropApplication(w, h);
    }

}
