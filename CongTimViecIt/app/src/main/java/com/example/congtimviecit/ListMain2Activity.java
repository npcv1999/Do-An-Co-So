package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class ListMain2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main2);
        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.ListVL);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(ListMain2Activity.this, "Bạn vừa chọn công ty :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Innotech", "inno", "Mobile Dev (Android, iOS, React Native)");
        Country usa = new Country("Shinhan Finance Vietnam", "shinhan", "Mobile Dev (Android, iOS, React Native)");
        Country russia = new Country("Zalo careers", "zalo", "Mobile Dev (Android, iOS, React Native)");
        Country china = new Country("VNPT Media Software", "vnpt", "Mobile Dev (Android, iOS, React Native)");



        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(china);
        list.add(usa);
        list.add(vietnam);

        return list;
    }

}

