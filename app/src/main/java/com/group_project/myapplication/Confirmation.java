package com.group_project.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    TextView showBMI;
    TextView showWeightChange;
    TextView showCaloriesBurned;
    TextView showCalorieIntake;

    Record record = run.l.getTop();

    int height = run.getHeight();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        showBMI = findViewById(R.id.showBMI);
        showBMI.setText(String.format("%.2f", record.bmiM()));

//        showWeightChange = findViewById(R.id.showWeightChange);
//        showWeightChange.setText(Double.toString(record.bmiM()));
//
//        showCaloriesBurned = findViewById(R.id.showCaloriesBurned);
//        showCaloriesBurned.setText(Double.toString(record.bmiM()));
//
//        showCalorieIntake = findViewById(R.id.showCalorieIntake);
//        showCalorieIntake.setText(Double.toString(record.bmiM()));
//
    }

}
