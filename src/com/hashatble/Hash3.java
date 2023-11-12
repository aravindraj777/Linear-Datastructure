package com.hashatble;

import java.util.stream.Stream;

public class Hash3 {
    private Node datamap[];
    private int size=8;
    class Node {
        int key;
        String value;
        Node next;

        Node (int key,String value){
            this.key=key;
            this.value=value;

        }
    }
    Hash3(){
        datamap=new Node[size];
    }

    public int hash(int key){
        int hash=0;
        int k=key;
        hash=(hash+k)%datamap.length;
        return hash;
    }

    public void set(int key, String value){
        Node newnode =new Node(key, value);
        int index=hash(key);
        if(datamap[index]==null){
            datamap[index]=newnode;

        }
        else{
            Node temp=datamap[index];
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newnode;
        }

    }


        public void print() {
        for (int i = 0; i < datamap.length; i++) {
            System.out.println(i + " :");
            Node temp = datamap[i];
            while (temp != null){
                System.out.println(temp.key+" "+temp.value);
                temp=temp.next;
            }
        }
        }


}

class main3{
    public static void main(String[] args) {

        Hash3 newhash = new Hash3();
        newhash.set(4,"Sreekanth");
        newhash.set(14,"Arun");
        newhash.set(10,"Aravind");
        newhash.set(7,"soosan");
        newhash.set(5,"irfan");
        newhash.set(55,"Shyam");
        newhash.print();

    }
}
