package com.example.student.team1_demo1application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHieu2So;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHieu2So = (Button) findViewById(R.id.btn_Tru);

        btnHieu2So.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ThTru2So.class);
                startActivity(intent);
            }
        });
    }

    public void Cong(View view) {
        Intent intent = new Intent(this, CongActivity.class);
        this.startActivity(intent);
    }
}
