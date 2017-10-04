package com.example.admin.customlayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private ListView lv;
    String[] name = {
            "Viet Nam",
            "Han Quoc",
            "Anh",
            "Nhat Ban"
    };
    Integer[] imgId={
            R.drawable.java,
            R.drawable.js,
            R.drawable.js,
            R.drawable.java,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.lv);

        CustomAdapter adapter = new CustomAdapter(this, name, imgId);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, name[position],Toast.LENGTH_SHORT).show();
            }
        });


    }
}
