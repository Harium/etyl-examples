package examples.etyl.particle.basic;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class ParticleExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ParticleExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        ParticleExample app = new ParticleExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new ParticleApplication(w, h);
    }

}
