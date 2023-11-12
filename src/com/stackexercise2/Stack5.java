package com.stackexercise2;

public class Stack5 {

    private  int heigth;
    private Node top;

    class Node {
        int value;
        Node next;
        Node (int value){
            this.value=value;
        }
    }

    public void push(int value){
        Node newnode = new Node(value);
        if(heigth==0){
            top=newnode;

        }else {
            newnode.next=top;
            top=newnode;

        }
        heigth++;
    }

    public Node  pop(){
        if(heigth==0){
            return null;
        }
        else {
            Node temp=top;
            top=top.next;
            temp.next=null;
            heigth--;
            return temp;
        }
    }

    public void print(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

class  impstack5{

    public static void main(String[] args) {
        Stack5 newstack=new Stack5();

        newstack.push(45);
        newstack.push(4);
        newstack.push(25);
        newstack.push(65);
        newstack.push(10);
        newstack.push(78);

        newstack.print();
        System.out.println();

        newstack.pop();
        newstack.print();
    }


}
