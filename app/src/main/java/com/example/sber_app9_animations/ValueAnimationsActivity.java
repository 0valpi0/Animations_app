package com.example.sber_app9_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ValueAnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animations);

        ImageView imageView = findViewById(R.id.imageView);

        //alpha
        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0f, 1f);
        configureAnimating(alphaAnimator);
        alphaAnimator.addUpdateListener(animation -> imageView.setAlpha((Float) animation.getAnimatedValue()));
        alphaAnimator.start();

        // translation y
        float length = (-1f) * getResources().getDimension(R.dimen.y_length);
        ValueAnimator translationYAnimator = ValueAnimator.ofFloat(0f, length);
        configureAnimating(translationYAnimator);
        translationYAnimator.addUpdateListener(animation -> imageView.setTranslationY((Float) animation.getAnimatedValue()));
        translationYAnimator.start();
    }

    private void configureAnimating(ValueAnimator animator) {
        animator.setRepeatCount(10);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setDuration(800);
    }
}
