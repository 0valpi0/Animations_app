package com.example.sber_app9_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimationDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_drawable);

        ImageView horseImageView = findViewById(R.id.horse_image_view);
        horseImageView.post(
                        () -> ((AnimationDrawable) horseImageView.getDrawable()).start()
        );

    }
}
