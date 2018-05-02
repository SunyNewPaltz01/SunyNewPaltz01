package com.group_project.myapplication;

/**
 * Created by Finn on 01/05/2018.
 */
public class run {

    public static OList l = new OList();
    public static int height;

    // called from the settings to change the program user's height
    public static void setHeight(int h) {
        height = h;
    }

    public static int getHeight() {
        return height;
    }

}