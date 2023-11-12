package com.hashatble;

import javax.management.StringValueExp;

public class Hash2 {

    private  Node[] datamap;
    private int size=7;

    class Node{
        int key;
        String value;
        Node next;
        Node(int key,String value){
            this.key=key;
            this.value=value;
        }
    }
    Hash2(){
        datamap=new Node[size];
    }

    public void set(int key, String value){
        int index=hash(key);
        Node newnode=new Node(key,value);
        if(datamap[index]==null){
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


    public int hash(int key){
        int hash=0;
        int k=key;
        hash=(hash+key)%datamap.length;
        return hash;
    }

    public void print(){
        for(int i=0;i<datamap.length;i++){
            System.out.println(i+": ");
            Node temp=datamap[i];
            while(temp!=null){
                System.out.println(temp.key+" "+temp.value);
                temp=temp.next;
            }
        }
    }

}
class Hash2main{

    public static void main(String[] args) {
        Hash2 newhash=new Hash2();
        newhash.set(2,"Arav");
        newhash.set(5,"Shyam");
        newhash.set(1,"Sreekanth");
        newhash.set(4,"Araya");
        newhash.set(7,"Laaa");

        newhash.print();
    }

}
