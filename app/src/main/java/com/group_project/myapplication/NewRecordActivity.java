package com.group_project.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class NewRecordActivity extends AppCompatActivity {

    EditText weightInput;
    EditText timeWalkedInput;
    Button newRecord;

    String weightStr;
    String timeWalkedStr;

    double weight;
    int timeWalked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);

        //create java object and point to xml component
        weightInput = (EditText) findViewById(R.id.weight);
        timeWalkedInput = (EditText) findViewById(R.id.timeWalked);
        newRecord = (Button) findViewById(R.id.next);

        newRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weightStr = weightInput.getText().toString();
                timeWalkedStr = timeWalkedInput.getText().toString();

                if(weightStr != null) {
                    weight = Double.parseDouble(weightStr);
                }

                if(timeWalkedStr != null) {
                    timeWalked = Integer.parseInt(timeWalkedStr);
                }

                //Call the builder to create a record
                Builder.Build(weight, timeWalked);

                Intent i = new Intent(NewRecordActivity.this, Confirmation.class);
                i.putExtra("weight", weight);
                i.putExtra("timeWalked", timeWalked);
                startActivity(i);
            }
        });
    }

}
