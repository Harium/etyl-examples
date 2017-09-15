package examples.etyl.interpolation;
import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class InterpolationExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public InterpolationExample() {
		super(800, 600);
	}

	public static void main(String[] args){
		InterpolationExample viewer = new InterpolationExample();
		viewer.init();
	}
	
	@Override
	public Application startApplication() {
		initialSetup("../../../");

		return new InterpolationApplication(w,h);
	}

}

