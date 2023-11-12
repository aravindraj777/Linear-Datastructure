package com.hashatble;

public class Hash4 {

    private int size=9;
    private Node [] datamap;
    class  Node{
        int key;
        String  value;
        Node next;
        Node (int key,String value){
            this.key=key;
            this.value=value;
        }
    }
    Hash4(){
        datamap = new Node[size];

    }

    public int hash(int key){
        int hash=0;
        int k=key;
        hash=(hash+key)%datamap.length;
        return hash;
    }

    public void set(int key,String value){
        int index=hash(key);
        Node newnode = new Node(key, value);
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
    public void print(){

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

class mainhash4{
    public static void main(String[] args) {
        Hash4 newhash = new Hash4();
        newhash.set(47,"Athul");
        newhash.set(10,"Jithin");
        newhash.set(5,"Sheet");
        newhash.set(2,"Anu");
        newhash.set(1,"Nandhu");
        newhash.set(24,"Aravind");

        newhash.print();
    }
}
