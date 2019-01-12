package com.manoranjank.iceb;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class spash extends AppCompatActivity {

    TextView loadTEXT;
    ImageView loadImage,loadlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.

        loadImage=(ImageView) findViewById(R.id.loadimg);
        loadTEXT=(TextView) findViewById(R.id.loadtxt);
        loadlogo=(ImageView) findViewById(R.id.imagelogo);

        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.anim);
        loadlogo.startAnimation(myanim);
        loadTEXT.startAnimation(myanim);
        loadImage.startAnimation(myanim);
        final Intent myint=new Intent(this,ScrollingActivity.class);
        Thread timer=new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(myint);
                    finish();
                }
            }
        };
        timer.start();

    }
}
