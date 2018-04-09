package examples.etyl.gui.chat;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.Action;
import com.harium.etyl.commons.event.GUIEvent;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.Button;
import com.harium.etyl.ui.ScrollView;
import com.harium.etyl.ui.TextField;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.label.TextLabel;
import com.harium.etyl.ui.panel.TextPanel;


public class ChatWindow extends Application {

    public ChatWindow(int w, int h) {
        super(w, h);
    }

    private TextPanel panel;

    private TextField tf;

    private String username = "Person";
    private String friendname = "Friend";

    @Override
    public void load() {

        ScrollView rollerPanel = new ScrollView(20, 20, 300, 240);

        panel = new TextPanel(300, 240);
        rollerPanel.setComponent(panel);

        UI.add(rollerPanel);

        tf = new TextField(20, 280, 200, 20);
        UI.add(tf);

        Button button = new Button(tf.getX() + tf.getW() + 10, tf.getY(), 90, tf.getH());
        button.setLabel(new TextLabel("Send!"));
        button.addAction(GUIEvent.MOUSE_LEFT_BUTTON_UP, new Action(this, "sendMsg"));
        UI.add(button);

        loading = 100;
    }

    public void sendMsg() {
        panel.addLine(username + ": " + tf.getText());
        tf.clearField();
    }

    @Override
    public void updateKeyboard(KeyEvent event) {

        if (event.isKeyDown(KeyEvent.VK_1)) {
            panel.addLine(friendname + ": Hi");
        }

        if (event.isKeyDown(KeyEvent.VK_2)) {
            panel.addLine(friendname + ": Hello");
        }

        if (event.isKeyDown(KeyEvent.VK_3)) {
            panel.addLine(friendname + ": How are you?");
        }

        if (event.isKeyDown(KeyEvent.VK_4)) {
            panel.addLine(friendname + ": I am fine, and you?");
        }

        if (event.isKeyDown(KeyEvent.VK_5)) {
            panel.addLine(friendname + ": Thank You.");
        }

        if (event.isKeyDown(KeyEvent.VK_6)) {
            panel.addLine(friendname + ": LOL :D");
        }
    }

    @Override
    public void draw(Graphics g) {

        //Drawing background

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y, w, h);
    }
}
