package com.company.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.tail = new Node(null);
        this.head = new Node(null);
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Integer value){
        Node newNode = new Node(value);
        if(this.head.getNext() == null){
            this.head.setNext(newNode);
        }else{
            this.tail.getNext().setNext(newNode);
        }
        this.tail.setNext(newNode);
        this.size++;
    }

    public void pop(){
        if(this.size == 0) return;
        Node currentNode;
        currentNode = this.head.getNext();
        for (int i = 0; i < this.size - 2; i++){
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(null);
        this.tail.setNext(currentNode);
        this.size--;
    }

    public void remove(Integer value){
        Node currentNode;
        currentNode = this.head.getNext();

        if(currentNode.getValue().equals(value)){
            this.head.setNext(currentNode.getNext());
            this.size--;
            return;
        }

        while(currentNode.getNext() != null && !currentNode.getNext().getValue().equals(value)){
            currentNode = currentNode.getNext();
        }

        if(currentNode.getNext() == null) return;

        currentNode.setNext(currentNode.getNext().getNext());

        this.size--;
    }

    public void traverse(){
        if(this.size == 0) return;
        Node currentNode;
        currentNode = this.head;
        while (currentNode.getNext() != null){
            System.out.println(currentNode.getNext().getValue());
            currentNode = currentNode.getNext();
        }
    }

    public int sum(){
        int sum = 0;
        Node current = this.head.getNext();
        while(current.getNext() != null){
            sum += current.getValue();
            current = current.getNext();
        }
        sum += current.getValue();
        return sum;
    }

    public double average(){
        return (double)sum()/this.size;
    }

    private void sort(boolean isAsc){
        Node current = this.head.getNext();
        for (int i = 0; i < this.size;i++){
            for (int j = (i+1); j < this.size;j++){
                if(!isAsc){
                    if(current.getNext() != null && (current.getValue() < current.getNext().getValue())){
                        int temp = current.getValue();
                        current.setValue(current.getNext().getValue());
                        current.getNext().setValue(temp);
                    }
                }else{
                    if(current.getNext() != null && (current.getValue() > current.getNext().getValue())){
                        int temp = current.getValue();
                        current.setValue(current.getNext().getValue());
                        current.getNext().setValue(temp);
                    }
                }
                current = current.getNext();
            }
            current = this.head.getNext();
        }
    }

    public void sortAsc(){
        this.sort(true);
    }
    public void sortDesc(){
        this.sort(false);
    }

    public void clear(){
        this.head = new Node(null);
        this.tail = new Node(null);
        this.size = 0;
    }
}
