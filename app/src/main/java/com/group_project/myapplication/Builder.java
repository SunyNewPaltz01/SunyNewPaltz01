package com.group_project.myapplication;

/**
 * Created by Finn on 01/05/2018.
 */
public final class Builder {
    public static void Build(double weight, int timeWalked) {
        Record r = new Record(weight, timeWalked);
        run.l.insert(r);

    }
}
