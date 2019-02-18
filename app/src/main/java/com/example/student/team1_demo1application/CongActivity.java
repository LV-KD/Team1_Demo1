package com.example.student.team1_demo1application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CongActivity extends AppCompatActivity {
EditText edtSoA, edtSoB, KQ;
Button btnCong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong);
        anhxa();
    }
    void anhxa(){
        edtSoA = findViewById(R.id.edt_Soa);
        edtSoB = findViewById(R.id.edt_Sob);
        KQ = findViewById(R.id.edt_Kq);
        btnCong = findViewById(R.id.btn_Cong);
    }
    public void Cong2so(View view) {
        String A,B;
        int tong;
        A = edtSoA.getText().toString();
        B = edtSoB.getText().toString();
        tong = Integer.parseInt(A)+Integer.parseInt(B);
        KQ.setText(tong+"");

    }
}
