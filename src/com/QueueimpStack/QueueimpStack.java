package com.QueueimpStack;

import java.util.Stack;

public class QueueimpStack {

    public  Stack<Integer> s1;
    public  Stack<Integer> s2;


    public QueueimpStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void add(int value){
        s1.push(value);
    }

    public int  remove(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int removed = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return removed;
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }



}

class  imp{
    public static void main(String[] args) {
        QueueimpStack newQueue = new QueueimpStack();
        newQueue.add(90);
        newQueue.add(6);
        newQueue.add(45);
        newQueue.add(62);
        newQueue.add(10);
        newQueue.add(20);

        System.out.println(newQueue.isEmpty());
        System.out.println(newQueue.remove());
        System.out.println(newQueue.s1);


    }
}
