package com.example.congtimviecit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainNvActivity extends AppCompatActivity {

    Button mbtnDangViec;
    Button mbtnCacCV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nv);
        mbtnDangViec=(Button)findViewById(R.id.btnDangViec);
        mbtnCacCV=(Button)findViewById(R.id.btnCacCV);
        mbtnDangViec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainNvActivity.this, MainNv2Activity.class);
                startActivity(Intent);
            }
        });
        mbtnCacCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainNvActivity.this, ListUngVienActivity.class);
                startActivity(Intent);
            }
        });

    }
}
