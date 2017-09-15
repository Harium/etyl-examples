package examples.etyl.gui.chat;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class ChatExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ChatExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        ChatExample app = new ChatExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new ChatWindow(w, h);
    }

}
