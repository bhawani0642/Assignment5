package com.acadgild.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This function handles the starting of animation.
     * On the activity_main.xml i have done mapping of button
     * @param view
     */
    public void StartAnimation(View view){

        EditText editText= (EditText)findViewById(R.id.editText3);//Gets textBox reference

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);//get the Animation
        editText.startAnimation(animation);//Started the animation
    }
}
