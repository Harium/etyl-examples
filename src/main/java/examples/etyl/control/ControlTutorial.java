package examples.etyl.control;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class ControlTutorial extends Etyl {

	private static final long serialVersionUID = 1L;

	public ControlTutorial(int width, int height) {
		super(width, height);
	}
	
	public static void main(String[] args) {
		ControlTutorial example = new ControlTutorial(800, 600);
		example.init();
	}

	@Override
	public Application startApplication() {
		return new TouchJoystickExample(w, h);
	}

}
