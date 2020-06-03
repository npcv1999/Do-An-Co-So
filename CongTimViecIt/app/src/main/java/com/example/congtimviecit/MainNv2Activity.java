package com.example.congtimviecit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainNv2Activity extends AppCompatActivity {
    Button mdangviec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nv2);
        mdangviec=(Button)findViewById(R.id.btnDang);
        mdangviec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainNv2Activity.this,"Bạn đã đăng thành công",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
