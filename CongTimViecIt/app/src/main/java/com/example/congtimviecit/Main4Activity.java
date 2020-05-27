package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button mHen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mHen=(Button)findViewById(R.id.btnHen);
        mHen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this, "Chúc mừng bạn đã hẹn lịch thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
