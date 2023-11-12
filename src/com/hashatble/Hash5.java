package com.hashatble;

import java.util.concurrent.LinkedBlockingDeque;

public class Hash5 {
    private int size=10;
    private Node [] datamap;
    class  Node {
        int key;
        String value;
        Node next;
        Node (int key,String value){
            this.key=key;
            this.value=value;
        }

    }
    Hash5(){
        datamap=new Node[size];

    }
    public int  hash(int key){
        int hash=0;
        int k=key;
        hash= (hash+k)%datamap.length;
        return hash;
    }

    public void set(int key,String value){
        Node newnode = new Node(key, value);
        int index=hash(key);
        if(datamap[index]==null)
        {
            datamap[index]=newnode;
        }
        else {
            Node temp=datamap[index];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void print (){
        for(int i=0;i<datamap.length;i++){
            System.out.println(i+" :");
            Node temp=datamap[i];
            while(temp!=null){
                System.out.println(temp.key+" "+temp.value);
                temp=temp.next;
            }
        }
    }
}

class impHash5{
    public static void main(String[] args) {
        Hash5 newhash = new Hash5();
        newhash.set(17,"Aravind");
        newhash.set(12,"irafan");
        newhash.set(6,"Arya");
        newhash.set(15,"Sreekanth");
        newhash.set(87,"Arun");
        newhash.set(41,"Adarash");
        newhash.print();
    }
}
