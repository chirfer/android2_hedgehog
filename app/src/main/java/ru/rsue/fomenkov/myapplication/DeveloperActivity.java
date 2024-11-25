package ru.rsue.fomenkov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeveloperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developer);
    }
    public void Click(View view) {
        Intent intent = new Intent(DeveloperActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}