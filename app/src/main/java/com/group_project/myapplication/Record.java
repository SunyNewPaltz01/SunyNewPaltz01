package com.group_project.myapplication;

/**
 * Created by Finn on 01/05/2018.
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Record implements Comparable<Record> {
    // All data is stored in metric
    private double bmi;
    private double weight;
    private double caloriesBurned;
    private String date;

    public Record(double weight, int timeWalked) {
        // BMI is calculated and stored as metric
        this.weight = weight;
        bmi = weight/run.height;

        Date d = new Date();
        SimpleDateFormat dF = new SimpleDateFormat("EEEE, MMMM d, YYYY");
        date = dF.format(d);

        caloriesBurned = ((weight * 2 * 3.5)/200)*timeWalked;
    }

    public int compareTo(Record r) {
        // TODO Auto-generated method stub
        return 0;
    }

    // Returns the imperial bmi
    public double bmiI() {
        return bmi*703;
    }

    // Returns the mertic bmi
    public double bmiM() {
        return bmi;
    }

    public double getWeight() {
        return weight;
    }

    public String getDate() {
        return date;
    }

}
