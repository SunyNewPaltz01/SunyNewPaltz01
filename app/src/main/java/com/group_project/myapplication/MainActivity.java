package com.group_project.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        run.setHeight(180);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToRecord(View view) {
        Intent i = new Intent(this, NewRecordActivity.class);
        startActivity(i);
    }

    public void goToSettings(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}
