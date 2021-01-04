package com.example.android_num_17_listviewdynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] cities = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> dynamic = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, cities);
        ListView listView = (ListView)findViewById(R.id.list1);
        listView.setAdapter(dynamic);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                TextView set_text = (TextView)findViewById(R.id.set_msg);
                set_text.setText("你選了: " + cities[position]);
            }
        });
    }
}