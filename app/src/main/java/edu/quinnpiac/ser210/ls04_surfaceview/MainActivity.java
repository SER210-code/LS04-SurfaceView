package edu.quinnpiac.ser210.ls04_surfaceview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }

public class GameView extends SurfaceView{

    private SurfaceHolder holder;
    public GameView(Context context) {
        super(context);
         holder = getHolder();
         holder.addCallback(new SurfaceHolder.Callback() {
             @Override
             public void surfaceCreated(SurfaceHolder surfaceHolder) {

             }

             @Override
             public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

             }

             @Override
             public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

             }
         });
    }

}
}

