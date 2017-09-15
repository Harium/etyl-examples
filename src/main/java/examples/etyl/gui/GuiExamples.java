package examples.etyl.gui;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.etyl.gui.list.TableView;
import examples.etyl.gui.textview.TextViewExample;


public class GuiExamples extends Etyl {

    private static final long serialVersionUID = 1L;

    public GuiExamples() {
        super(640, 480);
    }

    public static void main(String[] args) {
        GuiExamples app = new GuiExamples();
        app.init();
    }

    @Override
    public Application startApplication() {
        //Change Theme
        //ThemeManager.getInstance().setTheme(new EtyllicTheme());

        //return new GeneralGuiExample(w,h);
        //return new ComponentsList(w,h);
        return new TableView(w, h);
        //return new TextViewExample(w, h);
        //return new TextFieldExample(w,h);
        //return new SliderExample(w,h);
    }

}
