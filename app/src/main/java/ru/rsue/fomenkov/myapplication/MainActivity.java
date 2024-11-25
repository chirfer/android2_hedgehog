package ru.rsue.fomenkov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private ImageButton startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = (TextView) findViewById(R.id.helloText);
        startButton = (ImageButton) findViewById(R.id.startButton);
    }

    public void onStartButtonClick(View view) {
        startButton.setImageResource(R.drawable.start_button_foreground);
        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }

    public void Click(View view) {
        Intent intent = new Intent(MainActivity.this, DeveloperActivity.class);
        startActivity(intent);
        finish();
    }

}