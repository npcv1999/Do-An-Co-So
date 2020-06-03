package com.example.congtimviecit;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
public class ListUngVienActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ungvien);
        List<Ungvien> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.lsvUngvien);
        listView.setAdapter(new CustomUngVienAdapter(this, image_details));
        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                if(position ==0)
                {
                    Intent registerIntent = new Intent(ListUngVienActivity.this, MainUngVien1Activity.class);
                    startActivity(registerIntent);
                }
                if(position ==1)
                {
                    Intent registerIntent = new Intent(ListUngVienActivity.this, MainUngVien2Activity.class);
                    startActivity(registerIntent);
                }
                if(position ==2)
                {
                    Intent registerIntent = new Intent(ListUngVienActivity.this, MainUngVien3Activity.class);
                    startActivity(registerIntent);
                }
            }
        });

    }

    private  List<Ungvien> getListData() {
        List<Ungvien> list = new ArrayList<Ungvien>();
        Ungvien cv = new Ungvien("Nguyễn Phạm Chí Vinh","cv");
        Ungvien p = new Ungvien("Trần Như Phát","p");
        Ungvien ha = new Ungvien("Bạch Hải Âu","ha");
        list.add(cv);
        list.add(p);
        list.add(ha);
        return list;
}
}
