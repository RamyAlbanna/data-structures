package com.company.arrayList;

public class Arraylist {
    private int[] arr;
    private int initialSize;
    private int lastIndexUsed;

    public Arraylist(){
        this.lastIndexUsed = -1;
        this.initialSize = 5;
        this.arr = new int[this.initialSize];
    }

    public int get(int index){
        if(this.lastIndexUsed == -1 || index < 0) return -1;
        return this.arr[index];
    }

    public int size(){
        return this.lastIndexUsed + 1;
    }
    private void generateNewArray(){
        this.initialSize *= 2;
        int[] newArr = new int[initialSize];
        for (int i = 0; i <= lastIndexUsed; i++){
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public void traverse(){
        for(int i = 0; i <= lastIndexUsed; i++){
            System.out.println(this.arr[i]);
        }
    }

    public void add(int index, int value){
        if(index < 0 || (index > this.lastIndexUsed && this.lastIndexUsed != -1)) return;
        if(this.lastIndexUsed == this.initialSize - 1) this.generateNewArray();
        for (int i = this.lastIndexUsed; i >= index; i--){
            this.arr[i+1] = this.arr[i];
        }
        this.arr[index] = value;
        this.lastIndexUsed++;
    }

    public void push(int value){
        if(this.lastIndexUsed +1 == this.initialSize) this.generateNewArray();
        this.arr[this.lastIndexUsed+1] = value;
        this.lastIndexUsed++;
    }

    public void pop(){
        this.lastIndexUsed--;
    }

    public void remove(int index){
        if(index < 0) return;
        if(index == this.lastIndexUsed) this.pop();
        else{
            for (int i = index; i <= this.lastIndexUsed; i++){
                this.arr[i] = this.arr[i+1];
            }
            this.lastIndexUsed--;
        }

    }

    public void reverse(){
        for (int i = 0,j = this.lastIndexUsed; i <= this.lastIndexUsed/2 && j>=0; i++,j--){
            int temp = this.arr[i];
            this.arr[i] = this.arr[j];
            this.arr[j] = temp;
        }
    }

    public void clear(){
        this.lastIndexUsed = -1;
        this.initialSize = 10;
    }
}
