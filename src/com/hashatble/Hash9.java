package com.hashatble;

public class Hash9 {
    private int size=10;
    private Node[] datamap;
    class Node {
        int key;
        Node next;
        String value;
        Node (int key,String value){
            this.key=key;
            this.value=value;
        }

    }
    Hash9 (){
        datamap = new Node[size];
    }

//    1.Seperate chaining.
//    public int hash(int key){
//        int k=key;
//        int hash=0;
//        hash = (hash+k)% datamap.length;
//        return hash;
//    }

//    2.Linear probing
    public int  hash(int key){
        int k=key;
        int hash=0;
        hash=hash+k;
        return hash;
    }



//    1.Seperate chaining
//    public void set(int key,String value){
//        int index=hash(key);
//        Node newnode = new Node(key,value);
//        if(datamap[index]==null){
//            datamap[index]=newnode;
//
//        }
//        else{
//            Node temp=datamap[index];
//            while(temp.next!=null){
//                temp=temp.next;
//            }
//            temp.next=newnode;
//        }
//    }

//    2.Linear probing
    public void set(int key,String value){
        int val=hash(key);
        int index=val%size;
        Node newnode = new Node(key,value);
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
        int index=hash(key);
        Node temp=datamap[index];
        while(temp!=null){
            if(temp.key==key){
                return temp.value;
            }
            temp=temp.next;

        }
        return null;
    }

    public void print () {
        for (int i = 0; i < datamap.length; i++) {
            System.out.print(i + ": ");
            Node temp = datamap[i];
            while (temp != null) {
                System.out.print( temp.key + " " + temp.value+" , ");
//                System.out.println();
                temp = temp.next;
            }
            System.out.println( );
        }
        System.out.println();
    }
}
class Hash9imp{
    public static void main(String[] args) {
        Hash9 newhash=new Hash9();
        newhash.set(6,"Aravind");
//        newhash.set(5,"Arun");
        newhash.set(1,"Anand");
        newhash.set(78,"Arya");
        newhash.set(27,"Veena");
        newhash.set(14,"Sreekanth");
        newhash.set(57,"Adarsh");
        newhash.set(67,"Shyam");
        newhash.set(65,"Manikuttan");
//        newhash.set(98,"Ashik");


        newhash.print();
//        System.out.println(newhash.get(57));
    }
}
