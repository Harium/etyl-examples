package examples.etyl.sound;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class AudioCaptureExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public AudioCaptureExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        AudioCaptureExample app = new AudioCaptureExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        initialSetup("../../");
        return new AudioCaptureApplication(w, h);
    }

}
