package com.group_project.myapplication;

/**
 * Created by Finn on 01/05/2018.
 */
//OList.java
public class OList {
    private Node2 start;// starting node of the list
    private int size;// size of the list

    // constructor
    public OList() {
        start = null;
        size = 0;
    }

    public void insert(Record y) {
        Node2 curr = null;
        Node2 newnode = null;

        Node2 newNode = new Node2(y, null);

        if (size == 0) {
            start = newNode;
            size++;
            return;
        }

        // search for the end of the list
        curr = start;// initialize the search at the beginning of the list
        while ((curr.getLink() != null)) {
            curr = curr.getLink();
        }
        curr.setLink(newNode);
        size++;
    }

    public void del(Record y) // search for first occurance of value y, and remove
    {
        Node2 curr = null;
        Node2 save = null;

        // search for first occurance of y
        curr = start;
        while (curr != null) {
            save = curr;
            curr = curr.getLink();
        }
        if (curr == null) {
            System.out.println("no deletion: " + y + " not on list");
        } else {
            size--;
            if (curr == start) {
                start = curr.getLink();// deletion at the beginning
            } else {
                save.setLink(curr.getLink());// delete the current node:
                // previous node points to following node
            }
        }
    }

    public void printListBasic() {
        Node2 curr = start;
        System.out.println("list contents: ");
        while (curr != null) {
            Record out = (Record) curr.getData();
            System.out.println(out.toString());
            curr = curr.getLink();
        }
        System.out.println(" ");
    }

    public void printList() {
        Node2 curr = start;
        System.out.println("list contents: ");
        while (curr != null) {
            Record out = (Record) curr.getData();
            System.out.println(out.getWeight());
            curr = curr.getLink();
        }
        System.out.println(" ");
    }

    public int getSize() {
        return size;
    }

    public Node2 getStart() {
        return start;
    }

    public Record getData(int i) {
        Node2 curr = start;
        for (int j = 1; j < i; j++) {
            curr = curr.getLink();
        }
        return (Record) curr.getData();
    }

    public Record[] getTopThree() {

        Node2 save1, save2, save3;
        save1 = start;
        int k;
        for (k = 1; k < size - 3; k++) {
            save1 = save1.getLink();
        }
        save2 = save1.getLink();
        save3 = save2.getLink();

        Record top3[] = {
                save1.getData(),
                save2.getData(),
                save3.getData()
        };

        return top3;
    }

    public Record getTop() {
        Node2 r = start;
        for(int k = 1; k < size; k++) {
            r.getLink();
        }
        return r.getData();
    }

}
