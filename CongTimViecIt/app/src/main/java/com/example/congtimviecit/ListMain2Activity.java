package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;

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
                Object o = listView.getItemAtPosition(position);
                Item country = (Item) o;
                Toast.makeText(ListMain2Activity.this, "Bạn vừa chọn công ty :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Item> getListData() {
        List<Item> list = new ArrayList<Item>();
        Item inno = new Item("Innotech", "800 - 2,000 USD","inno", "Mobile Dev (Android, iOS, React Native)");
        Item shinhan = new Item("Shinhan Finance Vietnam", "500 - 1,800 USD","shinhan", "Mobile Dev (Android, iOS, React Native)");
        Item zalo = new Item("Zalo careers","700 - 1,500 USD", "zalo", "Mobile Dev (Android, iOS, React Native)");
        Item vnpt = new Item("VNPT Media Software","600 - 1,700 USD", "vnpt", "Mobile Dev (Android, iOS, React Native)");


        //TextView selection =(TextView) findViewById(R.id.slcDiaDiem);
        //TextView selection1 =(TextView) findViewById(R.id.slcCV);
        //String dd = selection.getText().toString().trim();
        //String lv = selection1.getText().toString().trim();
        //if(dd.equals("Bình Thạnh") && lv.equals("MOBILE DEV"))
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

