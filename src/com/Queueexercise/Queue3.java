package com.Queueexercise;

public class Queue3 {
    private Node first;
    private Node last;
    private int length;


    class Node {
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public void Enqueue(int value){
        Node newnode =new Node(value);
        if(length==0){
            first = newnode;
            last  = newnode;
        }
        else {
            last.next=newnode;
            last=newnode;
        }
        length++;
    }

    public Node dequeue(){
        if(length==0){
            return null;
        }
        Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }
        else {
            temp=first;
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public void print (){
        Node temp=first;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

class impQueue3{
    public static void main(String[] args) {
        Queue3 newQueue=new Queue3();
        newQueue.Enqueue(90);
        newQueue.Enqueue(50);
        newQueue.Enqueue(40);
        newQueue.Enqueue(80);
        newQueue.Enqueue(10);

        newQueue.print();
        System.out.println();
        newQueue.dequeue();
        newQueue.print();
    }
}
