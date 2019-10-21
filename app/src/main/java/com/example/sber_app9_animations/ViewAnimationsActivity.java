package com.example.sber_app9_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class ViewAnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animations);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_and_scale);
        findViewById(R.id.imageView).startAnimation(animation);
    }
}
