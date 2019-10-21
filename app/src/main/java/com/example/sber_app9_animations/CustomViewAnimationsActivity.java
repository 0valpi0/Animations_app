package com.example.sber_app9_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class CustomViewAnimationsActivity extends AppCompatActivity {

    private ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animations);

        FinanceProgressView financeView = findViewById(R.id.finance_progress);
        mAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.custom_object_animation);
        mAnimator.setTarget(financeView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAnimator.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAnimator.end();
    }
}
