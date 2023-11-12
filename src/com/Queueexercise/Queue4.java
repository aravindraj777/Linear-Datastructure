package com.Queueexercise;

public class Queue4 {


    private  int length;
    private Node first;
    private Node last;

    class Node{

        int value;
        Node next;
        Node (int value){
            this.value=value;
        }
    }

    public void enqueue(int value){
        Node newnode = new Node(value);

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

    public Node  Dequeue(){
        if (length==0){
            return null;
        }
        Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }
        else{
            temp=first;
            first=first.next;
            temp.next=null;

        }
        length--;
        return temp;
    }

    public void print(){
        Node temp=first;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

class Queue4imp{
    public static void main(String[] args) {
        Queue4 newQueue=new Queue4();
        newQueue.enqueue(10);
        newQueue.enqueue(87);
        newQueue.enqueue(78);
        newQueue.enqueue(45);
        newQueue.enqueue(55);

        newQueue.print();
        System.out.println();
        newQueue.Dequeue();
        newQueue.print();
    }
}
