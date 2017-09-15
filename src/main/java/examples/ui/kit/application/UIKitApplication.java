package examples.ui.kit.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.Button;
import com.harium.etyl.ui.Slider;
import com.harium.etyl.ui.label.TextLabel;

public class UIKitApplication extends Application {

    public UIKitApplication(int w, int h) {
        super(w, h);
    }

    public void load() {
        Button button = new Button(20, 60, 90, 40);
        button.setLabel(new TextLabel("BUTTON"));

        Button disabledButton = new Button(120, 60, 90, 40);
        disabledButton.setLabel(new TextLabel("BUTTON"));
        disabledButton.setDisabled(true);

        Slider slider = new Slider(20, 110, 190, 30);

        UI.add(button);
        UI.add(disabledButton);
        UI.add(slider);
    }

    @Override
    public void draw(Graphics g) {

    }

}

