package examples.etyl.gui.list;


import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.Panel;
import com.harium.etyl.ui.ScrollView;
import com.harium.etyl.ui.Select;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.list.Option;
import com.harium.etyl.ui.panel.ColoredTextPanel;
import com.harium.etyl.ui.style.Orientation;

public class ComponentsList extends Application {

    public ComponentsList(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        Select select = new Select(10, 80, 160, 26);
        select.addOption(new Option("pt-br", "Portuguese"));
        select.addOption(new Option("en-us", "English"));
        select.addOption(new Option("es-es", "Spanish"));
        UI.add(select);

        Panel panel = new Panel(0, 0, 400, 400);
        panel.setOrientation(Orientation.VERTICAL);
        panel.add(new ColoredTextPanel(0, 0, 0, 0));

        ScrollView scrollView = new ScrollView(180, 180, 400, 200);
        scrollView.setComponent(panel);
        UI.add(scrollView);

		/*OptionPanel optionPanel = new OptionPanel(400,40,200,200);
		
		optionPanel.addOption(new Option("pt-BR", "Portuguese"));
		optionPanel.addOption(new Option("en-us","English"));
		optionPanel.addOption(new Option("es-es","Spanish" ));

		addView(optionPanel);*/

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
		/*g.setColor(Color.RED);
		g.fillRect(x, y, w, h);*/
    }
}
