import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;

import edu.quinnpiac.ser210.ls04_surfaceview.MainActivity;
import edu.quinnpiac.ser210.ls04_surfaceview.R;

/**
 * Created by relkharboutly on 2/1/2018.
 */

public class GameLoopThread extends Thread {
    private MainActivity.GameView view;
    private Bitmap bmp;
    private boolean running = false; //used to stop the game

    public GameLoopThread(MainActivity.GameView view) {
        this.view = view;
        bmp = BitmapFactory.decodeResource(view.getResources(), R.mipmap.ic_launcher);

    }

    public void setRunning(boolean run) {
        running = run;
    }

    @Override
    public void run() {
        while (running) {

            Canvas c = view.getHolder().lockCanvas(null);
            synchronized (view.getHolder()) {
                c.drawColor(Color.BLACK);
                c.drawBitmap(bmp, 10, 10, null);
            }
            view.getHolder().unlockCanvasAndPost(c);

        }
    }
}

