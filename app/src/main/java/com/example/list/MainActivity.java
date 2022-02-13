package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView tablesList = findViewById(R.id.tables);

        ArrayList<String> alltables = new ArrayList<>();
        alltables.add("Two");
        alltables.add("Three");
        alltables.add("Four");
        alltables.add("Five");
        alltables.add("Six");
        alltables.add("Seven");
        alltables.add("Eight");
        alltables.add("Nine");
        alltables.add("Ten");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alltables);
        tablesList.setAdapter(arrayAdapter);

        tablesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String tableNumber = ((TextView)view).getText().toString();

                Intent intent = new Intent(getApplicationContext(), TableActivity.class);
                intent.putExtra("tableNumber",tableNumber);
                startActivity(intent);
            }
        });


    }
}