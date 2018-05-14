package com.group_project.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    TextView switchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        switchResults = (TextView) findViewById(R.id.textViewSwitchResults);
    }

    // add preference for imperial or metric and save
    public void imperialMetric(View view)
    {
        // yada
        boolean imperial = ((Switch) view).isChecked(); // ((Something) new).isSilly()

        if (imperial)
        {
            // set to imperial in preferences
            SharedPreferences sharedPreferences = getSharedPreferences("userSettings", Context.MODE_PRIVATE);

            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString("textHeight", "in");
            editor.putString("textWeight", "lb");
            editor.apply();

            Toast.makeText(this, "Imperial", Toast.LENGTH_LONG).show();

            showUserSettings();
        }
        else
        {
            // set to metric " "
            SharedPreferences sharedPreferences = getSharedPreferences("userSettings", Context.MODE_PRIVATE);

            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString("textHeight", "cm");
            editor.putString("textWeight", "kg");
            editor.apply();

            Toast.makeText(this, "Metric", Toast.LENGTH_LONG).show();

            showUserSettings();
        }
    }

    public void showUserSettings()
    {
        // stuff
        SharedPreferences sharedPreferences = getSharedPreferences("userSettings", Context.MODE_PRIVATE);

        String textHeight = sharedPreferences.getString("textHeight", "notSet");
        String textWeight = sharedPreferences.getString("textWeight", "notSet");

        switchResults.setText(textHeight + " " + textWeight);
    }
}
