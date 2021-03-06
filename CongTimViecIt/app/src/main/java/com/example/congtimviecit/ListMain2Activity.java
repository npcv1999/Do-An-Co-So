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

public class ListMain2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main2);
        List<Item> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.ListVL);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                if(position ==0)
                {
                    Intent registerIntent = new Intent(ListMain2Activity.this, Main3Activity.class);
                    startActivity(registerIntent);
                }
                if(position ==1)
                {
                    Intent registerIntent = new Intent(ListMain2Activity.this, Main3aActivity.class);
                    startActivity(registerIntent);
                }
            }
        });
    }

    private  List<Item> getListData() {
        List<Item> list = new ArrayList<Item>();
        Item inno = new Item("Innotech", "800 - 2,000 USD","inno", "Mobile Dev (Android, iOS, React Native)");
        Item shinhan = new Item("Shinhan Finance Vietnam", "500 - 1,800 USD","shinhan", "Mobile Dev (Android, iOS, React Native)");
        Item zalo = new Item("Zalo careers","700 - 1,500 USD", "zalo", "Mobile Dev (Android, iOS, React Native)");
        Item vnpt = new Item("VNPT Media Software","600 - 1,700 USD", "vnpt", "Mobile Dev (Android, iOS, React Native)");

            list.add(inno);
            list.add(shinhan);
            list.add(zalo);
            list.add(vnpt);
            list.add(shinhan);
            list.add(vnpt);
            list.add(shinhan);
            list.add(zalo);
            list.add(inno);
            list.add(shinhan);
            return list;




    }

}

