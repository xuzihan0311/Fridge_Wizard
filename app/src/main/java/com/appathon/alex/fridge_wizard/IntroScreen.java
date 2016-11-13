package com.appathon.alex.fridge_wizard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import controller.fridgeController;

/**
 * Created by bigjohnlin on 11/13/2016.
 */

public class IntroScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        fade();
        animate();
    }
    public void fade(){
        ImageView image = (ImageView)findViewById(R.id.rock);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation1);
        animation1.reset();
    }

    Thread introThread;

    private void animate() {


        introThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Intro screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 60;
                    }
                    Intent intent = new Intent(IntroScreen.this,
                            fridgeController.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    IntroScreen.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    IntroScreen.this.finish();
                }
            }
        };
        introThread.start();
    }
}
