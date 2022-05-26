package com.example.app13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    int level=1;
    TextView textViewLevel;
    FrameLayout frameLayoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        init();
        start();

    }

    public void start(){
        switch (level){
            case 1:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container_view, LevelTwoFragment.class, null)
                        .commit();
                frameLayoutBackground.setBackground(getDrawable(R.color.leveOne));
                break;
            case 2:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container_view, LevelFiveFragment.class, null)
                        .commit();
                frameLayoutBackground.setBackground(getDrawable(R.color.leveTwo));
                break;
            case 3:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container_view, LevelOneFragment.class, null)
                        .commit();
                frameLayoutBackground.setBackground(getDrawable(R.color.leveThree));
                break;
            case 4:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container_view, LevelThreeFragment.class, null)
                        .commit();
                frameLayoutBackground.setBackground(getDrawable(R.color.leveFour));
                break;
            case 5:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container_view, LevelFourFragment.class, null)
                        .commit();
                frameLayoutBackground.setBackground(getDrawable(R.color.leveFive));
                break;
        }
        textViewLevel.setText(String.valueOf(level));
    }

    public void init(){
        textViewLevel = findViewById(R.id.textViewNextLevel);
        frameLayoutBackground = findViewById(R.id.frame_layout_back);
    }

    public void onClickButtonHome(View view){
        startActivity(new Intent(GameActivity.this, StartActivity.class));
    }
}