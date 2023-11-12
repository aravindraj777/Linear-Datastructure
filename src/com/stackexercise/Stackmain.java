package com.stackexercise;

public class Stackmain {
    public static void main(String[] args) {

        Stack newstack=new Stack();
        newstack.push(10);
        newstack.push(80);
        newstack.push(67);
        newstack.push(23);
        newstack.push(11);

        newstack.pop();
        newstack.print();

    }


}
