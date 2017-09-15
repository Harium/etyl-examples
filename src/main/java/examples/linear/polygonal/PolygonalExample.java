package examples.linear.polygonal;

import examples.linear.polygonal.application.PolygonalMultiArea;
import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class PolygonalExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public PolygonalExample() {
		super(640, 480);
	}
	
	public static void main(String[] args){
		PolygonalExample example = new PolygonalExample();
		example.init();
	}
	
	@Override
	public Application startApplication() {
		return new PolygonalMultiArea(w,h);
	}
	
}
