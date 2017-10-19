package examples.etyl.filechooser;
import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class FilechooserExample extends Etyl {
	private static final long serialVersionUID = 1L;
	
	public FilechooserExample() {
		super(800, 450);
	}

	public static void main(String[] args) {
		FilechooserExample app = new FilechooserExample();
		app.init();
	}

	@Override
	public Application startApplication() {
		return new FilechooserApplication(w,h);
	}

}
