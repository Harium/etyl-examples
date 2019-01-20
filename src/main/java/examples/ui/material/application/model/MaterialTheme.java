package examples.ui.material.application.model;

import com.harium.etyl.core.graphics.Font;
import com.harium.etyl.ui.base.BaseButton;
import com.harium.etyl.ui.base.BaseSlider;
import com.harium.etyl.ui.theme.base.BaseTheme;

public class MaterialTheme extends BaseTheme {

    public MaterialTheme() {
        super();
    }

    @Override
    public void loadFonts() {
        font = new Font(new java.awt.Font("dialog", fontSize, fontSize));
    }

    public BaseButton createButton(int x, int y, int w, int h) {
        return new MaterialButton(x, y, w, h);
    }

    @Override
    public BaseSlider createSlider(int x, int y, int w, int h) {
        return new MaterialSlider(x, y, w, h);
    }
}
