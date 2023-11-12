package com.hashatble;

public class hash1 {
    private  Node[] datamp;
    private int size=8;

    class Node{
        int key;
        String value;
        Node next;

        Node(int key,String value ){
            this.value=value;
            this.key=key;
        }
    }

    public void print (){
        for(int i=0;i< datamp.length;i++){
            System.out.println(i+":");
            Node temp=datamp[i];
            System.out.println(temp.key+" "+temp.value);
            temp=temp.next;
        }
    }

    public int  hashfun(int key){
        int hash=0;
        int k =key;
        hash=(hash+key)% datamp.length;

        return hash;
    }

    public void set(int key,String value){
        int index=hashfun(key);
        Node newnode = new Node(key, value);
        if(datamp[index]==null){
            datamp[index]=newnode;
        }
        else {
            Node temp=datamp[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;


        }

           }
}
