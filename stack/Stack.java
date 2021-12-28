package com.company.stack;

import com.company.arrayList.Arraylist;

public class Stack {
    private final Arraylist arr;
    private int index;

    public Stack(){
        this.arr = new Arraylist();
        this.index = -1;
    }

    public void push(int value){
        this.arr.push(value);
        this.index++;
    }

    public void pop(){
        if(this.index == -1) return;
        this.arr.pop();
        this.index--;
    }

    public void clear(){
        this.arr.clear();
    }

    public int size(){
        return this.arr.size();
    }


    public void print(){
        for (int i = this.arr.size() -1; i >= 0 ; i--)
            System.out.println(this.arr.get(i));
    }
}
