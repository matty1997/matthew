package com.example.michelsherif.thermonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"IPhone", "Android", "Windows", "Blackberry", "Linux"};

        ArrayList<String> listValues = new ArrayList<String>();
        for (int i = 0; i < values.length; i++) {
            listValues.add(values[i]);
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.activity_list_item, listValues);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListActivity.this,DeviceDetailActivity.class);
                startActivity(i);
            }
        });
    }
}
