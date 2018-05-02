package com.group_project.myapplication;

/**
 * Created by Finn on 01/05/2018.
 */
//Node2.java

public class Node2
{
    private Record data;
    private Node2 link;

    //constructor
    public Node2(Record newData, Node2 linkValue)
    {
        data = newData;
        link = linkValue;
    }

    public Record getData()
    {
        return data;
    }

    public Node2 getLink()
    {
        return link;
    }

    public void setData(Record y)
    {
        data = y;
    }

    public void setLink(Node2 linkValue)
    {
        link = linkValue;
    }

}
