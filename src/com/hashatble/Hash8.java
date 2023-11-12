package com.hashatble;

public class Hash8 {
    private int size=10;
    private Node [] datamap;
    class Node {
        int key;
        String value;
        Node next;
        Node(int key,String value){
            this.key=key;
            this.value=value;

        }
    }
    Hash8(){
        datamap = new Node[size];
    }

    public int hash(int key){
        int k=key;
        int hash=0;
        hash=(hash+key)%datamap.length;
        return hash;
    }
    public void set(int key,String value) {
        int index = hash(key);
        Node newnode = new Node(key, value);
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
    public void print(){
        for(int i=0;i< datamap.length;i++){
            System.out.print(i+":");
            Node temp=datamap[i];
            while(temp!=null){
                System.out.print(" "+temp.key+"-"+temp.value);
                System.out.print(",");
                temp=temp.next;
            }
            System.out.println();
        }

    }


    public String get(int key){
        int index=hash(key);
        Node temp=datamap[index];
        while(temp!=null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }

}

class mainhash8{
    public static void main(String[] args) {

        Hash8 newhash = new Hash8();
        newhash.set(18,"Athulajith");
        newhash.set(25,"Nandhu");
        newhash.set(7,"Anusasi");
        newhash.set(17,"Athulsheet");
        newhash.set(16,"Athul");
        newhash.set(23,"Jithin");
        newhash.set(10,"Aravind");
        newhash.set(77,"Shyam");
        newhash.set(4,"sreejith");
        newhash.set(4,"Aravindraj");



        newhash.print();
        System.out.println();
        System.out.println(newhash.get(4));




    }
}
