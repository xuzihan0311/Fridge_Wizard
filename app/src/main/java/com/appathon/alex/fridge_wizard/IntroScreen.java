package com.appathon.alex.fridge_wizard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by bigjohnlin on 11/13/2016.
 */

public class IntroScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        animate();
    }

    Thread introThread;

    private void animate() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.background);
        anim.reset();
        LinearLayout lay = (LinearLayout) findViewById(R.id.layout1);
        lay.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.move_up);
        anim.reset();
        ImageView text = (ImageView) findViewById(R.id.intro);
        text.startAnimation(anim);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.move_up2);
        ImageView fridge = (ImageView) findViewById(R.id.fridge_animation);
        fridge.startAnimation(anim1);

        introThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Intro screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 70;
                    }
                    Intent intent = new Intent(IntroScreen.this,
                            FridgeController.class);
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
