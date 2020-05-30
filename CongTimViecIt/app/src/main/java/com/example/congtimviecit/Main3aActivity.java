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

public class Main3aActivity extends AppCompatActivity {
    Button mNop;
    TextView txtIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3a);
        List<Selected> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.lsvDetail);
        listView.setAdapter(new CustomSelectAdapter(this, image_details));

        txtIn=(TextView) findViewById(R.id.txtInno);
        String htmlcontent =
                "<h1><font color=\"red\">Mô tả công việc</font></h1>" +
                        "<h2>Yêu cầu công việc</h2>"+
                        "<ul><li><p>Có ít nhất 3 năm kinh nghiệm phát triển ứng dụng di động </li><li>Trải nghiệm ít nhất một trong các khung Java/ORM sau: Struts, Spring, Seam, JPA, Hibernate/NHibernate, Entity Framework</li><li>Kinh ngiệm trong iOS, Android</li><li>Kinh nghiệm trong REST/SOAP</li><li>Kinh nghiệm về Swift Objective-C và Java khi làm việc trên Oracle, MS SQL, MySQL, đặc biệt là Oracle PLQuery là một lợi thế</li></ul>";

        txtIn.setText(android.text.Html.fromHtml(htmlcontent));
        mNop=(Button) findViewById(R.id.btnNop);
        mNop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Main3aActivity.this, Main4Activity.class);
                startActivity(registerIntent);
            }
        });
    }

    private List<Selected> getListData() {
        List<Selected> list = new ArrayList<Selected>();
        Selected shinhan = new Selected("Shinhan Finance Vietnam", "500 - 1,800 USD","shinhan", "Mobile Dev (Android, iOS, React Native)","475A, Điện Biên Phủ, P.25, Bình Thạnh");
        list.add(shinhan);
        return list;
    }
}
