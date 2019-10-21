package com.example.sber_app9_animations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleClick(R.id.animation_drawable, AnimationDrawableActivity.class);
        handleClick(R.id.view_animations, ViewAnimationsActivity.class);
        handleClick(R.id.value_animations, ValueAnimationsActivity.class);
        handleClick(R.id.object_animations, ObjectAnimationsActivity.class);
        handleClick(R.id.customView_animations, CustomViewAnimationsActivity.class);

//        FinanceProgressView financeProgressView = findViewById(R.id.finance_progress);
//        int mProgress = 180;
//        financeProgressView.setmProgress(mProgress);

    }

    private void handleClick(@IdRes int viewId, final Class<? extends Activity> activityClass) {
        findViewById(viewId).setOnClickListener(
                v -> startActivity(new Intent(MainActivity.this, activityClass))
        );
    }
}
