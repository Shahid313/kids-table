package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_table);

        LinearLayout relay = new LinearLayout(this);
        relay.setOrientation(LinearLayout.VERTICAL);


        Bundle getData = getIntent().getExtras();
        String result = getData.getString("tableNumber");
        if(result.equals("Two")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("2 x "+ i + " = " + i*2);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Three")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("3 x "+ i + " = " + i*3);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Four")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("4 x "+ i + " = " + i*4);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Five")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("5 x "+ i + " = " + i*5);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Six")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("6 x "+ i + " = " + i*6);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Seven")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("7 x "+ i + " = " + i*7);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Eight")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("8 x "+ i + " = " + i*8);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Nine")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("9 x "+ i + " = " + i*9);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }else if(result.equals("Ten")){
            for(int i = 1; i<=10;i++){
                TextView TablePara = new TextView(this);
                TablePara.setText("10 x "+ i + " = " + i*10);
                TablePara.setTextSize(30);
                TablePara.setGravity(Gravity.CENTER_HORIZONTAL);
                relay.addView(TablePara);

            }

            setContentView(relay);
        }


    }
}