package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {
    Button mSearch;
    String arr[]={
            "Tất cả",
            "Quận 1",
            "Quận 2",
            "Quận 3",
            "Quận 4",
            "Quận 5",
            "Quận 6",
            "Quận 7",
            "Quận 8",
            "Quận 9",
            "Quận 10",
            "Quận 11",
            "Quận 12",
            "Quận Gò Vấp",
            "Quận Phú Nhuận",
            "Quận Thủ Đức",
            "Quận Bình Tân",
            "Quận Tân Bình",
            "Quận Bình Thạnh"};
    TextView selection;
    String arr1[]={
            "Tất cả",
            "MOBILE DEV",
            "ANDROID",
            "IOS",
            "WINDOW",
            "LINUX",
            "UBUNTU",
            "HTML5",
            "CSS3",
            "JAVASCRIPT"};
    TextView selection1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearch = (Button) findViewById(R.id.SeachBn);
        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, ListMain2Activity.class);
                startActivity(registerIntent);
            }
        });


        //spinner dia diem
        selection =(TextView) findViewById(R.id.slcDiaDiem);
        //Lấy đối tượng Spinner ra
        Spinner spin=(Spinner) findViewById(R.id.spinDiaDiem);
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arr
                );
        //phải gọi lệnh này để hiển thị danh sách cho Spinner
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        //Thiết lập adapter cho Spinner
        spin.setAdapter(adapter);

        //spinner CV
        selection1 =(TextView) findViewById(R.id.slcCV);
        //Lấy đối tượng Spinner ra
        Spinner spin1=(Spinner) findViewById(R.id.spinCV);
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arr1
                );
        //phải gọi lệnh này để hiển thị danh sách cho Spinner
        adapter1.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        //Thiết lập adapter cho Spinner
        spin1.setAdapter(adapter1);

    }
}


