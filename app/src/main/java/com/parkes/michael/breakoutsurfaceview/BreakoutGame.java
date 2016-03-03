package com.parkes.michael.breakoutsurfaceview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by MPARKES on 3/3/2016.
 */
public class BreakoutGame extends AppCompatActivity {

    BreakoutView breakoutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Initialize gameView and set it as the view
        breakoutView = new BreakoutView(this);
        setContentView(breakoutView);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class BreakoutView extends SurfaceView {

        public SurfaceHolder GameHolder;

        int ScreenSizeX;
        int ScreenSizeY;

        Paddle P;
        Ball B;
        Canvas canvas;
        Paint paint;

        public BreakoutView(Context context) {
            super(context);
            GameHolder = getHolder();

            paint = new Paint();

            Display disp = getWindowManager().getDefaultDisplay();


        }

        public BreakoutView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public BreakoutView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

    }


}
