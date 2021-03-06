package examples.etyl.customloading.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;

public class ByeWorld extends Application {

    public ByeWorld(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        //Simulating Loads
        fakeLoad();
    }

    private void fakeLoad() {

        while (loading < 100) {

            loading += 3;

            if (loading < 30) {

                loadingInfo = "Loading Nothing...";

            } else if (loading < 50) {

                loadingInfo = "Loading Something...";

            } else if (loading < 90) {

                loadingInfo = "Almost Loaded...";

            } else if (loading >= 100) {
                loading = 100;

                return;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void draw(Graphics g) {

        //Set Background Color
        g.setColor(Color.WHITE);

        //Draw Background
        g.fillRect(0, 0, w, h);

        g.setColor(Color.FOREST_GREEN);

        //Write at center with shadow
        g.drawStringShadowX("Bye World!", 100);

        //Write at center with shadow
        g.drawStringShadowX("Press <BACK SPACE> to go back.", 300);
    }

    @Override
    public void updateKeyboard(KeyEvent event) {
        if (event.isKeyDown(KeyEvent.VK_BACK_SPACE)) {
            nextApplication = new CustomLoadApplication(w, h);
        }
    }

}
