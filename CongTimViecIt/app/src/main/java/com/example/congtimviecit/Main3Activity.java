package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button mNop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        List<Item> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.lsvDetail);
        listView.setAdapter(new CustomListAdapter(this, image_details));
        mNop=(Button) findViewById(R.id.btnNop);
        mNop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(registerIntent);
            }
        });
    }

    private List<Item> getListData() {
        List<Item> list = new ArrayList<Item>();
        Item inno = new Item("Innotech", "800 - 2,000 USD","inno", "Mobile Dev (Android, iOS, React Native)");
        list.add(inno);
        return list;
    }
}
