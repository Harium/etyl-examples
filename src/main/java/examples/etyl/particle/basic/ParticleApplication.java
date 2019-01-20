package examples.etyl.particle.basic;

import com.harium.etyl.core.context.SceneApplication;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.effects.particle.BasicEmitter;

public class ParticleApplication extends SceneApplication {

    private BasicEmitter emitter;

    public ParticleApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        emitter = new BasicEmitter(w / 2, h / 2);
        emitter.setAngle(90);
        emitter.setVariance(90);

        scene.addEmitter(emitter);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub

    }

}
