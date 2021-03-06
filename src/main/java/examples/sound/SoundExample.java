package examples.sound;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.sound.MultimediaLoader;
import examples.sound.application.SyntheticAudioApplication;

public class SoundExample extends Etyl {

    /**
     * The serial version id
     */
    private static final long serialVersionUID = 5663760293144882635L;

    /**
     * Default constructor for the window
     */
    public SoundExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        SoundExample example = new SoundExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        addLoader(MultimediaLoader.getInstance());

        initialSetup("../../");

        //return new PlaySoundApplication(w,h);
        return new SyntheticAudioApplication(w, h);
    }

}
