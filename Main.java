package com.company;

import com.company.arrayList.Arraylist;

public class Main {

    public static void main(String[] args) {
        Arraylist arraylist = new Arraylist();
        arraylist.push(15);
        arraylist.push(23);
        arraylist.push(21);
        arraylist.push(10);
        arraylist.push(20);
        arraylist.reverse();
        arraylist.traverse();
    }
}
