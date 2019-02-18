package com.example.student.team1_demo1application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cong(View view) {
        Intent intent = new Intent(this, CongActivity.class);
        this.startActivity(intent);
    }
}
