package com.stackexercise2;

public class Stack2 {
    private  int height;
    public Node top;
    class  Node {
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public void push(int value){
        Node newnode =new Node(value);
        if(height==0){
            top=newnode;
        }
        else{
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
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;

        }
    }

    public void reverseprint(Node top){

        if(top==null){
            return;
        }
        reverseprint(top.next);
        System.out.print(top.value+" ");
    }
}

class  mainn{
    public static void main(String[] args) {
        Stack2 newstack=new Stack2();
        newstack.push(45);
        newstack.push(9);
        newstack.push(10);
        newstack.push(44);
        newstack.push(17);
        newstack.push(54);
        newstack.push(87);

        newstack.pop();

        newstack.print();

        newstack.reverseprint(newstack.top);
    }

}
