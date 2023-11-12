package com.hashtablelinear;

public class Hash3 {
    private int size=10;
    private Node [] datamap;
    class Node {
        int key;
        String value;
        Node next;
        Node (int key,String value){
            this.key = key;
            this.value = value;
        }
    }
    Hash3 (){
        datamap = new Node[size];
    }

//    1.Seperate chaining

//    public int  hash(int key){
//        int k=key;
//        int hash=0;
//        hash = (hash+k)%datamap.length;
//        return hash;
//    }
//
//    2.Linear Probiing

    public int hash(int key){
        int k=key;
        int hash=0;
        hash = (k+hash);
        return hash;
    }

//    1.Seperate Chaining

    public void Set(int key,String value){
        Node newnode = new Node(key, value);
        int index = hash(key);

        if(datamap[index]==null){
            datamap[index]=newnode;
        }
        else{
            Node temp = datamap[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

//    2.linear probing

//    public void Set(int key,String value){
//        Node newnode = new Node(key, value);
//        int val = hash(key);
//        int index = val % size;
//
//        if(datamap[index]==null){
//            datamap[index]=newnode;
//        }
//        else {
//            for(int i=0;i<size;i++){
//                index = (val+i)%size;
//                if(datamap[index]==null){
//                    datamap[index]=newnode;
//                    break;
//                }
//            }
//        }
//    }

//    1.Seperate chaining

//    public String Get(int key){
//        int index = hash(key);
//        Node temp=datamap[index];
//        while(temp!=null){
//            if(temp.key==key){
//                return temp.value;
//            }
//            temp = temp.next;
//        }
//        return null;
//    }

//    2.Linear probing

    public  String Get(int key){
        int val = hash(key  );
        int index = val % size;

        if(datamap[index].key == key){
            return datamap[index].value;
        }
        else{
            for(int i=0;i<size;i++){
                index = (val+i) % size;
                if(datamap[index].key == key){
                    return datamap[index].value;
                }
            }
        }
        return null;
    }

    public void print(){
        for(int i=0;i<datamap.length;i++){
            System.out.print(i+" :");
            Node temp = datamap[i];
            while(temp!=null){
                System.out.print(" "+temp.key+" "+temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

class Minimphash3{
    public static void main(String[] args) {

        Hash3 newhash = new Hash3();
        newhash.Set(45,"Aravind");
        newhash.Set(45,"Adarsh");
        newhash.Set(45,"Sreekanth");
        newhash.Set(45,"Irfan");
        newhash.Set(45,"Arun");
        newhash.Set(15,"Ganga");

        newhash.print();
        System.out.println();
        System.out.println(newhash.Get(15));

    }
}
