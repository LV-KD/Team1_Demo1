package com.example.student.team1_demo1application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ThTru2So extends AppCompatActivity {
    private Button btnTinhHieu;
    private EditText edtSoA,edtSoB;
    private TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th_tru2_so);

        btnTinhHieu = (Button)findViewById(R.id.btn_TinhHieu);
        edtSoA = (EditText) findViewById(R.id.edt_SoA);
        edtSoB = (EditText)findViewById(R.id.edt_SoB);
        tvKQ = (TextView)findViewById(R.id.tv_KQ);

        btnTinhHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvKQ.setText((Integer.parseInt(edtSoA.getText().toString())-Integer.parseInt(edtSoB.getText().toString()))+"");
            }
        });
    }
}
