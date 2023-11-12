package com.stackexercise2;

public class Stack4 {
    private int length;
    private Node front;
    private Node back;
    class  Node{

        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public void Enqueue(int value){
        Node newnode = new Node(value);
        if(length==0){
            front=newnode;
            back=newnode;
        }
        else {
            back.next=newnode;
            back=newnode;
        }
        length++;
    }

    public Node Dequeue(){
        if(length==0){
            return null;

        }
        Node temp=front;
        if(length==1){
            front=null;
            back=null;
        }
        else {
            temp=front;
            front=front.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public void print (){
        Node temp=front;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

class impStackq{
    public static void main(String[] args) {
        Stack4 newstack=new Stack4();
        newstack.Enqueue(78);
        newstack.Enqueue(48);
        newstack.Enqueue(98);
        newstack.Enqueue(88);
        newstack.Enqueue(18);

        newstack.print();
    }
}
