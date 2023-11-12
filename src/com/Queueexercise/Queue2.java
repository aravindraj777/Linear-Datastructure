package com.Queueexercise;

public class Queue2 {
    private  int length;
    private Node first;
    private Node last;

    class  Node {
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public void enqueue(int value){
        Node newnode =new Node(value);
        if(length==0){
            first=newnode;
            last=newnode;
        }
        else {
            last.next=newnode;
            last=newnode;
        }
        length++;
    }

    public  Node dequeue(){
        if (length==0){
            return null;
        }
        Node temp=first;
        if (length==1) {
            first = null;
            last = null;
        }
        else {

            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public  void print(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }

    }
}

class impQueue2{
    public static void main(String[] args) {
        Queue2 queue2=new Queue2();
        queue2.enqueue(12);
        queue2.enqueue(87);
        queue2.enqueue(45);
        queue2.enqueue(78);
        queue2.enqueue(54);

        queue2.print();
        System.out.println();
        queue2.dequeue();
        queue2.print();
    }
}