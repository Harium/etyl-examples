package examples.etyl.animation.path;
import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class PathExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public PathExample() {
		super(800, 600);
	}

	public static void main(String[] args){
		PathExample viewer = new PathExample();
		viewer.init();
	}	
	
	@Override
	public Application startApplication() {
		initialSetup("../");

		return new PathBall(w,h);
	}

}

