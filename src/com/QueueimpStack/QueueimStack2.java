package com.QueueimpStack;

import java.util.Stack;

public class QueueimStack2 {

    public Stack<Integer> s1;
    public Stack<Integer> s2;

    QueueimStack2(){
        s1 = new Stack<>();
        s2 = new Stack<>();

    }

    public void add(int value){
       s1.push(value);

    }
    public  int  remove(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int removed = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return removed;
    }

    public  int  peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int peeked = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return peeked;
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
}

class imp2{
    public static void main(String[] args) {

        QueueimStack2 newQueue = new QueueimStack2();
        newQueue.add(99);
        newQueue.add(78);
        newQueue.add(89);
        newQueue.add(25);
        newQueue.add(14);
        newQueue.add(12);

//        System.out.println(newQueue.remove());
        System.out.println(newQueue.s1);

    }
}
