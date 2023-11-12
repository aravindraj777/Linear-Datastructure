package com.stackexercise2;

import java.util.Stack;

public class Stackreverse2 {

    public static void main(String[] args) {

        String str = "CBA";
        System.out.println("Before reversing :"+str);
        System.out.println("After reversing:  `"+reverse(str));

    }

    public static String reverse(String str){


        Stack <Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i=0;i<str.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
