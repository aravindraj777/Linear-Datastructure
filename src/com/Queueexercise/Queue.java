package com.Queueexercise;

public class Queue {
    private  int length;
    private Node first ;
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
        if (length==0){
            first=newnode;
            last=newnode;
        }
        else {
            last.next=newnode;
            last = newnode;
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
        }else {
            first=first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void print (){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

class  imp{
    public static void main(String[] args) {
        Queue newQueue=new Queue();
        newQueue.enqueue(78);
        newQueue.enqueue(98);
        newQueue.enqueue(87);
        newQueue.enqueue(54);
        newQueue.enqueue(8);
        newQueue.enqueue(18);

        newQueue.dequeue();
        newQueue.print();

//        newQueue.print();

    }

}
