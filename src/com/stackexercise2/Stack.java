package com.stackexercise2;

public class Stack {

    private  int height;
    private Node top;
    class Node{

        int value;
        Node next;
         Node(int value){
             this.value=value;
         }
    }

    public  void push(int value){
        Node newnode=new Node(value);
        if(height==0){
            top=newnode;
        }
        else {
            newnode.next=top;
            top=newnode;
        }
        height++;
    }
    public Node  pop(){
        if(height==0){
            return null;
        }
        else {
            Node temp=top;
            top=top.next;
            temp.next=null;
            height--;
            return temp;
        }
    }

    public void print (){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

class main{
    public static void main(String[] args) {
        Stack mystack=new Stack();
        mystack.push(90);
        mystack.push(67);
        mystack.push(54);
        mystack.push(12);
        mystack.pop();
        mystack.print();
    }
}
