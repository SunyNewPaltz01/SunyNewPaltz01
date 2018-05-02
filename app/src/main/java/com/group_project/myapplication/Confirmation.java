package com.group_project.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    TextView showWeight;

    Record r = run.l.getTop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        TextView textView = (TextView) findViewById(R.id.bmi);
        textView.setText(Double.toString(r.bmiM()));
    }
}
