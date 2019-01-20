package examples.geometry.line;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.geometry.line.application.ElasticLineApplication;

public class LineExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public LineExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        LineExample example = new LineExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        return new ElasticLineApplication(w, h);
    }

}
