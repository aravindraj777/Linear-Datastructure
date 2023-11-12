package com.hashtablelinear;

import java.time.chrono.MinguoDate;

public class hash {
    private int size=10;
    private Node [] datamap;
    class Node {

        int key;
        String value;
        Node next;
        Node (int key,String value){
            this.key=key;
            this.value=value;
        }
    }
    hash(){
        datamap = new Node[size];
    }

    public int hash(int key){
        int k=key;
        int hash=0;
        hash = (hash+k);
        return hash;
    }

    public void set(int key, String value){
        Node newnode = new Node(key, value);
        int val=hash(key);
        int index=val%size;

        if(datamap[index]==null){
            datamap[index]=newnode;
        }
        else {
            for(int i=0;i<size;i++){
            index=(val+i)%size;
            if(datamap[index]==null){
                datamap[index]=newnode;
                break;
            }
            }
        }

    }
    public String get(int key){
        int val=hash(key);
        int index = val%size;

        if(datamap[index].key==key){
            return datamap[index].value;
        }
        else{

            for(int i=0;i<size;i++){
                index=(val+i)%size;
                if(datamap[index].key==key){
                    return datamap[index].value;

                }
            }
        }
        return null;
    }
    public void print(){
        for(int i=0;i<datamap.length;i++){
            System.out.print(i+":");
            Node temp= datamap[i];
            while(temp!=null){
                System.out.println(" "+temp.key+" "+temp.value+", ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
class mainhash{
    public static void main(String[] args) {
        hash newhash = new hash();
        newhash.set(45,"Munna");
        newhash.set(45,"Manju");
        newhash.set(45,"Chinju");
        newhash.set(45,"Renju");
        newhash.set(45,"Kunju");
        newhash.set(45,"Anju");
        newhash.set(45,"Achu");

        newhash.print();



    }
}
