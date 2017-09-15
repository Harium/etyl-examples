package examples.ui.spinner.application;

import java.util.ArrayList;
import java.util.List;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.spinner.IntegerSpinner;
import com.harium.etyl.ui.spinner.StringSpinner;

public class SpinnerExampleApplication extends Application{

	public SpinnerExampleApplication(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
				
		IntegerSpinner spinnerMaxPlayers = new IntegerSpinner(280, 100, 200, 40);
		spinnerMaxPlayers.setValue(1);
		spinnerMaxPlayers.setMaxValue(4);
		spinnerMaxPlayers.setMinValue(1);
		UI.add(spinnerMaxPlayers);
		
		List<String> options = new ArrayList<String>();
		options.add("Forest");
		options.add("Mountain");
		options.add("Snow");		
		
		StringSpinner spinnerSelectMap = new StringSpinner(280, 160, 200, 40);
		spinnerSelectMap.setOptions(options);
		UI.add(spinnerSelectMap);
		
		loading = 100;
	}

	@Override
	public void draw(Graphics g) {
		
	}
}
