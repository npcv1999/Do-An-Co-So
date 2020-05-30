package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainUngVien2Activity extends AppCompatActivity {
    TextView mten;
    TextView msdt;
    TextView memail;
    TextView mdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ungvien1);
        mten=(TextView)findViewById(R.id.txtName);
        msdt=(TextView)findViewById(R.id.txtPhone);
        memail=(TextView)findViewById(R.id.txtEmail);
        mdate=(TextView)findViewById(R.id.txtDate);
        mten.setText("Trần Như Phát");
        msdt.setText("0345678912");
        memail.setText("phat@gmail.com");
        mdate.setText("06/06/2020");

    }
}

